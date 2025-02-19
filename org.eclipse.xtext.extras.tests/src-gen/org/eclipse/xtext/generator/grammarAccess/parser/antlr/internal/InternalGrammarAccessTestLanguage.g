/*******************************************************************************
 * Copyright (c) 2011, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalGrammarAccessTestLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.generator.grammarAccess.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.generator.grammarAccess.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.generator.grammarAccess.services.GrammarAccessTestLanguageGrammarAccess;

}

@parser::members {

 	private GrammarAccessTestLanguageGrammarAccess grammarAccess;

    public InternalGrammarAccessTestLanguageParser(TokenStream input, GrammarAccessTestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Root";
   	}

   	@Override
   	protected GrammarAccessTestLanguageGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleRoot
entryRuleRoot returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRootRule()); }
	iv_ruleRoot=ruleRoot
	{ $current=$iv_ruleRoot.current; }
	EOF;

// Rule Root
ruleRoot returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getRootAccess().getElementsTypeParserRuleCall_0());
			}
			lv_elements_0_0=ruleType
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getRootRule());
				}
				add(
					$current,
					"elements",
					lv_elements_0_0,
					"org.eclipse.xtext.generator.grammarAccess.GrammarAccessTestLanguage.Type");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleType
entryRuleType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypeRule()); }
	iv_ruleType=ruleType
	{ $current=$iv_ruleType.current; }
	EOF;

// Rule Type
ruleType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getTypeAccess().getATypeParserRuleCall_0());
		}
		this_AType_0=ruleAType
		{
			$current = $this_AType_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTypeAccess().getAnotherTypeParserRuleCall_1());
		}
		this_AnotherType_1=ruleAnotherType
		{
			$current = $this_AnotherType_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleAType
entryRuleAType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getATypeRule()); }
	iv_ruleAType=ruleAType
	{ $current=$iv_ruleAType.current; }
	EOF;

// Rule AType
ruleAType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='foo'
		{
			newLeafNode(otherlv_0, grammarAccess.getATypeAccess().getFooKeyword_0());
		}
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getATypeAccess().getATypeAction_1(),
					$current);
			}
		)
	)
;

// Entry rule entryRuleAnotherType
entryRuleAnotherType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAnotherTypeRule()); }
	iv_ruleAnotherType=ruleAnotherType
	{ $current=$iv_ruleAnotherType.current; }
	EOF;

// Rule AnotherType
ruleAnotherType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='bar'
		{
			newLeafNode(otherlv_0, grammarAccess.getAnotherTypeAccess().getBarKeyword_0());
		}
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getAnotherTypeAccess().getAnotherTypeAction_1(),
					$current);
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
