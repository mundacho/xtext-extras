/*******************************************************************************
 * Copyright (c) 2011, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalEnumAndReferenceTestLanguage;

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
import org.eclipse.xtext.enumrules.services.EnumAndReferenceTestLanguageGrammarAccess;

}

@parser::members {

 	private EnumAndReferenceTestLanguageGrammarAccess grammarAccess;

    public InternalEnumAndReferenceTestLanguageParser(TokenStream input, EnumAndReferenceTestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "EntityWithEnumAndReference";
   	}

   	@Override
   	protected EnumAndReferenceTestLanguageGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleEntityWithEnumAndReference
entryRuleEntityWithEnumAndReference returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntityWithEnumAndReferenceRule()); }
	iv_ruleEntityWithEnumAndReference=ruleEntityWithEnumAndReference
	{ $current=$iv_ruleEntityWithEnumAndReference.current; }
	EOF;

// Rule EntityWithEnumAndReference
ruleEntityWithEnumAndReference returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getEntityWithEnumAndReferenceAccess().getTypeKindOfKeywordEnumRuleCall_0_0());
				}
				lv_type_0_0=ruleKindOfKeyword
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEntityWithEnumAndReferenceRule());
					}
					set(
						$current,
						"type",
						lv_type_0_0,
						"org.eclipse.xtext.enumrules.EnumAndReferenceTestLanguage.KindOfKeyword");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getEntityWithEnumAndReferenceAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntityWithEnumAndReferenceRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='reference'
		{
			newLeafNode(otherlv_2, grammarAccess.getEntityWithEnumAndReferenceAccess().getReferenceKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntityWithEnumAndReferenceRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getEntityWithEnumAndReferenceAccess().getRefEntityWithEnumAndReferenceCrossReference_3_0());
				}
			)
		)
	)
;

// Rule KindOfKeyword
ruleKindOfKeyword returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='kindOfKeyword'
			{
				$current = grammarAccess.getKindOfKeywordAccess().getKindOfKeywordEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getKindOfKeywordAccess().getKindOfKeywordEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='anotherEnumLiteral'
			{
				$current = grammarAccess.getKindOfKeywordAccess().getAnotherEnumLiteralEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getKindOfKeywordAccess().getAnotherEnumLiteralEnumLiteralDeclaration_1());
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
