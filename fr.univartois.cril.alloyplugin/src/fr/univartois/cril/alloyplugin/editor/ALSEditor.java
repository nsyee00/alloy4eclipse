package fr.univartois.cril.alloyplugin.editor;

import org.eclipse.core.resources.IResource;
import org.eclipse.jface.viewers.TreeViewer;



import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.editors.text.TextFileDocumentProvider;
import org.eclipse.ui.texteditor.AbstractTextEditor;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
//

import fr.univartois.cril.alloyplugin.AlloyPlugin;

/**
 * Class for Alloy editor. 
 */

public class ALSEditor extends TextEditor {
	private AlloyContentOutlinePage fOutlinePage=null;
	AlloySolutionViewer asv;
	/**
	 * Method called at editor initialization.
	 * Set the SourceViewer.
	 * @see org.eclipse.ui.editors.text.TextEditor#initializeEditor()
	 */
	protected void initializeEditor() {
		super.initializeEditor();
		// Attache la configuration
		setSourceViewerConfiguration(new ALSSourceViewerConfiguration());		
			
		
	}
	
	public void init(IEditorSite site,IEditorInput input) throws PartInitException{		
		super.init(site, input);
		AlloyPlugin.getDefault().fireFileLoaded(getResource());		
		TextFileDocumentProvider d=(TextFileDocumentProvider) this.getDocumentProvider();
		System.out.println("d:"+(d.getDocument(null)));
		
	}
	public void setFocus() {
		super.setFocus();
		AlloyPlugin.getDefault().fireSetFocus(getResource());		
	}
	public void dispose() {
		super.dispose();
		AlloyPlugin.getDefault().fireFileClosed(getResource());
	}
/**
 * Used for contentoutline (not implement yet)
 * */
	
	public Object getAdapter(Class required) {
		if (IContentOutlinePage.class.equals(required)) {	
			if (fOutlinePage == null) {
				fOutlinePage= new AlloyContentOutlinePage(getDocumentProvider(), this);
				if (asv==null) asv=new AlloySolutionViewer();
				if (getEditorInput() != null)
					fOutlinePage.setInput(getEditorInput());
			}
			return asv;
		}
		
		
		return super.getAdapter(required);
		
	}
	/**
	 * Extends editorSaved() for launching Alloy parser.
	 * */
	public void editorSaved(){		
		super.editorSaved();		
		//launchParser();
		AlloyPlugin.getDefault().fireFileSaved(getResource());
	}
	
	

	/**
	 * Try to return an IResource from editor.
	 * Returns null if no such object can be found.  
	 */
	private IResource getResource() {		
		IResource ir=(IResource)this.getEditorInput().getAdapter(IResource.class);
		return ir;		
	}
}
