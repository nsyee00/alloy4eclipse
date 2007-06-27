package fr.univartois.cril.alloyplugin.preferences;

import org.eclipse.jface.preference.*;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.IWorkbench;
import fr.univartois.cril.alloyplugin.AlloyPlugin;

/**
 * This class represents a preference page that
 * is contributed to the Preferences dialog. By 
 * subclassing <samp>FieldEditorPreferencePage</samp>, we
 * can use the field support built into JFace that allows
 * us to create a page that is small and knows how to 
 * save, restore and apply itself.
 * <p>
 * This page is used to modify preferences only. They
 * are stored in the preference store that belongs to
 * the main plug-in class. That way, preferences can
 * be accessed directly via the preference store.
 */

public class AlloyPreferencePage
extends FieldEditorPreferencePage
implements IWorkbenchPreferencePage {

	public AlloyPreferencePage() {
		super(GRID);
		setPreferenceStore(AlloyPlugin.getDefault().getPreferenceStore());
		setDescription("You can set up your Alloy preferences here:");
	}

	/**
	 * Creates the field editors. Field editors are abstractions of
	 * the common GUI blocks needed to manipulate various types
	 * of preferences. Each field editor knows how to save and
	 * restore itself.
	 */
	public void createFieldEditors() {
		/*addField(new DirectoryFieldEditor(PreferenceConstants.P_OUTPUT_PATH, 
				"&Output.xml directory:", getFieldEditorParent()));*/
		addField(
				new BooleanFieldEditor(
						PreferenceConstants.P_BOOLEAN_WRITE_SHOW_ANSWER,
						"Automatically &Show XML answer after command execution",
						getFieldEditorParent()));

		addField(new RadioGroupFieldEditor(
				PreferenceConstants.P_SOLVER_CHOICE,
				"Choose solver for commands:",
				1,
				new String[][] {
						{ "&SAT4J", PreferenceConstants.V_SOLVER_SAT4J }, 
						{"&MiniSat pipe", PreferenceConstants.V_SOLVER_MINISAT_PIPE },
						{"MiniSatProver &JNI", PreferenceConstants.V_SOLVER_MiniSatProverJNI },
						{"MiniSatProver &Unsat Core", PreferenceConstants.V_SOLVER_MiniSatProverUnsatCore },
						{"&ZChaffJNI", PreferenceConstants.V_SOLVER_ZChaffJNI }
				},
				getFieldEditorParent()));


		/*addField(
				new StringFieldEditor(PreferenceConstants.P_STRING, "A &text preference:", getFieldEditorParent()));*/

		/*		addField(
				new StringFieldEditor(PreferenceConstants.P_STRING, "A &text preference:", getFieldEditorParent()));
		 */
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}


}