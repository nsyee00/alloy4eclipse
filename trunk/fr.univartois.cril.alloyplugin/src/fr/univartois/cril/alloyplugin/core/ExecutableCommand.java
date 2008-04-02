package fr.univartois.cril.alloyplugin.core;import java.util.Arrays;import java.util.Comparator;import org.eclipse.core.resources.IFile;import org.eclipse.core.resources.IFolder;import org.eclipse.core.runtime.CoreException;import org.eclipse.jface.resource.ImageRegistry;import org.eclipse.swt.graphics.Image;import org.eclipse.swt.widgets.Display;import org.eclipse.ui.IWorkbenchPage;import org.eclipse.ui.IWorkbenchWindow;import org.eclipse.ui.PlatformUI;import edu.mit.csail.sdg.alloy4.ConstSet;import edu.mit.csail.sdg.alloy4.Err;import edu.mit.csail.sdg.alloy4.Pair;import edu.mit.csail.sdg.alloy4.Pos;import edu.mit.csail.sdg.alloy4compiler.ast.Command;import edu.mit.csail.sdg.alloy4compiler.ast.Expr;import edu.mit.csail.sdg.alloy4compiler.ast.Sig;import edu.mit.csail.sdg.alloy4compiler.parser.Module;import edu.mit.csail.sdg.alloy4compiler.translator.A4Solution;import edu.mit.csail.sdg.alloy4compiler.translator.TranslateAlloyToKodkod;import fr.univartois.cril.alloyplugin.AlloyPlugin;import fr.univartois.cril.alloyplugin.api.ALSImageRegistry;import fr.univartois.cril.alloyplugin.api.IALSCommand;import fr.univartois.cril.alloyplugin.api.IALSFile;import fr.univartois.cril.alloyplugin.api.IReporter;import fr.univartois.cril.alloyplugin.api.NodeWithChildren;import fr.univartois.cril.alloyplugin.api.Util;import fr.univartois.cril.alloyplugin.preferences.PreferenceConstants;import fr.univartois.cril.alloyplugin.views.VizView;/** * An Alloy command with its world and its resources. Can be executed. */public class ExecutableCommand extends AbstractCommand implements		NodeWithChildren {	/**	 * The command itself.	 */	protected final Command command;	/**	 * The formula associated with the command.	 */	protected final Expr formula;	/**	 * Constructor.	 */	public ExecutableCommand(IALSFile file2, Command command, Expr formula,			Module world) {		super(file2, world);		assert (file2 != null);		assert (command != null);		assert (formula != null);		assert (world != null);		this.command = command;		this.formula = formula;	}	/**	 * return the command.	 */	public Command getCommand() {		return command;	}	/**	 * Execute this command with te given reporter.	 */	public Pair<A4Solution, Boolean> execute(IReporter rep) throws Err {		rep.setExecCommand(this);		Iterable<Sig> sigs = world.getAllReachableSigs();		Expr fact = formula;		for (Module m : world.getAllReachableModules())			for (Pair<String, Expr> e : m.getAllFacts())				fact = fact.and(e.b);		A4Solution ans = TranslateAlloyToKodkod.execute_command(rep, sigs,				fact, command, getOptions());		this.ans = ans;		file.fireChange();		// if preference "show answer after execution" is enable, display answer		// in a Graphic thread:		if (AlloyPlugin.getDefault().getPreferenceStore().getBoolean(				PreferenceConstants.P_BOOLEAN_WRITE_SHOW_ANSWER)) {			displayAnsSafe();		}		return new Pair<A4Solution, Boolean>(ans, null != ans);	}	public Pair<A4Solution, Boolean> getAns() {		return new Pair<A4Solution, Boolean>(ans, null != ans);	}	public Image getIcon() {		// return command.check ?iconcheck:iconrun;		ImageRegistry reg = ALSImageRegistry.getImageRegistry();		if (getResult() == ExecutableCommand.SAT) {			if (isCheck()) {				if (isExpect())// expected sat check command					return reg.get(ALSImageRegistry.BLUE_CHECK_ID);				// not expected				// sat check				// command				return reg.get(ALSImageRegistry.RED_CHECK_ID);			}			// Sat Run command			return reg.get(ALSImageRegistry.GREEN_RUN_ID);		}		if (getResult() == ExecutableCommand.UNSAT) {			if (isCheck())				return reg.get(ALSImageRegistry.GREEN_CHECK_ID);// OK			if (getCommand().expects == 0)				return reg.get(ALSImageRegistry.BLUE_RUN_ID);			return reg.get(ALSImageRegistry.RED_RUN_ID);		}		if (isCheck())			return reg.get(ALSImageRegistry.CHECK_ID);		return reg.get(ALSImageRegistry.RUN_ID);	}	public void setAns(A4Solution ans) {		this.ans = ans;	}	public int getBeginLine() {		return command.pos.y;	}	public int getEndLine() {		return command.pos.y2;	}	public String getName() {		return command.toString();	}	public String toString() {		if (this.getResult() == IALSCommand.UNKNOW)			return command.toString();		if (this.getResult() != IALSCommand.SAT)			return command.toString() + " [UNSAT]";		return command.toString() + " [SAT]";	}	/**	 * Display answer.	 */	private void displayAns() throws Err {		if (ans.satisfiable()) {			IFolder outputFolder = getAnswerFolder("output");			if (outputFolder == null)				return;			IFile outputFile = outputFolder.getFile(getName() + ".xml");			if (!outputFile.exists()) {				try {					outputFile.create(null/* new byte[0] */, false, null);				} catch (CoreException e) {					AlloyPlugin.getDefault().log(e);				}			}			IWorkbenchWindow window = PlatformUI.getWorkbench()					.getActiveWorkbenchWindow();			IWorkbenchPage page = window.getActivePage();			String filename = Util.getFileLocation(outputFile);			ans.writeXML(filename);			String titlename = getName() + ", "					+ AlloyLaunching.getResourcePartName(getResource());			this.viewPart[0] = VizView.showAlloyVisualizationView(this, page,					outputFile, titlename);		}	}	// @author lionel desruelles	public void closeOldView() {		IFolder outputFolder = getAnswerFolder("output");		if (outputFolder == null)			return;		IFile outputFile = outputFolder.getFile(getName() + ".xml");		if (!outputFile.exists()) {			return;		} else {			IWorkbenchWindow window = PlatformUI.getWorkbench()					.getActiveWorkbenchWindow();			IWorkbenchPage page = window.getActivePage();			String titlename = getName() + ", "					+ AlloyLaunching.getResourcePartName(getResource());			this.viewPart[0] = VizView.showAlloyVisualizationView(this, page,					outputFile, titlename);			closeYourView();		}	}	/*	 * (non-Javadoc)	 * 	 * @see fr.univartois.cril.alloyplugin.api.IALSCommand#displayAnsSafe()	 */	public void displayAnsSafe() {		Display display = PlatformUI.getWorkbench().getDisplay();		if (display != null) {			display.asyncExec(new Runnable() {				public void run() {					try {						ExecutableCommand.this.displayAns();					} catch (Err e) {						AlloyPlugin.getDefault().log(e);					}				}			});		}	}	public boolean isCheck() {		return command.check;	}	public boolean isExpect() {		return (command.expects >= 1);	}	/*	 * (non-Javadoc)	 * 	 * @see fr.univartois.cril.alloyplugin.core.INextable#showNextA4Solution()	 */	// @author druelle romuald	public void showNextA4Solution() {		try {			ans = ans.next();		} catch (Err e) {			// TODO Auto-generated catch block			e.printStackTrace();		}		file.fireChange();		// if preference "show answer after execution" is enable, display answer		// in a Graphic thread:		if (AlloyPlugin.getDefault().getPreferenceStore().getBoolean(				PreferenceConstants.P_BOOLEAN_WRITE_SHOW_ANSWER)) {			displayAnsSafe();		}	}	public A4Solution accessAns() {		return ans;	}	public boolean shouldShowUnsatCore() {		return getResult() == ExecutableCommand.UNSAT;	}	public ConstSet<Pos> getCore() {		if (null == ans) {			return ConstSet.make();		} else {			return ans.lowLevelCore();		}	}	public Object[] children() {		ConstSet<Pos> poses = getCore();		UnsatCorePos[] children = new UnsatCorePos[poses.size()];		int i = 0;		for (Pos pos : poses) {			children[i++] = new UnsatCorePos(pos);		}		Arrays.sort(children, new Comparator<UnsatCorePos>() {			public int compare(UnsatCorePos o1, UnsatCorePos o2) {				return o1.getBeginLine() - o2.getBeginLine();			}		});		return children;	}	public boolean hasChildren() {		return shouldShowUnsatCore() && !getCore().isEmpty();	}	// @author lionel desruelles	public void closeOldVizView() {		Display display = PlatformUI.getWorkbench().getDisplay();		if (display != null) {			display.asyncExec(new Runnable() {				public void run() {					ExecutableCommand.this.closeOldView();				}			});		}	}}