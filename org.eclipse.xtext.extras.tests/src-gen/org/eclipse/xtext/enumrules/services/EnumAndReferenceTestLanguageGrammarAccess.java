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
import org.eclipse.xtext.CrossReference;
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
public class EnumAndReferenceTestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class EntityWithEnumAndReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.enumrules.EnumAndReferenceTestLanguage.EntityWithEnumAndReference");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTypeKindOfKeywordEnumRuleCall_0_0 = (RuleCall)cTypeAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cReferenceKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cRefAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cRefEntityWithEnumAndReferenceCrossReference_3_0 = (CrossReference)cRefAssignment_3.eContents().get(0);
		private final RuleCall cRefEntityWithEnumAndReferenceIDTerminalRuleCall_3_0_1 = (RuleCall)cRefEntityWithEnumAndReferenceCrossReference_3_0.eContents().get(1);
		
		//EntityWithEnumAndReference:
		//    type=KindOfKeyword name=ID 'reference' ref=[EntityWithEnumAndReference];
		@Override public ParserRule getRule() { return rule; }
		
		//type=KindOfKeyword name=ID 'reference' ref=[EntityWithEnumAndReference]
		public Group getGroup() { return cGroup; }
		
		//type=KindOfKeyword
		public Assignment getTypeAssignment_0() { return cTypeAssignment_0; }
		
		//KindOfKeyword
		public RuleCall getTypeKindOfKeywordEnumRuleCall_0_0() { return cTypeKindOfKeywordEnumRuleCall_0_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'reference'
		public Keyword getReferenceKeyword_2() { return cReferenceKeyword_2; }
		
		//ref=[EntityWithEnumAndReference]
		public Assignment getRefAssignment_3() { return cRefAssignment_3; }
		
		//[EntityWithEnumAndReference]
		public CrossReference getRefEntityWithEnumAndReferenceCrossReference_3_0() { return cRefEntityWithEnumAndReferenceCrossReference_3_0; }
		
		//ID
		public RuleCall getRefEntityWithEnumAndReferenceIDTerminalRuleCall_3_0_1() { return cRefEntityWithEnumAndReferenceIDTerminalRuleCall_3_0_1; }
	}
	
	public class KindOfKeywordElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.enumrules.EnumAndReferenceTestLanguage.KindOfKeyword");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cKindOfKeywordEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cKindOfKeywordKindOfKeywordKeyword_0_0 = (Keyword)cKindOfKeywordEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cAnotherEnumLiteralEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cAnotherEnumLiteralAnotherEnumLiteralKeyword_1_0 = (Keyword)cAnotherEnumLiteralEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum KindOfKeyword:
		//    kindOfKeyword | anotherEnumLiteral;
		public EnumRule getRule() { return rule; }
		
		//kindOfKeyword | anotherEnumLiteral
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//kindOfKeyword
		public EnumLiteralDeclaration getKindOfKeywordEnumLiteralDeclaration_0() { return cKindOfKeywordEnumLiteralDeclaration_0; }
		
		public Keyword getKindOfKeywordKindOfKeywordKeyword_0_0() { return cKindOfKeywordKindOfKeywordKeyword_0_0; }
		
		//anotherEnumLiteral
		public EnumLiteralDeclaration getAnotherEnumLiteralEnumLiteralDeclaration_1() { return cAnotherEnumLiteralEnumLiteralDeclaration_1; }
		
		public Keyword getAnotherEnumLiteralAnotherEnumLiteralKeyword_1_0() { return cAnotherEnumLiteralAnotherEnumLiteralKeyword_1_0; }
	}
	
	private final EntityWithEnumAndReferenceElements pEntityWithEnumAndReference;
	private final KindOfKeywordElements eKindOfKeyword;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public EnumAndReferenceTestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pEntityWithEnumAndReference = new EntityWithEnumAndReferenceElements();
		this.eKindOfKeyword = new KindOfKeywordElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.enumrules.EnumAndReferenceTestLanguage".equals(grammar.getName())) {
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

	
	//EntityWithEnumAndReference:
	//    type=KindOfKeyword name=ID 'reference' ref=[EntityWithEnumAndReference];
	public EntityWithEnumAndReferenceElements getEntityWithEnumAndReferenceAccess() {
		return pEntityWithEnumAndReference;
	}
	
	public ParserRule getEntityWithEnumAndReferenceRule() {
		return getEntityWithEnumAndReferenceAccess().getRule();
	}
	
	//enum KindOfKeyword:
	//    kindOfKeyword | anotherEnumLiteral;
	public KindOfKeywordElements getKindOfKeywordAccess() {
		return eKindOfKeyword;
	}
	
	public EnumRule getKindOfKeywordRule() {
		return getKindOfKeywordAccess().getRule();
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
