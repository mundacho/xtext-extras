/*******************************************************************************
 * Copyright (c) 2011, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalMultiRuleEnumTestLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.enumrules.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.enumrules.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.enumrules.services.MultiRuleEnumTestLanguageGrammarAccess;

}

@parser::members {

 	private MultiRuleEnumTestLanguageGrammarAccess grammarAccess;

    public InternalMultiRuleEnumTestLanguageParser(TokenStream input, MultiRuleEnumTestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected MultiRuleEnumTestLanguageGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='someEnum'
		{
			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getSomeEnumKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getAEnumRuleAEnumRuleCall_1_0());
				}
				lv_a_1_0=ruleEnumRuleA
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"a",
						lv_a_1_0,
						"org.eclipse.xtext.enumrules.MultiRuleEnumTestLanguage.EnumRuleA");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getBEnumRuleBEnumRuleCall_2_0());
				}
				lv_b_2_0=ruleEnumRuleB
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"b",
						lv_b_2_0,
						"org.eclipse.xtext.enumrules.MultiRuleEnumTestLanguage.EnumRuleB");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getCEnumRuleCEnumRuleCall_3_0());
				}
				lv_c_3_0=ruleEnumRuleC
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"c",
						lv_c_3_0,
						"org.eclipse.xtext.enumrules.MultiRuleEnumTestLanguage.EnumRuleC");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Rule EnumRuleA
ruleEnumRuleA returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='A'
			{
				$current = grammarAccess.getEnumRuleAAccess().getAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getEnumRuleAAccess().getAEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='B'
			{
				$current = grammarAccess.getEnumRuleAAccess().getBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getEnumRuleAAccess().getBEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='C'
			{
				$current = grammarAccess.getEnumRuleAAccess().getCEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getEnumRuleAAccess().getCEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule EnumRuleB
ruleEnumRuleB returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='C'
			{
				$current = grammarAccess.getEnumRuleBAccess().getCEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getEnumRuleBAccess().getCEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='D'
			{
				$current = grammarAccess.getEnumRuleBAccess().getDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getEnumRuleBAccess().getDEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='E'
			{
				$current = grammarAccess.getEnumRuleBAccess().getEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getEnumRuleBAccess().getEEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule EnumRuleC
ruleEnumRuleC returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='A'
			{
				$current = grammarAccess.getEnumRuleCAccess().getAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getEnumRuleCAccess().getAEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='D'
			{
				$current = grammarAccess.getEnumRuleCAccess().getDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getEnumRuleCAccess().getDEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='B'
			{
				$current = grammarAccess.getEnumRuleCAccess().getBEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getEnumRuleCAccess().getBEnumLiteralDeclaration_2());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
