/*
 * generated by Xtext
 */
package fr.univartois.cril.alloyplugin.labeling;

import org.eclipse.xtext.ui.core.DefaultLabelProvider;

import fr.univartois.cril.alloyplugin.basics.Assertion;
import fr.univartois.cril.alloyplugin.basics.CheckCommand;
import fr.univartois.cril.alloyplugin.basics.EnumDecl;
import fr.univartois.cril.alloyplugin.basics.Fact;
import fr.univartois.cril.alloyplugin.basics.Function;
import fr.univartois.cril.alloyplugin.basics.Module;
import fr.univartois.cril.alloyplugin.basics.Predicate;
import fr.univartois.cril.alloyplugin.basics.RunCommand;
import fr.univartois.cril.alloyplugin.basics.Signature;

/**
 * see
 * http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 */
public class BasicsLabelProvider extends DefaultLabelProvider {
	/*
	 * 
	 * //Labels and icons can be computed like this:
	 * 
	 * String text(MyModel ele) { return "my "+ele.getName(); }
	 * 
	 * String image(MyModel ele) { return "MyModel.gif"; }
	 */
	/*
	 * String text(Module module) { return module.getName().getName(); }
	 */
	String text(Module module){
		return module.getModuleName().getName();
	}

	String image(Module module) {
		return "module.gif";
	}

	String text(Signature sig){
		return sig.getSigName().getName();
	}
	
	String image(Signature sig) {
		return "sig.gif";
	}

	String text(Fact fact){
		return fact.getFactName().getName();
	}
	
	String image(Fact fact) {
		return "fact.gif";
	}

	String text(Assertion assertD){
		return assertD.getAssertName().getName();
	}
	
	String image(Assertion assertD) {
		return "assert.gif";
	}

	String text(Function fun){
		return fun.getFunName().getName();
	}
	
	String image(Function fun) {
		return "function.gif";
	}

	String text(Predicate fun){
		return fun.getPredName().getName();
	}
	
	String image(Predicate fun) {
		return "predicate.gif";
	}

	String text(RunCommand run){
		return run.getRunName().getName();
	}
	
	String image(RunCommand run) {
		return "run.gif";
	}
	
	String text(CheckCommand check){
		return check.getCheckName().getName();
	}
	
	String image(CheckCommand check) {
		return "check.gif";
	}

	String text(EnumDecl enumD){
		return enumD.getEnumName().getName();
	}
	
	String image(EnumDecl enumD) {
		return "sig.gif";
	}

}