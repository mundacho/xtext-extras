/*******************************************************************************
 * Copyright (c) 2011, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.enumrules.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class EnumRulesTestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.enumrules.EnumRulesTestLanguage.Model");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cExistingKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cExistingAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cExistingExistingEnumEnumRuleCall_0_1_0 = (RuleCall)cExistingAssignment_0_1.eContents().get(0);
		private final Group cGroup_0_2 = (Group)cGroup_0.eContents().get(2);
		private final Keyword cGeneratedKeyword_0_2_0 = (Keyword)cGroup_0_2.eContents().get(0);
		private final Assignment cGeneratedAssignment_0_2_1 = (Assignment)cGroup_0_2.eContents().get(1);
		private final RuleCall cGeneratedGeneratedEnumEnumRuleCall_0_2_1_0 = (RuleCall)cGeneratedAssignment_0_2_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cGeneratedKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cGeneratedAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cGeneratedGeneratedEnumEnumRuleCall_1_1_0 = (RuleCall)cGeneratedAssignment_1_1.eContents().get(0);
		
		//Model:
		//  'existing' existing=ExistingEnum ('generated' generated=GeneratedEnum)? | 'generated' generated=GeneratedEnum
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'existing' existing=ExistingEnum ('generated' generated=GeneratedEnum)? | 'generated' generated=GeneratedEnum
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'existing' existing=ExistingEnum ('generated' generated=GeneratedEnum)?
		public Group getGroup_0() { return cGroup_0; }
		
		//'existing'
		public Keyword getExistingKeyword_0_0() { return cExistingKeyword_0_0; }
		
		//existing=ExistingEnum
		public Assignment getExistingAssignment_0_1() { return cExistingAssignment_0_1; }
		
		//ExistingEnum
		public RuleCall getExistingExistingEnumEnumRuleCall_0_1_0() { return cExistingExistingEnumEnumRuleCall_0_1_0; }
		
		//('generated' generated=GeneratedEnum)?
		public Group getGroup_0_2() { return cGroup_0_2; }
		
		//'generated'
		public Keyword getGeneratedKeyword_0_2_0() { return cGeneratedKeyword_0_2_0; }
		
		//generated=GeneratedEnum
		public Assignment getGeneratedAssignment_0_2_1() { return cGeneratedAssignment_0_2_1; }
		
		//GeneratedEnum
		public RuleCall getGeneratedGeneratedEnumEnumRuleCall_0_2_1_0() { return cGeneratedGeneratedEnumEnumRuleCall_0_2_1_0; }
		
		//'generated' generated=GeneratedEnum
		public Group getGroup_1() { return cGroup_1; }
		
		//'generated'
		public Keyword getGeneratedKeyword_1_0() { return cGeneratedKeyword_1_0; }
		
		//generated=GeneratedEnum
		public Assignment getGeneratedAssignment_1_1() { return cGeneratedAssignment_1_1; }
		
		//GeneratedEnum
		public RuleCall getGeneratedGeneratedEnumEnumRuleCall_1_1_0() { return cGeneratedGeneratedEnumEnumRuleCall_1_1_0; }
	}
	
	public class ExistingEnumElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.enumrules.EnumRulesTestLanguage.ExistingEnum");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cSameNameEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cSameNameSameNameKeyword_0_0 = (Keyword)cSameNameEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cOverriddenLiteralEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cOverriddenLiteralOverriddenKeyword_1_0 = (Keyword)cOverriddenLiteralEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cDifferentNameEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cDifferentNameDifferentLiteralKeyword_2_0 = (Keyword)cDifferentNameEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum ExistingEnum:
		//  SameName | OverriddenLiteral = "overridden" | DifferentName
		//;
		public EnumRule getRule() { return rule; }
		
		//SameName | OverriddenLiteral = "overridden" | DifferentName
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//SameName
		public EnumLiteralDeclaration getSameNameEnumLiteralDeclaration_0() { return cSameNameEnumLiteralDeclaration_0; }
		
		public Keyword getSameNameSameNameKeyword_0_0() { return cSameNameSameNameKeyword_0_0; }
		
		//OverriddenLiteral = "overridden"
		public EnumLiteralDeclaration getOverriddenLiteralEnumLiteralDeclaration_1() { return cOverriddenLiteralEnumLiteralDeclaration_1; }
		
		//"overridden"
		public Keyword getOverriddenLiteralOverriddenKeyword_1_0() { return cOverriddenLiteralOverriddenKeyword_1_0; }
		
		//DifferentName
		public EnumLiteralDeclaration getDifferentNameEnumLiteralDeclaration_2() { return cDifferentNameEnumLiteralDeclaration_2; }
		
		public Keyword getDifferentNameDifferentLiteralKeyword_2_0() { return cDifferentNameDifferentLiteralKeyword_2_0; }
	}
	public class GeneratedEnumElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.enumrules.EnumRulesTestLanguage.GeneratedEnum");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cSameNameEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cSameNameSameNameKeyword_0_0 = (Keyword)cSameNameEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cDifferentNameEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cDifferentNameDifferentLiteralKeyword_1_0 = (Keyword)cDifferentNameEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum GeneratedEnum:
		//  SameName | DifferentName = "DifferentLiteral"
		//;
		public EnumRule getRule() { return rule; }
		
		//SameName | DifferentName = "DifferentLiteral"
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//SameName
		public EnumLiteralDeclaration getSameNameEnumLiteralDeclaration_0() { return cSameNameEnumLiteralDeclaration_0; }
		
		public Keyword getSameNameSameNameKeyword_0_0() { return cSameNameSameNameKeyword_0_0; }
		
		//DifferentName = "DifferentLiteral"
		public EnumLiteralDeclaration getDifferentNameEnumLiteralDeclaration_1() { return cDifferentNameEnumLiteralDeclaration_1; }
		
		//"DifferentLiteral"
		public Keyword getDifferentNameDifferentLiteralKeyword_1_0() { return cDifferentNameDifferentLiteralKeyword_1_0; }
	}
	
	private final ModelElements pModel;
	private final ExistingEnumElements eExistingEnum;
	private final GeneratedEnumElements eGeneratedEnum;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public EnumRulesTestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.eExistingEnum = new ExistingEnumElements();
		this.eGeneratedEnum = new GeneratedEnumElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.enumrules.EnumRulesTestLanguage".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//  'existing' existing=ExistingEnum ('generated' generated=GeneratedEnum)? | 'generated' generated=GeneratedEnum
	//;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//enum ExistingEnum:
	//  SameName | OverriddenLiteral = "overridden" | DifferentName
	//;
	public ExistingEnumElements getExistingEnumAccess() {
		return eExistingEnum;
	}
	
	public EnumRule getExistingEnumRule() {
		return getExistingEnumAccess().getRule();
	}
	
	//enum GeneratedEnum:
	//  SameName | DifferentName = "DifferentLiteral"
	//;
	public GeneratedEnumElements getGeneratedEnumAccess() {
		return eGeneratedEnum;
	}
	
	public EnumRule getGeneratedEnumRule() {
		return getGeneratedEnumAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
