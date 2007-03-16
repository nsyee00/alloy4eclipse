package fr.univartois.cril.alloyplugin.launch;

import org.eclipse.core.resources.IResource;

import edu.mit.csail.sdg.alloy4.A4Reporter;
import edu.mit.csail.sdg.alloy4.Err;
import edu.mit.csail.sdg.alloy4compiler.ast.Command;
import edu.mit.csail.sdg.alloy4compiler.ast.World;
import edu.mit.csail.sdg.alloy4compiler.translator.A4Options;
import edu.mit.csail.sdg.alloy4compiler.translator.A4Solution;
import edu.mit.csail.sdg.alloy4compiler.translator.TranslateAlloyToKodkod;
import fr.univartois.cril.alloyplugin.launch.util.Util;

/**
 * A command with its world and its resource. 
 * Can be executed.
 */
public class ExecutableCommand {

	public static final int SAT = 1;
	public static final int UNSAT = 2;
	public static final int UNKNOW = 0;
	/**
	 * The Command's world . 
	 */
	private World world;
	/**
	 * The command itself. 
	 */
	private Command command;
	/**
	 * The resource which has provided the command. 
	 */
	private IResource resource;
	/**
	 * An Options for execution. 
	 */
	private A4Options options;
	/**
	 * result can be executable.SAT executable.UNSAT or executable.UNKNOWN.
	 */
	private int result;

	/**
	 * Constructor. 
	 */
	public ExecutableCommand(IResource res,Command command, World world,A4Options options) {		
		if(options==null){
			this.options = new A4Options();		
			this.options.solver = A4Options.SatSolver.SAT4J;
		}
		else this.options=options;
		assert(res!=null);
		assert(command!=null);
		assert(world!=null);

		this.resource=res;

		this.world=world;
		this.command=command;
		result=UNKNOW;
	}

	/**
	 * Constructor. 
	 */
	public ExecutableCommand(IResource res,Command command, World world) {
		this(res,command,world,null);				
	}

	/**
	 * Get the option.
	 * */
	public A4Options getOptions(A4Reporter rep) {
		options.setReporter(rep);
		return options;
	}
	/**
	 * Display the text from command. 
	 */
	public String toString(){
		return command.toString();
	}
	/**
	 * Get the resource.
	 */
	public IResource getRes() {
		return resource;
	}    
	/**
	 *  Get the location of the file where this command is located.
	 */
	public String getFilename() {		
		return Util.getFileLocation(resource);		
	}
	/**
	 * return the world. 
	 */
	public World getWorld() {
		return world;
	}
	/**
	 * return the command. 
	 */
	public Command getCommand() {
		return command;
	}
	/**
	 * Return the result. 
	 */
	public int getResult() {		
		return result;		

	}
	/**
	 * Execute this command whith te given reporter.
	 * */
	public A4Solution execute(Reporter rep) throws Err {
		rep.setExecCommand(this);
		A4Solution ans = TranslateAlloyToKodkod.execute_command(getWorld(),getCommand(),getOptions(rep), null, null); 
		return ans;
	}

	/**
	 * set this Command sat. 
	 */
	public void setSat(boolean sat) {
		if (sat) result=SAT;
		else result=UNSAT;

	}

}