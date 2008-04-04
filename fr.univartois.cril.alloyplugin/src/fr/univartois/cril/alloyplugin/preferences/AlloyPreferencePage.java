package fr.univartois.cril.alloyplugin.preferences;


import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.jface.preference.RadioGroupFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import fr.univartois.cril.alloyplugin.AlloyPlugin;

/**
 * This class represents a preference page that is contributed to the
 * Preferences dialog. By subclassing <samp>FieldEditorPreferencePage</samp>,
 * we can use the field support built into JFace that allows us to create a page
 * that is small and knows how to save, restore and apply itself.
 * <p>
 * This page is used to modify preferences only. They are stored in the
 * preference store that belongs to the main plug-in class. That way,
 * preferences can be accessed directly via the preference store.
 */

public class AlloyPreferencePage extends FieldEditorPreferencePage implements
		IWorkbenchPreferencePage {

	public static final String PDF_GRAPH = "pdf";
	public static final String PNG_GRAPH = "png";

	private IntegerFieldEditor widthGraph;
	private IntegerFieldEditor resolutionGraph;
	private RadioGroupFieldEditor graphConversion;

	public AlloyPreferencePage() {
		super(GRID);
		setPreferenceStore(AlloyPlugin.getDefault().getPreferenceStore());
		setDescription("You can set up your Alloy preferences here:");
	}

	/**
	 * Creates the field editors. Field editors are abstractions of the common
	 * GUI blocks needed to manipulate various types of preferences. Each field
	 * editor knows how to save and restore itself.
	 */
	public void createFieldEditors() {
		/*
		 * addField(new DirectoryFieldEditor(PreferenceConstants.P_OUTPUT_PATH,
		 * "&Output.xml directory:", getFieldEditorParent()));
		 */

		addField(new BooleanFieldEditor(
				PreferenceConstants.P_BOOLEAN_WRITE_SHOW_ANSWER,
				"Automatically &Show graphical view of models or counter examples after command execution",
				getFieldEditorParent()));
		addField(new BooleanFieldEditor(
				PreferenceConstants.P_BOOLEAN_CLEAR_CONSOLE_FOR_EACH_COMMAND,
				"Clear console output before launching a command",
				getFieldEditorParent()));

		// @author lionel desruelles
		addField(new BooleanFieldEditor(
				PreferenceConstants.CLOSE_VIEW_UNSAT,
				"Remove old VizWiew when an assertion has no longer a counter example",
				getFieldEditorParent()));

		addField(new RadioGroupFieldEditor(
				PreferenceConstants.P_SOLVER_CHOICE,
				"Choose solver for commands:",
				1,
				new String[][] {
						{ "&SAT4J", PreferenceConstants.V_SOLVER_SAT4J },
						{ "&Berkmin", PreferenceConstants.V_SOLVER_BERKMIN },
						{ "MiniSatProver &JNI",
								PreferenceConstants.V_SOLVER_MiniSatProverJNI },
						{
								"MiniSatProver &Unsat Core",
								PreferenceConstants.V_SOLVER_MiniSatProverUnsatCore },
						{ "&ZChaffJNI", PreferenceConstants.V_SOLVER_ZChaffJNI } },
				getFieldEditorParent()));

		addField(new BooleanFieldEditor(
				PreferenceConstants.P_BOOLEAN_SHOW_DEBUG_MESSAGES,
				"Show &Debug Messages", getFieldEditorParent()));

		addField(graphConversion = new RadioGroupFieldEditor(
				PreferenceConstants.V_GRAPH_CONVERSION,
				"Choose graph conversion:", 1, new String[][] { { "pdf", "pdf" }, { "png", "png" } },
				getFieldEditorParent()));
		
		//graphConversion.setPropertyChangeListener(this);
		
		widthGraph = new IntegerFieldEditor(PreferenceConstants.WIDTH__GRAPH,
				"Choose the specific width:", getFieldEditorParent());
		resolutionGraph = new IntegerFieldEditor(
				PreferenceConstants.RESOLUTION__GRAPH,
				"Choose the specific resolution:", getFieldEditorParent());

		addField(widthGraph);
		addField(resolutionGraph);

		// @author druelle romuald
		// A field editor for a directory path type preference.
		// A standard directory dialog appears when the user presses the browse
		// button.
		// addField(new DirectoryFieldEditor(PreferenceConstants.P_DOT_PATH,
		// "Path to dot binary:", getFieldEditorParent()));

		// @author druelle romuald
		addField(new DirectoryFieldEditor(PreferenceConstants.P_SOLVERS_PATH,
				"Path to SAT solvers binaries:", getFieldEditorParent()));

		// @author druelle romuald
		addField(new DirectoryFieldEditor(
				PreferenceConstants.P_A4_SAMPLE_MODELS_PATH,
				"Path to Alloy 4 sample models:", getFieldEditorParent()));
	}

	public void init(IWorkbench workbench) {
	}

	public static boolean getShowDebugMessagesPreference() {
		return AlloyPlugin.getDefault().getPreferenceStore().getBoolean(
				PreferenceConstants.P_BOOLEAN_SHOW_DEBUG_MESSAGES);
	}

	public static String getShowGraphConversionMessagesPreference() {
		return AlloyPlugin.getDefault().getPreferenceStore().getString(
				PreferenceConstants.V_GRAPH_CONVERSION);
	}

	/*
	 * public static String getDotBinaryPath() { return
	 * AlloyPlugin.getDefault().getPluginPreferences().getString(
	 * PreferenceConstants.P_DOT_PATH); }
	 */

	public static boolean getClearConsoleForEachCommand() {
		return AlloyPlugin.getDefault().getPreferenceStore().getBoolean(
				PreferenceConstants.P_BOOLEAN_CLEAR_CONSOLE_FOR_EACH_COMMAND);
	}

	public static String getA4SampleModelsPath() {
		return AlloyPlugin.getDefault().getPluginPreferences().getString(
				PreferenceConstants.P_A4_SAMPLE_MODELS_PATH);
	}

	public static int getResolutionGraph() {
		return AlloyPlugin.getDefault().getPreferenceStore().getInt(
				PreferenceConstants.RESOLUTION__GRAPH);
	}

	public static double getWidthGraph() {
		return AlloyPlugin.getDefault().getPreferenceStore().getDouble(
				PreferenceConstants.WIDTH__GRAPH);
	}


	/*public void propertyChange(PropertyChangeEvent arg0) {
		System.out.println("got " + arg0);
		if (PDF_GRAPH.equals(arg0.getNewValue())) {
			resolutionGraph.setEnabled(true, getFieldEditorParent());
			heightGraph.setEnabled(false, getFieldEditorParent());
			widthGraph.setEnabled(false, getFieldEditorParent());
		} else if (PNG_GRAPH.equals(arg0.getNewValue())) {
			resolutionGraph.setEnabled(true, getFieldEditorParent());
			widthGraph.setEnabled(true, getFieldEditorParent());
			heightGraph.setEnabled(true, getFieldEditorParent());
		} else {
			widthGraph.setEnabled(false, getFieldEditorParent());
			heightGraph.setEnabled(false, getFieldEditorParent());
			resolutionGraph.setEnabled(false, getFieldEditorParent());
		}

	}*/
}