package fr.univartois.cril.xtext2.alloyplugin.launch.ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;

import fr.univartois.cril.xtext2.alloyplugin.api.IALSCommand;
import fr.univartois.cril.xtext2.alloyplugin.api.IALSFile;
import fr.univartois.cril.xtext2.alloyplugin.api.Util;
import fr.univartois.cril.xtext2.alloyplugin.core.ALSFileFactory;

public class LaunchCommandsTab extends AbstractLaunchConfigurationTab implements ICheckStateListener {

	private CheckboxTableViewer commandsViewer;
	private Label label;
	private IALSFile currentALSFile;
	private Composite container;
	/**
	 * Config being modified
	 */
	private ILaunchConfiguration launchConfig;
	private IResource currentResource;
	private boolean valid;

	public LaunchCommandsTab() {
		super();
	}

	public boolean canSave() {
		return true;
	}

	public void createControl(Composite parent) {
		container = new Composite(parent, SWT.CHECK);
		FillLayout layout = new FillLayout();
		layout.spacing = 10;
		layout.marginHeight = 10;
		layout.marginWidth = 10;
		container.setLayout(layout);
		Group group = new Group(container, SWT.NONE);
		group.setText("&Commands:");
		group.setLayout(new FillLayout());
		group.setFont(container.getFont());
		label = new Label(group, SWT.NULL);
		label.setText("&From:");
		commandsViewer = new CheckboxTableViewer(new Table(group, SWT.CHECK
				| SWT.H_SCROLL | SWT.V_SCROLL));
		commandsViewer.addCheckStateListener(this);
		commandsViewer.setContentProvider(new CommandsContentProvider2());
		// System.out.println("createControl:file:"+file);
		commandsViewer.setLabelProvider(new CommandsLabelProvider2());
		setControl(container);
	}

	public String getName() {
		return "Choose Alloy Commands";
	}

	public void initializeFrom(ILaunchConfiguration configuration) {
		this.launchConfig = configuration;
		IResource resource = null;
		try {
			IResource[] res = configuration.getMappedResources();
			if (res != null && res.length > 0) {
				resource = res[0];
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}
		initializeTabFields(resource);
		initializeTabControls();
		checkConfig();
	}

	/**
	 * update tab fields.
	 */
	private void initializeTabFields(IResource resource) {
		valid = false;
		currentResource = resource;
		if (resource == null) {
			currentALSFile = null;
		} else {
			currentALSFile = ALSFileFactory.instance().getALSFile(resource);
		}
	}

	/**
	 * Refresh the control for this tab.
	 */
	@SuppressWarnings("unchecked")
	private void initializeTabControls() {
		if (commandsViewer != null) {
			commandsViewer.setInput(currentALSFile);
			if (currentALSFile != null) {
				List<String> commandLabelList;
				try {
					commandLabelList = launchConfig
							.getAttribute(
									LaunchConfigurationConstants.ATTRIBUTE_COMMANDS_LABEL_LIST,
									new ArrayList<String>());
					for (String commandLabel : commandLabelList) {
						IALSCommand cmd = currentALSFile
								.getCommand(commandLabel);
						if (cmd != null)
							commandsViewer.setChecked(cmd, true);
					}
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
		}
		if (label != null) {
			if (currentALSFile != null)
				label.setText("&From: " + currentALSFile.getName());
			else
				label.setText("&From: ");
		}
		if (container != null)
			container.update();

	}

	/**
	 * Check the parameters modified by this tab. set if valid or not.
	 */
	private void checkConfig() {

		if (currentResource == null) {
			updateStatus("Alloy file not selected.");
			return;
		}
		if (currentALSFile == null) {
			updateStatus("Selected file isn't an Alloy file.");
			return;
		}
		if (currentALSFile.getCommand().size() == 0) {
			updateStatus("Selected Alloy file doesn't contains any commands.");
			return;
		}
		if (commandsViewer.getCheckedElements().length == 0) {

			updateStatus("Choose one commands please.");
			return;
		}

		updateStatus(null);
	}

	/**
	 * Update Status. Display an error message. If the message is null the tab
	 * is declared valid.
	 */
	private void updateStatus(String message) {
		setErrorMessage(message);
		valid = (message == null);
	}

	/*
	 * save changes in configuration.
	 */
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		List<String> list = new ArrayList<String>();
		Object[] selectedCommands = commandsViewer.getCheckedElements();
		for (Object object : selectedCommands) {
			list.add(((IALSCommand) object).getName());
		}
		configuration.setAttribute(
				LaunchConfigurationConstants.ATTRIBUTE_COMMANDS_LABEL_LIST,
				list);
	}

	/**
	 * this method return if this tab authorize running.
	 */
	public boolean isValid(ILaunchConfiguration launchConfig) {
		return valid;
	}

	/**
	 * This method is called when a configuration is created. All default
	 * attributes are stored in the configuration. Informations are taken from
	 * context.
	 */
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		/*
		 * IStructuredSelection sel = getSelectionfromContext(); if (sel !=
		 * null) { List<IALSCommand> cmds = getIALSCommandFromSelection(sel); if
		 * (!cmds.isEmpty()) { setdefaultsAttributes(cmds, configuration);
		 * String name = DebugPlugin.getDefault().getLaunchManager()
		 * .generateLaunchConfigurationName
		 * (cmds.get(0).getResource().getName()); configuration.rename(name);
		 * return; } } IALSFile file = getALSFileFromContext(); if (file !=
		 * null) { String name = DebugPlugin.getDefault().getLaunchManager()
		 * .generateLaunchConfigurationName(file.getName());
		 * configuration.rename(name); setdefaultsAttributes(file,
		 * configuration); }
		 */
	}

	/**
	 * This method set all Alloy commands launching defaults attributes to a
	 * launch configuration. All informations are taken from the als file.
	 * Clients can use this method to configure their own launch configuration.
	 */
	public void setdefaultsAttributes(IResource resource, String command, ILaunchConfigurationWorkingCopy configuration) {
		IResource[] resources = new IResource[1];
		resources[0] = resource;

		if (resources[0] != null)
			configuration.setMappedResources(resources);
		else
			configuration.setMappedResources(null);

		List<String> list = new ArrayList<String>();
		list.add(command);

		configuration.setAttribute(LaunchConfigurationConstants.ATTRIBUTE_FILE_NAME,Util.getFileLocation(resource));
		configuration.setAttribute(LaunchConfigurationConstants.ATTRIBUTE_FILE_PATH, resource.getFullPath().toString());
		configuration.setAttribute(LaunchConfigurationConstants.ATTRIBUTE_COMMANDS_LABEL_LIST,list);
	}

	/**
	 * This method set all Alloy commands launching defaults attributes to a
	 * launch configuration. All informations are taken from the als file.
	 * Clients can use this method to configure their own launch configuration.
	 */
	public void setdefaultsAttributes(IALSFile file,
			ILaunchConfigurationWorkingCopy configuration) {
		IResource[] resources = new IResource[1];
		resources[0] = file.getResource();
		if (resources[0] != null)
			configuration.setMappedResources(resources);
		else
			configuration.setMappedResources(null);
		configuration.setAttribute(
				LaunchConfigurationConstants.ATTRIBUTE_FILE_NAME,
				file.getFilename());
		List<String> list = new ArrayList<String>();
		for (IALSCommand cmd : file.getCommand()) {
			list.add(cmd.getName());
		}
		configuration.setAttribute(
				LaunchConfigurationConstants.ATTRIBUTE_COMMANDS_LABEL_LIST,
				list);
	}

	/**
	 * This method set all Alloy commands launching defaults attributes to a
	 * launch configuration. All informations are taken from a list of als
	 * commands. Clients can use this method to configure their own launch
	 * configuration.
	 */
	public void setdefaultsAttributes(List<IALSCommand> cmds,
			ILaunchConfigurationWorkingCopy configuration) {
		IResource[] resources = new IResource[1];
		resources[0] = cmds.get(0).getResource();
		if (resources[0] != null)
			configuration.setMappedResources(resources);
		else
			configuration.setMappedResources(null);
		configuration.setAttribute(
				LaunchConfigurationConstants.ATTRIBUTE_FILE_NAME,
				Util.getFileLocation(cmds.get(0).getResource()));
		List<String> list = new ArrayList<String>();
		for (IALSCommand cmd : cmds) {
			list.add(cmd.getName());
		}
		configuration.setAttribute(
				LaunchConfigurationConstants.ATTRIBUTE_COMMANDS_LABEL_LIST,
				list);
	}

	public List<IALSCommand> getIALSCommandFromSelection(
			IStructuredSelection selection) {
		ArrayList<IALSCommand> list = null;
		if (!selection.isEmpty()) {
			for (Iterator<?> iterator = selection.iterator(); iterator
					.hasNext();) {
				Object obj = iterator.next();
				if (obj instanceof IALSCommand) {
					if (list == null)
						list = new ArrayList<IALSCommand>();
					list.add((IALSCommand) obj);
				}
			}
		}
		return list;
	}

	public void checkStateChanged(CheckStateChangedEvent event) {
		checkConfig();
		this.updateLaunchConfigurationDialog();
	}

}
