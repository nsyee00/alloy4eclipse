package fr.univartois.cril.alloyplugin.core;

import org.eclipse.swt.graphics.Image;

import edu.mit.csail.sdg.alloy4compiler.ast.Func;
import fr.univartois.cril.alloyplugin.AlloyPlugin;
import fr.univartois.cril.alloyplugin.core.ui.IALSPredicate;

public class Predicate implements IALSPredicate {
	
	public static final Image icon = AlloyPlugin.getDefault().getImage(AlloyPlugin.PREDICATE_ICON_ID);

	private Func func;

	public Predicate(Func func) {
		this.func=func;
	}

	public String toString(){
		return func.toString();
	}

	public Image getIcon() {
		return icon;
	}

	public int getLine() {
		return func.pos.y;
	}
}