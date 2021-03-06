/*
* generated by Xtext
*/
package fr.univartois.cril.xtext.ui.outline;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.StyledString.Styler;
import org.eclipse.swt.graphics.TextStyle;
import org.eclipse.xtext.ui.editor.outline.ContentOutlineNode;
import org.eclipse.xtext.ui.editor.outline.transformer.AbstractDeclarativeSemanticModelTransformer;

import fr.univartois.cril.xtext.als.Assertion;
import fr.univartois.cril.xtext.als.CheckCommand;
import fr.univartois.cril.xtext.als.Fact;
import fr.univartois.cril.xtext.als.Function;
import fr.univartois.cril.xtext.als.Let;
import fr.univartois.cril.xtext.als.Module;
import fr.univartois.cril.xtext.als.Open;
import fr.univartois.cril.xtext.als.Predicate;
import fr.univartois.cril.xtext.als.RunCommand;
import fr.univartois.cril.xtext.als.Signature;
import fr.univartois.cril.xtext.als.Specification;
import fr.univartois.cril.xtext.ui.editor.outline.CommandOutlineNodeHandler;

/**
 * customization of the default outline structure
 * 
 */
public class AlsTransformer extends AbstractDeclarativeSemanticModelTransformer {
	private CommandOutlineNodeHandler no=new CommandOutlineNodeHandler();
	private static List<CommandOutlineNode> nodes=new LinkedList<CommandOutlineNode>();
	@Override
	protected List<EObject> getChildren(EObject semanticNode) {
		if(semanticNode instanceof Specification)
			return semanticNode.eContents();
		return NO_CHILDREN;
	}

	
	public String createNode(Specification semanticNode, ContentOutlineNode parentNode) {	    
	    return INVISIBLE_ROOT_NODE;
	}
	public ContentOutlineNode createNode(Module moduleNode, ContentOutlineNode parentNode) {
		 ContentOutlineNode node = super.newOutlineNode(moduleNode, parentNode);
		    node.setLabel(node.getLabel());
		    node.setImage(node.getImage());
		    return node;
		
	}
	public ContentOutlineNode createNode(Open openNode, ContentOutlineNode parentNode) {	    
		 ContentOutlineNode node = super.newOutlineNode(openNode, parentNode);
		    node.setLabel(node.getLabel());
		    node.setImage(node.getImage());
		    return node;
		
	}
	public ContentOutlineNode createNode(Function fNode, ContentOutlineNode parentNode) {	    
		 ContentOutlineNode node = super.newOutlineNode(fNode, parentNode);
		    node.setLabel(node.getLabel());
		    node.setImage(node.getImage());
		    return node;
		
	}
	public ContentOutlineNode createNode(Signature fNode, ContentOutlineNode parentNode) {	    
		 ContentOutlineNode node = super.newOutlineNode(fNode, parentNode);
		    node.setLabel(node.getLabel());
		    node.setImage(node.getImage());
		    return node;
		
	}
	public ContentOutlineNode createNode(Predicate fNode, ContentOutlineNode parentNode) {	    
		 ContentOutlineNode node = super.newOutlineNode(fNode, parentNode);
		    node.setLabel(node.getLabel());
		    node.setImage(node.getImage());
		    return node;
		
	}
	public ContentOutlineNode createNode(Assertion fNode, ContentOutlineNode parentNode) {	    
		 ContentOutlineNode node = super.newOutlineNode(fNode, parentNode);
		    node.setLabel(node.getLabel());
		    node.setImage(node.getImage());
		    return node;
		
	}
	public ContentOutlineNode createNode(RunCommand fNode, ContentOutlineNode parentNode) {	    
		 ContentOutlineNode node = super.newOutlineNode(fNode, parentNode);
		    node.setLabel(node.getLabel());

		    node.setImage(node.getImage());
		    return node;
		
	}
	public ContentOutlineNode createNode(CheckCommand fNode, ContentOutlineNode parentNode) {	    
			/*ContentOutlineNode nodetmp = super.newOutlineNode(fNode, parentNode);
			final CommandOutlineNode node=new CommandOutlineNode(nodetmp);
		 	node.setCommand(no.getExecutableCommand(node.getCt()));*/
		 	 ContentOutlineNode node = super.newOutlineNode(fNode, parentNode);
		   /* node.getCt().setLabel("Check : " + node.getCt().getLabel());
		    node.getCt().setImage(node.getCt().getImage());
		    no.addNode(node);*/
		 	 node.setLabel(node.getLabel());
		 	 node.setImage(node.getImage());
		 	 
		    Styler styler=new Styler() {
				
				@Override
				public void applyStyles(TextStyle textStyle) {
					org.eclipse.swt.graphics.Color i;
					//if(node.getCommand().toString().endsWith("[SAT]")){
					//	 i=new org.eclipse.swt.graphics.Color(null,0,255,0);
					//}
					//else if (node.getCommand().toString().endsWith("[UNSAT]")){
					//	i=new org.eclipse.swt.graphics.Color(null,255,0,0);
					//}
					//else {
						 i=new org.eclipse.swt.graphics.Color(null,0,0,0);
					//}
					textStyle.foreground=i;
					
				}
			};
			
		    /*node.getCt().setStyler(styler);
		    return node.getCt();*/
			return node;
	}
	public ContentOutlineNode createNode(Fact fNode, ContentOutlineNode parentNode) {	    
		 ContentOutlineNode node = super.newOutlineNode(fNode, parentNode);
		    node.setLabel(node.getLabel());
		    node.setImage(node.getImage());
		    return node;
		
	}
	public ContentOutlineNode createNode(Let fNode, ContentOutlineNode parentNode) {
		 ContentOutlineNode node = super.newOutlineNode(fNode, parentNode);
		    node.setLabel("Let : " + node.getLabel());
		    node.setImage(node.getImage());
		    return node;
		
	}
	
	public static List<CommandOutlineNode> getNodes(){
		return nodes;
	}
	
}
