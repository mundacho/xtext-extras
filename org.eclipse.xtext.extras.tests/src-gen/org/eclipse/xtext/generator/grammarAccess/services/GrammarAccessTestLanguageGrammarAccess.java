/*******************************************************************************
 * Copyright (c) 2011, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.generator.grammarAccess.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
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
public class GrammarAccessTestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class RootElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.generator.grammarAccess.GrammarAccessTestLanguage.Root");
		private final Assignment cElementsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cElementsTypeParserRuleCall_0 = (RuleCall)cElementsAssignment.eContents().get(0);
		
		//Root returns root::AModel:
		//    (elements += Type)*;
		@Override public ParserRule getRule() { return rule; }
		
		//(elements += Type)*
		public Assignment getElementsAssignment() { return cElementsAssignment; }
		
		//Type
		public RuleCall getElementsTypeParserRuleCall_0() { return cElementsTypeParserRuleCall_0; }
	}
	public class TypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.generator.grammarAccess.GrammarAccessTestLanguage.Type");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cATypeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cAnotherTypeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Type returns root::AType:
		//    AType | AnotherType;
		@Override public ParserRule getRule() { return rule; }
		
		//AType | AnotherType
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//AType
		public RuleCall getATypeParserRuleCall_0() { return cATypeParserRuleCall_0; }
		
		//AnotherType
		public RuleCall getAnotherTypeParserRuleCall_1() { return cAnotherTypeParserRuleCall_1; }
	}
	public class ATypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.generator.grammarAccess.GrammarAccessTestLanguage.AType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFooKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Action cATypeAction_1 = (Action)cGroup.eContents().get(1);
		
		//AType returns root::AType:
		//    'foo' {root::AType};
		@Override public ParserRule getRule() { return rule; }
		
		//'foo' {root::AType}
		public Group getGroup() { return cGroup; }
		
		//'foo'
		public Keyword getFooKeyword_0() { return cFooKeyword_0; }
		
		//{root::AType}
		public Action getATypeAction_1() { return cATypeAction_1; }
	}
	public class AnotherTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.generator.grammarAccess.GrammarAccessTestLanguage.AnotherType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cBarKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Action cAnotherTypeAction_1 = (Action)cGroup.eContents().get(1);
		
		//AnotherType returns sub::AnotherType:
		//    'bar' {sub::AnotherType};
		@Override public ParserRule getRule() { return rule; }
		
		//'bar' {sub::AnotherType}
		public Group getGroup() { return cGroup; }
		
		//'bar'
		public Keyword getBarKeyword_0() { return cBarKeyword_0; }
		
		//{sub::AnotherType}
		public Action getAnotherTypeAction_1() { return cAnotherTypeAction_1; }
	}
	
	
	private final RootElements pRoot;
	private final TypeElements pType;
	private final ATypeElements pAType;
	private final AnotherTypeElements pAnotherType;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public GrammarAccessTestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pRoot = new RootElements();
		this.pType = new TypeElements();
		this.pAType = new ATypeElements();
		this.pAnotherType = new AnotherTypeElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.generator.grammarAccess.GrammarAccessTestLanguage".equals(grammar.getName())) {
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

	
	//Root returns root::AModel:
	//    (elements += Type)*;
	public RootElements getRootAccess() {
		return pRoot;
	}
	
	public ParserRule getRootRule() {
		return getRootAccess().getRule();
	}
	
	//Type returns root::AType:
	//    AType | AnotherType;
	public TypeElements getTypeAccess() {
		return pType;
	}
	
	public ParserRule getTypeRule() {
		return getTypeAccess().getRule();
	}
	
	//AType returns root::AType:
	//    'foo' {root::AType};
	public ATypeElements getATypeAccess() {
		return pAType;
	}
	
	public ParserRule getATypeRule() {
		return getATypeAccess().getRule();
	}
	
	//AnotherType returns sub::AnotherType:
	//    'bar' {sub::AnotherType};
	public AnotherTypeElements getAnotherTypeAccess() {
		return pAnotherType;
	}
	
	public ParserRule getAnotherTypeRule() {
		return getAnotherTypeAccess().getRule();
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
