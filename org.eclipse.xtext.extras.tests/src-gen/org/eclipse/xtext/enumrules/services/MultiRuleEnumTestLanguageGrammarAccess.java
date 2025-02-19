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
public class MultiRuleEnumTestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.enumrules.MultiRuleEnumTestLanguage.Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSomeEnumKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cAAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cAEnumRuleAEnumRuleCall_1_0 = (RuleCall)cAAssignment_1.eContents().get(0);
		private final Assignment cBAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cBEnumRuleBEnumRuleCall_2_0 = (RuleCall)cBAssignment_2.eContents().get(0);
		private final Assignment cCAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cCEnumRuleCEnumRuleCall_3_0 = (RuleCall)cCAssignment_3.eContents().get(0);
		
		//Model:
		//  'someEnum' a=EnumRuleA b=EnumRuleB c=EnumRuleC
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'someEnum' a=EnumRuleA b=EnumRuleB c=EnumRuleC
		public Group getGroup() { return cGroup; }
		
		//'someEnum'
		public Keyword getSomeEnumKeyword_0() { return cSomeEnumKeyword_0; }
		
		//a=EnumRuleA
		public Assignment getAAssignment_1() { return cAAssignment_1; }
		
		//EnumRuleA
		public RuleCall getAEnumRuleAEnumRuleCall_1_0() { return cAEnumRuleAEnumRuleCall_1_0; }
		
		//b=EnumRuleB
		public Assignment getBAssignment_2() { return cBAssignment_2; }
		
		//EnumRuleB
		public RuleCall getBEnumRuleBEnumRuleCall_2_0() { return cBEnumRuleBEnumRuleCall_2_0; }
		
		//c=EnumRuleC
		public Assignment getCAssignment_3() { return cCAssignment_3; }
		
		//EnumRuleC
		public RuleCall getCEnumRuleCEnumRuleCall_3_0() { return cCEnumRuleCEnumRuleCall_3_0; }
	}
	
	public class EnumRuleAElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.enumrules.MultiRuleEnumTestLanguage.EnumRuleA");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cAEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cAAKeyword_0_0 = (Keyword)cAEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cBEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cBBKeyword_1_0 = (Keyword)cBEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cCEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cCCKeyword_2_0 = (Keyword)cCEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum EnumRuleA returns MyEnum:
		//  A | B | C
		//;
		public EnumRule getRule() { return rule; }
		
		//A | B | C
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//A
		public EnumLiteralDeclaration getAEnumLiteralDeclaration_0() { return cAEnumLiteralDeclaration_0; }
		
		public Keyword getAAKeyword_0_0() { return cAAKeyword_0_0; }
		
		//B
		public EnumLiteralDeclaration getBEnumLiteralDeclaration_1() { return cBEnumLiteralDeclaration_1; }
		
		public Keyword getBBKeyword_1_0() { return cBBKeyword_1_0; }
		
		//C
		public EnumLiteralDeclaration getCEnumLiteralDeclaration_2() { return cCEnumLiteralDeclaration_2; }
		
		public Keyword getCCKeyword_2_0() { return cCCKeyword_2_0; }
	}
	public class EnumRuleBElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.enumrules.MultiRuleEnumTestLanguage.EnumRuleB");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cCEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cCCKeyword_0_0 = (Keyword)cCEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cDEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cDDKeyword_1_0 = (Keyword)cDEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cEEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cEEKeyword_2_0 = (Keyword)cEEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum EnumRuleB returns MyEnum:
		//  C | D | E
		//;
		public EnumRule getRule() { return rule; }
		
		//C | D | E
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//C
		public EnumLiteralDeclaration getCEnumLiteralDeclaration_0() { return cCEnumLiteralDeclaration_0; }
		
		public Keyword getCCKeyword_0_0() { return cCCKeyword_0_0; }
		
		//D
		public EnumLiteralDeclaration getDEnumLiteralDeclaration_1() { return cDEnumLiteralDeclaration_1; }
		
		public Keyword getDDKeyword_1_0() { return cDDKeyword_1_0; }
		
		//E
		public EnumLiteralDeclaration getEEnumLiteralDeclaration_2() { return cEEnumLiteralDeclaration_2; }
		
		public Keyword getEEKeyword_2_0() { return cEEKeyword_2_0; }
	}
	public class EnumRuleCElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.enumrules.MultiRuleEnumTestLanguage.EnumRuleC");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cAEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cAAKeyword_0_0 = (Keyword)cAEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cDEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cDDKeyword_1_0 = (Keyword)cDEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cBEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cBBKeyword_2_0 = (Keyword)cBEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum EnumRuleC returns MyEnum:
		//  A | D | B
		//;
		public EnumRule getRule() { return rule; }
		
		//A | D | B
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//A
		public EnumLiteralDeclaration getAEnumLiteralDeclaration_0() { return cAEnumLiteralDeclaration_0; }
		
		public Keyword getAAKeyword_0_0() { return cAAKeyword_0_0; }
		
		//D
		public EnumLiteralDeclaration getDEnumLiteralDeclaration_1() { return cDEnumLiteralDeclaration_1; }
		
		public Keyword getDDKeyword_1_0() { return cDDKeyword_1_0; }
		
		//B
		public EnumLiteralDeclaration getBEnumLiteralDeclaration_2() { return cBEnumLiteralDeclaration_2; }
		
		public Keyword getBBKeyword_2_0() { return cBBKeyword_2_0; }
	}
	
	private final ModelElements pModel;
	private final EnumRuleAElements eEnumRuleA;
	private final EnumRuleBElements eEnumRuleB;
	private final EnumRuleCElements eEnumRuleC;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MultiRuleEnumTestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.eEnumRuleA = new EnumRuleAElements();
		this.eEnumRuleB = new EnumRuleBElements();
		this.eEnumRuleC = new EnumRuleCElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.enumrules.MultiRuleEnumTestLanguage".equals(grammar.getName())) {
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
	//  'someEnum' a=EnumRuleA b=EnumRuleB c=EnumRuleC
	//;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//enum EnumRuleA returns MyEnum:
	//  A | B | C
	//;
	public EnumRuleAElements getEnumRuleAAccess() {
		return eEnumRuleA;
	}
	
	public EnumRule getEnumRuleARule() {
		return getEnumRuleAAccess().getRule();
	}
	
	//enum EnumRuleB returns MyEnum:
	//  C | D | E
	//;
	public EnumRuleBElements getEnumRuleBAccess() {
		return eEnumRuleB;
	}
	
	public EnumRule getEnumRuleBRule() {
		return getEnumRuleBAccess().getRule();
	}
	
	//enum EnumRuleC returns MyEnum:
	//  A | D | B
	//;
	public EnumRuleCElements getEnumRuleCAccess() {
		return eEnumRuleC;
	}
	
	public EnumRule getEnumRuleCRule() {
		return getEnumRuleCAccess().getRule();
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
