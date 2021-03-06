package fr.univartois.cril.xtext2.alloyplugin.ui;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

// import org.eclipse.core.commands.Command;
import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
// import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;
// import org.eclipse.xtext.builder.impl.XtextBuilder;
import org.eclipse.xtext.ui.XtextProjectHelper;

import fr.univartois.cril.xtext2.preferences.AlloyPreferencePage;
import fr.univartois.cril.xtext2.preferences.PreferenceConstants;
import fr.univartois.cril.xtext2.ui.activator.AlsActivator;

/**
 * New Alloy project wizard.
 * */
public class NewAlloyProjectWizard extends Wizard implements INewWizard,
		IExecutableExtension {
	private NewAlloyProjectWizardPage page;
	private ISelection selection;
	private IConfigurationElement configElement;

	@Override
	public boolean performFinish() {
		// final String containerName = page.getContainerName();

		final String fileName = page.getProjectName();
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor)
					throws InvocationTargetException {
				try {
					doFinish(fileName, monitor);
				} catch (CoreException e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};
		try {
			getContainer().run(true, false, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), "Error",
					realException.getMessage());
			return false;
		}

		BasicNewProjectResourceWizard.updatePerspective(configElement);

		// selectAndReveal(fSecondPage.getJavaProject().getProject());

		return true;
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}

	public void addPages() {
		page = new NewAlloyProjectWizardPage(selection);

		addPage(page);
	}

	private void doFinish(
	// String containerName,
			String fileName, IProgressMonitor monitor) throws CoreException {
		createProject(fileName, monitor);
	}

	public void setInitializationData(IConfigurationElement config,
			String propertyName, Object data) throws CoreException {
		configElement = config;
	}

	/**
	 * Create the Alloy project with specified name.
	 * */
	private void createProject(String projectName, IProgressMonitor monitor)
			throws CoreException {

		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		
		IProject project = root.getProject(projectName);
		IProjectDescription description = ResourcesPlugin.getWorkspace()
				.newProjectDescription(project.getName());

		description.setNatureIds(new String[] { XtextProjectHelper.NATURE_ID });
		ICommand[] commands = description.getBuildSpec();
		ICommand command = description.newCommand();
		command.setBuilderName(XtextProjectHelper.BUILDER_ID);
		ICommand[] newCommands = new ICommand[commands.length + 1];
		System.arraycopy(commands, 0, newCommands, 1, commands.length);
		newCommands[0] = command;
		description.setBuildSpec(newCommands);

		project.create(description, monitor);
		project.open(monitor);

		if(root.getProject("A4 models library") == null)
			return ;
		else{
			IProject projectModels = root.getProject("A4 models library");
			projectModels.create(description,monitor);
			projectModels.open(monitor);
			IPath to = new Path(AlloyPreferencePage.getA4SampleModelsPath());
	
			File models = new File(to.toOSString());
			for (File f : models.listFiles()) {
				if(!AlsActivator.getDefault().getPreferenceStore().getBoolean(PreferenceConstants.P_BOOLEAN_SHOW_BOOK) && f.getName().equals("book"))
					continue ;
				if(!AlsActivator.getDefault().getPreferenceStore().getBoolean(PreferenceConstants.P_BOOLEAN_SHOW_EXAMPLES) && f.getName().equals("examples"))
					continue ;
				
				IFolder file = projectModels.getFolder(f.getName());
	
				try {
					file.createLink(Path.fromOSString(f.getCanonicalPath()), IResource.NONE, monitor);
				} catch (IOException e) {
	
					e.printStackTrace();
				}
			}
		}
	}

}
