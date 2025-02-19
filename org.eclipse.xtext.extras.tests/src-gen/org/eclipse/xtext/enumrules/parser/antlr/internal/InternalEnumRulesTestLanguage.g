/*******************************************************************************
 * Copyright (c) 2011, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalEnumRulesTestLanguage;

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
import org.eclipse.xtext.enumrules.services.EnumRulesTestLanguageGrammarAccess;

}

@parser::members {

 	private EnumRulesTestLanguageGrammarAccess grammarAccess;

    public InternalEnumRulesTestLanguageParser(TokenStream input, EnumRulesTestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected EnumRulesTestLanguageGrammarAccess getGrammarAccess() {
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
		(
			otherlv_0='existing'
			{
				newLeafNode(otherlv_0, grammarAccess.getModelAccess().getExistingKeyword_0_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getModelAccess().getExistingExistingEnumEnumRuleCall_0_1_0());
					}
					lv_existing_1_0=ruleExistingEnum
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelRule());
						}
						set(
							$current,
							"existing",
							lv_existing_1_0,
							"org.eclipse.xtext.enumrules.EnumRulesTestLanguage.ExistingEnum");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_2='generated'
				{
					newLeafNode(otherlv_2, grammarAccess.getModelAccess().getGeneratedKeyword_0_2_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getModelAccess().getGeneratedGeneratedEnumEnumRuleCall_0_2_1_0());
						}
						lv_generated_3_0=ruleGeneratedEnum
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getModelRule());
							}
							set(
								$current,
								"generated",
								lv_generated_3_0,
								"org.eclipse.xtext.enumrules.EnumRulesTestLanguage.GeneratedEnum");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)?
		)
		    |
		(
			otherlv_4='generated'
			{
				newLeafNode(otherlv_4, grammarAccess.getModelAccess().getGeneratedKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getModelAccess().getGeneratedGeneratedEnumEnumRuleCall_1_1_0());
					}
					lv_generated_5_0=ruleGeneratedEnum
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelRule());
						}
						set(
							$current,
							"generated",
							lv_generated_5_0,
							"org.eclipse.xtext.enumrules.EnumRulesTestLanguage.GeneratedEnum");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Rule ExistingEnum
ruleExistingEnum returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='SameName'
			{
				$current = grammarAccess.getExistingEnumAccess().getSameNameEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getExistingEnumAccess().getSameNameEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='overridden'
			{
				$current = grammarAccess.getExistingEnumAccess().getOverriddenLiteralEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getExistingEnumAccess().getOverriddenLiteralEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='DifferentLiteral'
			{
				$current = grammarAccess.getExistingEnumAccess().getDifferentNameEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getExistingEnumAccess().getDifferentNameEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule GeneratedEnum
ruleGeneratedEnum returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='SameName'
			{
				$current = grammarAccess.getGeneratedEnumAccess().getSameNameEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGeneratedEnumAccess().getSameNameEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='DifferentLiteral'
			{
				$current = grammarAccess.getGeneratedEnumAccess().getDifferentNameEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGeneratedEnumAccess().getDifferentNameEnumLiteralDeclaration_1());
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
