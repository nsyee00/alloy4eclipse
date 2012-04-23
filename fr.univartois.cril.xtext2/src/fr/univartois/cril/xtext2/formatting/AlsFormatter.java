/*
 * generated by Xtext
 */
package fr.univartois.cril.xtext2.formatting;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;

import fr.univartois.cril.xtext2.services.AlsGrammarAccess;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#formatting
 * on how and when to use it
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an
 * example
 */
public class AlsFormatter extends AbstractDeclarativeFormatter {

	@Override
	protected void configureFormatting(FormattingConfig c) {

		AlsGrammarAccess f = (AlsGrammarAccess) getGrammarAccess();
		c.setAutoLinewrap(120);
		this.setFormattingAlias(c, f);// terminé
		this.setFormattingColon(c, f);// terminé
		this.setFormattingComma(c, f);// terminé
		this.setFormattingCurlyBracket(c, f);// terminé
		this.setFormattingDecl(c, f);// terminé
		this.setFormattingDote(c, f);// terminé
		this.setFormattingExpr(c, f);// terminé
		this.setFormattingOpen(c, f);// terminé
		this.setFormattingUnOpen(c, f);// terminé
		this.setFormattingSigQual(c, f);// terminé
		this.setFormattingSquareBracketKeyword(c, f);// terminé
		this.setFormattingComments(c, f);// terminé
		this.setFormattingSLComments(c, f);
		this.setFormattingAssertDecl(c, f);
		this.setFormattingCheckDecl(c, f);// terminé
		this.setFormattingEnumDecl(c, f);
		this.setFormattingFactDecl(c, f);// terminé
		this.setFormattingFunDecl(c, f);// terminé
		this.setFormattingPredDecl(c, f);// terminé
		this.setFormattingSigDecl(c, f);// terminé
		this.setFormattingRunDecl(c, f);// terminé
		this.setFormattingAssertionName(c, f);// terminé
		this.setFormattingEnumName(c, f);// terminé
		this.setFormattingFactName(c, f);// terminé
		this.setFormattingLetName(c, f);// terminé
	}

	private void setFormattingAlias(FormattingConfig c, AlsGrammarAccess f) {
		c.setLinewrap(2).before(f.getAliasRule());
		c.setNoLinewrap().after(f.getAliasRule());
	}

	private void setFormattingColon(FormattingConfig c, AlsGrammarAccess f) {
		c.setNoSpace().before(f.getColonAccess().getColonColonKeyword_0());// ICI
	}

	private void setFormattingComma(FormattingConfig c, AlsGrammarAccess f) {
		c.setNoSpace().before(f.getCommaAccess().getCommaCommaKeyword_0());// ici
	}

	private void setFormattingCurlyBracket(FormattingConfig c, AlsGrammarAccess f) {
		c.setIndentation(f.getLeftCurlyBracketAccess()
				.getLeftCurlyBracketLeftCurlyBracketKeyword_0(), f
				.getRightCurlyBracketAccess()
				.getRightCurlyBracketRightCurlyBracketKeyword_0());
		c.setLinewrap().after( f.getLeftCurlyBracketAccess()
						.getLeftCurlyBracketLeftCurlyBracketKeyword_0());
		c.setLinewrap().before( f.getRightCurlyBracketAccess()
						.getRightCurlyBracketRightCurlyBracketKeyword_0());
	}
	
	private void setFormattingDecl(FormattingConfig c, AlsGrammarAccess f) {
		c.setLinewrap().before(f.getDeclAccess().getPropertyNameAssignment_3_1()) ;
	}

	private void setFormattingDote(FormattingConfig c, AlsGrammarAccess f) {
		c.setNoSpace().after(f.getDotAccess().getDotFullStopKeyword_0());// ici
		c.setNoSpace().before(f.getDotAccess().getDotFullStopKeyword_0());// ici
	}
	
	private void setFormattingExpr(FormattingConfig c, AlsGrammarAccess f) {
		c.setNoSpace().before(f.getExpressionAccess().getLeftSquareBracketKeyword_1_4_0()) ;
		c.setNoSpace().after(f.getExpressionAccess().getLeftSquareBracketKeyword_1_4_0()) ;
		c.setNoSpace().before(f.getExpressionAccess().getRightSquareBracketKeyword_1_4_2()) ;
		
		for(Keyword parO : f.getTerminalExpressionAccess().findKeywords("("))
			c.setNoSpace().after(parO) ;
		for(Keyword parF : f.getTerminalExpressionAccess().findKeywords(")"))
			c.setNoSpace().before(parF) ;
		//c.setNoLinewrap().around(f.getFunDeclAccess().getGroup_4_0_1());
	}

	private void setFormattingOpen(FormattingConfig c, AlsGrammarAccess f) {
		c.setLinewrap(2).before(f.getOpenAccess().getPrivateKeyword_0());
		c.setNoLinewrap().after(f.getOpenAccess().getPrivateKeyword_0());
		c.setLinewrap(2).before(f.getOpenNameRule());// ICI
	}

	private void setFormattingUnOpen(FormattingConfig c, AlsGrammarAccess f) {
		c.setNoSpace().after(f.getUnOpAccess().getOpAssignment_1_3());
	}

	private void setFormattingSigQual(FormattingConfig c, AlsGrammarAccess f) {
		c.setLinewrap(2).before(f.getSigQualRule());
		c.setNoLinewrap().after(f.getSigQualRule());
	}

	private void setFormattingSquareBracketKeyword(FormattingConfig c, AlsGrammarAccess f) {
		c.setNoSpace().around(f.getLeftSquareBracketKeywordRule());
		c.setNoSpace().before(f.getRightSquareBracketKeywordRule());
	}

	private void setFormattingComments(FormattingConfig c, AlsGrammarAccess f) {
		c.setLinewrap(2).before(f.getML_COMMENTRule());
		c.setLinewrap().after(f.getML_COMMENTRule());
	}

	private void setFormattingSLComments(FormattingConfig c, AlsGrammarAccess f) {
		c.setLinewrap().before(f.getSL_COMMENTRule());
	}

	private void setFormattingAssertDecl(FormattingConfig c, AlsGrammarAccess f) {
		c.setLinewrap().around(f.getAssertDeclRule());
	}

	private void setFormattingCheckDecl(FormattingConfig c, AlsGrammarAccess f) {
		c.setLinewrap(2).around(f.getCheckDeclRule());
	}

	private void setFormattingEnumDecl(FormattingConfig c, AlsGrammarAccess f) {
		c.setLinewrap(2).around(f.getEnumDeclRule());
	}

	private void setFormattingFactDecl(FormattingConfig c, AlsGrammarAccess f) {
		c.setLinewrap(2).around(f.getFactDeclRule());
	}

	private void setFormattingFunDecl(FormattingConfig c, AlsGrammarAccess f) {
		c.setLinewrap(2).around(f.getFunDeclRule()); 
	}

	private void setFormattingPredDecl(FormattingConfig c, AlsGrammarAccess f) {
		c.setLinewrap(2).around(f.getPredDeclRule());
	}

	private void setFormattingRunDecl(FormattingConfig c, AlsGrammarAccess f) {
		c.setLinewrap(2).around(f.getRunDeclRule());
	}

	private void setFormattingSigDecl(FormattingConfig c, AlsGrammarAccess f) {
		//c.setLinewrap(2).before(f.getSigDeclAccess().getSigKeyword_1());
		
		for(Keyword leftCurly : f.getSigDeclAccess().findKeywords("{"))
			c.setLinewrap().after(leftCurly) ;
		
		//c.setIndentation(f.getSigDeclAccess().getLeftCurlyBracketKeyword_5(), f.getSigDeclAccess().getRightCurlyBracketKeyword_7());
		//c.setLinewrap().before(f.getSigDeclAccess().getRightCurlyBracketKeyword_7());
	}

	private void setFormattingAssertionName(FormattingConfig c, AlsGrammarAccess f) {
		c.setLinewrap(2).before(f.getAssertionNameRule());
		c.setNoLinewrap().after(f.getAssertionNameRule());
	}

	private void setFormattingFactName(FormattingConfig c, AlsGrammarAccess f) {
		c.setLinewrap(2).before(f.getFactNameRule());
		c.setNoLinewrap().after(f.getFactNameRule());
	}

	private void setFormattingEnumName(FormattingConfig c, AlsGrammarAccess f) {
		c.setLinewrap(2).before(f.getEnumNameRule());
		c.setNoLinewrap().after(f.getEnumNameRule());
	}
	
	private void setFormattingLetName(FormattingConfig c, AlsGrammarAccess f) {
		c.setLinewrap(2).before(f.getLetNameAccess().getLetKeyword_0());
	}
}
