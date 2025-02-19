/*******************************************************************************
 * Copyright (c) 2011, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.purexbase.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.xbase.services.XbaseGrammarAccess;
import org.eclipse.xtext.xbase.services.XtypeGrammarAccess;

@Singleton
public class PureXbaseGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.purexbase.PureXbase.Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cImportSectionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cImportSectionXImportSectionParserRuleCall_0_0 = (RuleCall)cImportSectionAssignment_0.eContents().get(0);
		private final Assignment cBlockAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cBlockSpecialBlockExpressionParserRuleCall_1_0 = (RuleCall)cBlockAssignment_1.eContents().get(0);
		
		//Model:
		//    importSection=XImportSection? block=SpecialBlockExpression;
		@Override public ParserRule getRule() { return rule; }
		
		//importSection=XImportSection? block=SpecialBlockExpression
		public Group getGroup() { return cGroup; }
		
		//importSection=XImportSection?
		public Assignment getImportSectionAssignment_0() { return cImportSectionAssignment_0; }
		
		//XImportSection
		public RuleCall getImportSectionXImportSectionParserRuleCall_0_0() { return cImportSectionXImportSectionParserRuleCall_0_0; }
		
		//block=SpecialBlockExpression
		public Assignment getBlockAssignment_1() { return cBlockAssignment_1; }
		
		//SpecialBlockExpression
		public RuleCall getBlockSpecialBlockExpressionParserRuleCall_1_0() { return cBlockSpecialBlockExpressionParserRuleCall_1_0; }
	}
	public class SpecialBlockExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.purexbase.PureXbase.SpecialBlockExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cXBlockExpressionAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cExpressionsAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cExpressionsXExpressionOrVarDeclarationParserRuleCall_1_0_0 = (RuleCall)cExpressionsAssignment_1_0.eContents().get(0);
		private final Keyword cSemicolonKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		
		//SpecialBlockExpression returns xbase::XBlockExpression:
		//    {xbase::XBlockExpression}
		//    (expressions+=XExpressionOrVarDeclaration ';'?)*;
		@Override public ParserRule getRule() { return rule; }
		
		//{xbase::XBlockExpression}
		//(expressions+=XExpressionOrVarDeclaration ';'?)*
		public Group getGroup() { return cGroup; }
		
		//{xbase::XBlockExpression}
		public Action getXBlockExpressionAction_0() { return cXBlockExpressionAction_0; }
		
		//(expressions+=XExpressionOrVarDeclaration ';'?)*
		public Group getGroup_1() { return cGroup_1; }
		
		//expressions+=XExpressionOrVarDeclaration
		public Assignment getExpressionsAssignment_1_0() { return cExpressionsAssignment_1_0; }
		
		//XExpressionOrVarDeclaration
		public RuleCall getExpressionsXExpressionOrVarDeclarationParserRuleCall_1_0_0() { return cExpressionsXExpressionOrVarDeclarationParserRuleCall_1_0_0; }
		
		//';'?
		public Keyword getSemicolonKeyword_1_1() { return cSemicolonKeyword_1_1; }
	}
	public class FeatureCallIDElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.purexbase.PureXbase.FeatureCallID");
		private final RuleCall cValidIDParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//@Override
		//FeatureCallID:
		//    ValidID;
		@Override public ParserRule getRule() { return rule; }
		
		//ValidID
		public RuleCall getValidIDParserRuleCall() { return cValidIDParserRuleCall; }
	}
	public class XTryCatchFinallyExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.purexbase.PureXbase.XTryCatchFinallyExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cXTryCatchFinallyExpressionAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cTryKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Group cGroup_2_0 = (Group)cAlternatives_2.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_2_0_0 = (Keyword)cGroup_2_0.eContents().get(0);
		private final Assignment cResourcesAssignment_2_0_1 = (Assignment)cGroup_2_0.eContents().get(1);
		private final RuleCall cResourcesInitialisedVariableDeclarationParserRuleCall_2_0_1_0 = (RuleCall)cResourcesAssignment_2_0_1.eContents().get(0);
		private final Group cGroup_2_0_2 = (Group)cGroup_2_0.eContents().get(2);
		private final Keyword cSemicolonKeyword_2_0_2_0 = (Keyword)cGroup_2_0_2.eContents().get(0);
		private final Assignment cResourcesAssignment_2_0_2_1 = (Assignment)cGroup_2_0_2.eContents().get(1);
		private final RuleCall cResourcesInitialisedVariableDeclarationParserRuleCall_2_0_2_1_0 = (RuleCall)cResourcesAssignment_2_0_2_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2_0_3 = (Keyword)cGroup_2_0.eContents().get(3);
		private final Keyword cRightParenthesisKeyword_2_0_4 = (Keyword)cGroup_2_0.eContents().get(4);
		private final Assignment cExpressionAssignment_2_0_5 = (Assignment)cGroup_2_0.eContents().get(5);
		private final RuleCall cExpressionXExpressionParserRuleCall_2_0_5_0 = (RuleCall)cExpressionAssignment_2_0_5.eContents().get(0);
		private final Group cGroup_2_0_6 = (Group)cGroup_2_0.eContents().get(6);
		private final Alternatives cAlternatives_2_0_6_0 = (Alternatives)cGroup_2_0_6.eContents().get(0);
		private final Group cGroup_2_0_6_0_0 = (Group)cAlternatives_2_0_6_0.eContents().get(0);
		private final Assignment cCatchClausesAssignment_2_0_6_0_0_0 = (Assignment)cGroup_2_0_6_0_0.eContents().get(0);
		private final RuleCall cCatchClausesXCatchClauseParserRuleCall_2_0_6_0_0_0_0 = (RuleCall)cCatchClausesAssignment_2_0_6_0_0_0.eContents().get(0);
		private final Group cGroup_2_0_6_0_0_1 = (Group)cGroup_2_0_6_0_0.eContents().get(1);
		private final Keyword cFinallyKeyword_2_0_6_0_0_1_0 = (Keyword)cGroup_2_0_6_0_0_1.eContents().get(0);
		private final Assignment cFinallyExpressionAssignment_2_0_6_0_0_1_1 = (Assignment)cGroup_2_0_6_0_0_1.eContents().get(1);
		private final RuleCall cFinallyExpressionXExpressionParserRuleCall_2_0_6_0_0_1_1_0 = (RuleCall)cFinallyExpressionAssignment_2_0_6_0_0_1_1.eContents().get(0);
		private final Group cGroup_2_0_6_0_1 = (Group)cAlternatives_2_0_6_0.eContents().get(1);
		private final Keyword cFinallyKeyword_2_0_6_0_1_0 = (Keyword)cGroup_2_0_6_0_1.eContents().get(0);
		private final Assignment cFinallyExpressionAssignment_2_0_6_0_1_1 = (Assignment)cGroup_2_0_6_0_1.eContents().get(1);
		private final RuleCall cFinallyExpressionXExpressionParserRuleCall_2_0_6_0_1_1_0 = (RuleCall)cFinallyExpressionAssignment_2_0_6_0_1_1.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cAlternatives_2.eContents().get(1);
		private final Assignment cExpressionAssignment_2_1_0 = (Assignment)cGroup_2_1.eContents().get(0);
		private final RuleCall cExpressionXExpressionParserRuleCall_2_1_0_0 = (RuleCall)cExpressionAssignment_2_1_0.eContents().get(0);
		private final Alternatives cAlternatives_2_1_1 = (Alternatives)cGroup_2_1.eContents().get(1);
		private final Group cGroup_2_1_1_0 = (Group)cAlternatives_2_1_1.eContents().get(0);
		private final Assignment cCatchClausesAssignment_2_1_1_0_0 = (Assignment)cGroup_2_1_1_0.eContents().get(0);
		private final RuleCall cCatchClausesXCatchClauseParserRuleCall_2_1_1_0_0_0 = (RuleCall)cCatchClausesAssignment_2_1_1_0_0.eContents().get(0);
		private final Group cGroup_2_1_1_0_1 = (Group)cGroup_2_1_1_0.eContents().get(1);
		private final Keyword cFinallyKeyword_2_1_1_0_1_0 = (Keyword)cGroup_2_1_1_0_1.eContents().get(0);
		private final Assignment cFinallyExpressionAssignment_2_1_1_0_1_1 = (Assignment)cGroup_2_1_1_0_1.eContents().get(1);
		private final RuleCall cFinallyExpressionXExpressionParserRuleCall_2_1_1_0_1_1_0 = (RuleCall)cFinallyExpressionAssignment_2_1_1_0_1_1.eContents().get(0);
		private final Group cGroup_2_1_1_1 = (Group)cAlternatives_2_1_1.eContents().get(1);
		private final Keyword cFinallyKeyword_2_1_1_1_0 = (Keyword)cGroup_2_1_1_1.eContents().get(0);
		private final Assignment cFinallyExpressionAssignment_2_1_1_1_1 = (Assignment)cGroup_2_1_1_1.eContents().get(1);
		private final RuleCall cFinallyExpressionXExpressionParserRuleCall_2_1_1_1_1_0 = (RuleCall)cFinallyExpressionAssignment_2_1_1_1_1.eContents().get(0);
		
		//@Override
		//XTryCatchFinallyExpression returns xbase::XExpression:
		//    {xbase::XTryCatchFinallyExpression}
		//    'try' (
		//        '(' resources+=InitialisedVariableDeclaration (';' resources+=InitialisedVariableDeclaration)* ';'? ')'
		//        expression=XExpression
		//        ->(
		//            catchClauses+=XCatchClause+
		//            (=>'finally' finallyExpression=XExpression)?
		//        |    'finally' finallyExpression=XExpression
		//        )?
		//    |
		//        expression=XExpression
		//        (
		//            catchClauses+=XCatchClause+
		//            (=>'finally' finallyExpression=XExpression)?
		//        |    'finally' finallyExpression=XExpression
		//        )
		//    )
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{xbase::XTryCatchFinallyExpression}
		//'try' (
		//    '(' resources+=InitialisedVariableDeclaration (';' resources+=InitialisedVariableDeclaration)* ';'? ')'
		//    expression=XExpression
		//    ->(
		//        catchClauses+=XCatchClause+
		//        (=>'finally' finallyExpression=XExpression)?
		//    |    'finally' finallyExpression=XExpression
		//    )?
		//|
		//    expression=XExpression
		//    (
		//        catchClauses+=XCatchClause+
		//        (=>'finally' finallyExpression=XExpression)?
		//    |    'finally' finallyExpression=XExpression
		//    )
		//)
		public Group getGroup() { return cGroup; }
		
		//{xbase::XTryCatchFinallyExpression}
		public Action getXTryCatchFinallyExpressionAction_0() { return cXTryCatchFinallyExpressionAction_0; }
		
		//'try'
		public Keyword getTryKeyword_1() { return cTryKeyword_1; }
		
		//(
		//       '(' resources+=InitialisedVariableDeclaration (';' resources+=InitialisedVariableDeclaration)* ';'? ')'
		//       expression=XExpression
		//       ->(
		//           catchClauses+=XCatchClause+
		//           (=>'finally' finallyExpression=XExpression)?
		//       |    'finally' finallyExpression=XExpression
		//       )?
		//   |
		//       expression=XExpression
		//       (
		//           catchClauses+=XCatchClause+
		//           (=>'finally' finallyExpression=XExpression)?
		//       |    'finally' finallyExpression=XExpression
		//       )
		//   )
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//'(' resources+=InitialisedVariableDeclaration (';' resources+=InitialisedVariableDeclaration)* ';'? ')'
		//expression=XExpression
		//->(
		//    catchClauses+=XCatchClause+
		//    (=>'finally' finallyExpression=XExpression)?
		//|    'finally' finallyExpression=XExpression
		//)?
		public Group getGroup_2_0() { return cGroup_2_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_2_0_0() { return cLeftParenthesisKeyword_2_0_0; }
		
		//resources+=InitialisedVariableDeclaration
		public Assignment getResourcesAssignment_2_0_1() { return cResourcesAssignment_2_0_1; }
		
		//InitialisedVariableDeclaration
		public RuleCall getResourcesInitialisedVariableDeclarationParserRuleCall_2_0_1_0() { return cResourcesInitialisedVariableDeclarationParserRuleCall_2_0_1_0; }
		
		//(';' resources+=InitialisedVariableDeclaration)*
		public Group getGroup_2_0_2() { return cGroup_2_0_2; }
		
		//';'
		public Keyword getSemicolonKeyword_2_0_2_0() { return cSemicolonKeyword_2_0_2_0; }
		
		//resources+=InitialisedVariableDeclaration
		public Assignment getResourcesAssignment_2_0_2_1() { return cResourcesAssignment_2_0_2_1; }
		
		//InitialisedVariableDeclaration
		public RuleCall getResourcesInitialisedVariableDeclarationParserRuleCall_2_0_2_1_0() { return cResourcesInitialisedVariableDeclarationParserRuleCall_2_0_2_1_0; }
		
		//';'?
		public Keyword getSemicolonKeyword_2_0_3() { return cSemicolonKeyword_2_0_3; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2_0_4() { return cRightParenthesisKeyword_2_0_4; }
		
		//expression=XExpression
		public Assignment getExpressionAssignment_2_0_5() { return cExpressionAssignment_2_0_5; }
		
		//XExpression
		public RuleCall getExpressionXExpressionParserRuleCall_2_0_5_0() { return cExpressionXExpressionParserRuleCall_2_0_5_0; }
		
		//->(
		//    catchClauses+=XCatchClause+
		//    (=>'finally' finallyExpression=XExpression)?
		//|    'finally' finallyExpression=XExpression
		//)?
		public Group getGroup_2_0_6() { return cGroup_2_0_6; }
		
		//    catchClauses+=XCatchClause+
		//    (=>'finally' finallyExpression=XExpression)?
		//|    'finally' finallyExpression=XExpression
		public Alternatives getAlternatives_2_0_6_0() { return cAlternatives_2_0_6_0; }
		
		//catchClauses+=XCatchClause+
		//(=>'finally' finallyExpression=XExpression)?
		public Group getGroup_2_0_6_0_0() { return cGroup_2_0_6_0_0; }
		
		//catchClauses+=XCatchClause+
		public Assignment getCatchClausesAssignment_2_0_6_0_0_0() { return cCatchClausesAssignment_2_0_6_0_0_0; }
		
		//XCatchClause
		public RuleCall getCatchClausesXCatchClauseParserRuleCall_2_0_6_0_0_0_0() { return cCatchClausesXCatchClauseParserRuleCall_2_0_6_0_0_0_0; }
		
		//(=>'finally' finallyExpression=XExpression)?
		public Group getGroup_2_0_6_0_0_1() { return cGroup_2_0_6_0_0_1; }
		
		//=>'finally'
		public Keyword getFinallyKeyword_2_0_6_0_0_1_0() { return cFinallyKeyword_2_0_6_0_0_1_0; }
		
		//finallyExpression=XExpression
		public Assignment getFinallyExpressionAssignment_2_0_6_0_0_1_1() { return cFinallyExpressionAssignment_2_0_6_0_0_1_1; }
		
		//XExpression
		public RuleCall getFinallyExpressionXExpressionParserRuleCall_2_0_6_0_0_1_1_0() { return cFinallyExpressionXExpressionParserRuleCall_2_0_6_0_0_1_1_0; }
		
		//'finally' finallyExpression=XExpression
		public Group getGroup_2_0_6_0_1() { return cGroup_2_0_6_0_1; }
		
		//'finally'
		public Keyword getFinallyKeyword_2_0_6_0_1_0() { return cFinallyKeyword_2_0_6_0_1_0; }
		
		//finallyExpression=XExpression
		public Assignment getFinallyExpressionAssignment_2_0_6_0_1_1() { return cFinallyExpressionAssignment_2_0_6_0_1_1; }
		
		//XExpression
		public RuleCall getFinallyExpressionXExpressionParserRuleCall_2_0_6_0_1_1_0() { return cFinallyExpressionXExpressionParserRuleCall_2_0_6_0_1_1_0; }
		
		//expression=XExpression
		//(
		//    catchClauses+=XCatchClause+
		//    (=>'finally' finallyExpression=XExpression)?
		//|    'finally' finallyExpression=XExpression
		//)
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//expression=XExpression
		public Assignment getExpressionAssignment_2_1_0() { return cExpressionAssignment_2_1_0; }
		
		//XExpression
		public RuleCall getExpressionXExpressionParserRuleCall_2_1_0_0() { return cExpressionXExpressionParserRuleCall_2_1_0_0; }
		
		//(
		//    catchClauses+=XCatchClause+
		//    (=>'finally' finallyExpression=XExpression)?
		//|    'finally' finallyExpression=XExpression
		//)
		public Alternatives getAlternatives_2_1_1() { return cAlternatives_2_1_1; }
		
		//catchClauses+=XCatchClause+
		//(=>'finally' finallyExpression=XExpression)?
		public Group getGroup_2_1_1_0() { return cGroup_2_1_1_0; }
		
		//catchClauses+=XCatchClause+
		public Assignment getCatchClausesAssignment_2_1_1_0_0() { return cCatchClausesAssignment_2_1_1_0_0; }
		
		//XCatchClause
		public RuleCall getCatchClausesXCatchClauseParserRuleCall_2_1_1_0_0_0() { return cCatchClausesXCatchClauseParserRuleCall_2_1_1_0_0_0; }
		
		//(=>'finally' finallyExpression=XExpression)?
		public Group getGroup_2_1_1_0_1() { return cGroup_2_1_1_0_1; }
		
		//=>'finally'
		public Keyword getFinallyKeyword_2_1_1_0_1_0() { return cFinallyKeyword_2_1_1_0_1_0; }
		
		//finallyExpression=XExpression
		public Assignment getFinallyExpressionAssignment_2_1_1_0_1_1() { return cFinallyExpressionAssignment_2_1_1_0_1_1; }
		
		//XExpression
		public RuleCall getFinallyExpressionXExpressionParserRuleCall_2_1_1_0_1_1_0() { return cFinallyExpressionXExpressionParserRuleCall_2_1_1_0_1_1_0; }
		
		//'finally' finallyExpression=XExpression
		public Group getGroup_2_1_1_1() { return cGroup_2_1_1_1; }
		
		//'finally'
		public Keyword getFinallyKeyword_2_1_1_1_0() { return cFinallyKeyword_2_1_1_1_0; }
		
		//finallyExpression=XExpression
		public Assignment getFinallyExpressionAssignment_2_1_1_1_1() { return cFinallyExpressionAssignment_2_1_1_1_1; }
		
		//XExpression
		public RuleCall getFinallyExpressionXExpressionParserRuleCall_2_1_1_1_1_0() { return cFinallyExpressionXExpressionParserRuleCall_2_1_1_1_1_0; }
	}
	public class InitialisedVariableDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.purexbase.PureXbase.InitialisedVariableDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cXVariableDeclarationAction_0 = (Action)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cWriteableAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final Keyword cWriteableVarKeyword_1_0_0 = (Keyword)cWriteableAssignment_1_0.eContents().get(0);
		private final Keyword cValKeyword_1_1 = (Keyword)cAlternatives_1.eContents().get(1);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Group cGroup_2_0 = (Group)cAlternatives_2.eContents().get(0);
		private final Group cGroup_2_0_0 = (Group)cGroup_2_0.eContents().get(0);
		private final Assignment cTypeAssignment_2_0_0_0 = (Assignment)cGroup_2_0_0.eContents().get(0);
		private final RuleCall cTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0 = (RuleCall)cTypeAssignment_2_0_0_0.eContents().get(0);
		private final Assignment cNameAssignment_2_0_0_1 = (Assignment)cGroup_2_0_0.eContents().get(1);
		private final RuleCall cNameValidIDParserRuleCall_2_0_0_1_0 = (RuleCall)cNameAssignment_2_0_0_1.eContents().get(0);
		private final Assignment cNameAssignment_2_1 = (Assignment)cAlternatives_2.eContents().get(1);
		private final RuleCall cNameValidIDParserRuleCall_2_1_0 = (RuleCall)cNameAssignment_2_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cRightAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cRightXExpressionParserRuleCall_4_0 = (RuleCall)cRightAssignment_4.eContents().get(0);
		
		//InitialisedVariableDeclaration returns xbase::XVariableDeclaration:
		//    {xbase::XVariableDeclaration}
		//    (writeable?='var'|'val')
		//    (=>(type=JvmTypeReference name=ValidID) | name=ValidID) '=' right=XExpression
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{xbase::XVariableDeclaration}
		//(writeable?='var'|'val')
		//(=>(type=JvmTypeReference name=ValidID) | name=ValidID) '=' right=XExpression
		public Group getGroup() { return cGroup; }
		
		//{xbase::XVariableDeclaration}
		public Action getXVariableDeclarationAction_0() { return cXVariableDeclarationAction_0; }
		
		//(writeable?='var'|'val')
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//writeable?='var'
		public Assignment getWriteableAssignment_1_0() { return cWriteableAssignment_1_0; }
		
		//'var'
		public Keyword getWriteableVarKeyword_1_0_0() { return cWriteableVarKeyword_1_0_0; }
		
		//'val'
		public Keyword getValKeyword_1_1() { return cValKeyword_1_1; }
		
		//(=>(type=JvmTypeReference name=ValidID) | name=ValidID)
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//=>(type=JvmTypeReference name=ValidID)
		public Group getGroup_2_0() { return cGroup_2_0; }
		
		//type=JvmTypeReference name=ValidID
		public Group getGroup_2_0_0() { return cGroup_2_0_0; }
		
		//type=JvmTypeReference
		public Assignment getTypeAssignment_2_0_0_0() { return cTypeAssignment_2_0_0_0; }
		
		//JvmTypeReference
		public RuleCall getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0() { return cTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0; }
		
		//name=ValidID
		public Assignment getNameAssignment_2_0_0_1() { return cNameAssignment_2_0_0_1; }
		
		//ValidID
		public RuleCall getNameValidIDParserRuleCall_2_0_0_1_0() { return cNameValidIDParserRuleCall_2_0_0_1_0; }
		
		//name=ValidID
		public Assignment getNameAssignment_2_1() { return cNameAssignment_2_1; }
		
		//ValidID
		public RuleCall getNameValidIDParserRuleCall_2_1_0() { return cNameValidIDParserRuleCall_2_1_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_3() { return cEqualsSignKeyword_3; }
		
		//right=XExpression
		public Assignment getRightAssignment_4() { return cRightAssignment_4; }
		
		//XExpression
		public RuleCall getRightXExpressionParserRuleCall_4_0() { return cRightXExpressionParserRuleCall_4_0; }
	}
	public class XAssignmentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.purexbase.PureXbase.XAssignment");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cXAssignmentAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Assignment cFeatureAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final CrossReference cFeatureJvmIdentifiableElementCrossReference_0_1_0 = (CrossReference)cFeatureAssignment_0_1.eContents().get(0);
		private final RuleCall cFeatureJvmIdentifiableElementFeatureCallIDParserRuleCall_0_1_0_1 = (RuleCall)cFeatureJvmIdentifiableElementCrossReference_0_1_0.eContents().get(1);
		private final RuleCall cOpSingleAssignParserRuleCall_0_2 = (RuleCall)cGroup_0.eContents().get(2);
		private final Assignment cValueAssignment_0_3 = (Assignment)cGroup_0.eContents().get(3);
		private final RuleCall cValueXAssignmentParserRuleCall_0_3_0 = (RuleCall)cValueAssignment_0_3.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final RuleCall cXConditionalExpressionParserRuleCall_1_0 = (RuleCall)cGroup_1.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cGroup_1.eContents().get(1);
		private final Group cGroup_1_1_0 = (Group)cGroup_1_1.eContents().get(0);
		private final Group cGroup_1_1_0_0 = (Group)cGroup_1_1_0.eContents().get(0);
		private final Action cXBinaryOperationLeftOperandAction_1_1_0_0_0 = (Action)cGroup_1_1_0_0.eContents().get(0);
		private final Assignment cFeatureAssignment_1_1_0_0_1 = (Assignment)cGroup_1_1_0_0.eContents().get(1);
		private final CrossReference cFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0 = (CrossReference)cFeatureAssignment_1_1_0_0_1.eContents().get(0);
		private final RuleCall cFeatureJvmIdentifiableElementOpMultiAssignParserRuleCall_1_1_0_0_1_0_1 = (RuleCall)cFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0.eContents().get(1);
		private final Assignment cRightOperandAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cRightOperandXAssignmentParserRuleCall_1_1_1_0 = (RuleCall)cRightOperandAssignment_1_1_1.eContents().get(0);
		
		//@Override
		//XAssignment returns xbase::XExpression :
		//    {xbase::XAssignment} feature=[types::JvmIdentifiableElement|FeatureCallID] OpSingleAssign value=XAssignment |
		//    XConditionalExpression (
		//        =>({xbase::XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpMultiAssign]) rightOperand=XAssignment
		//    )?;
		@Override public ParserRule getRule() { return rule; }
		
		//{xbase::XAssignment} feature=[types::JvmIdentifiableElement|FeatureCallID] OpSingleAssign value=XAssignment |
		//XConditionalExpression (
		//    =>({xbase::XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpMultiAssign]) rightOperand=XAssignment
		//)?
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{xbase::XAssignment} feature=[types::JvmIdentifiableElement|FeatureCallID] OpSingleAssign value=XAssignment
		public Group getGroup_0() { return cGroup_0; }
		
		//{xbase::XAssignment}
		public Action getXAssignmentAction_0_0() { return cXAssignmentAction_0_0; }
		
		//feature=[types::JvmIdentifiableElement|FeatureCallID]
		public Assignment getFeatureAssignment_0_1() { return cFeatureAssignment_0_1; }
		
		//[types::JvmIdentifiableElement|FeatureCallID]
		public CrossReference getFeatureJvmIdentifiableElementCrossReference_0_1_0() { return cFeatureJvmIdentifiableElementCrossReference_0_1_0; }
		
		//FeatureCallID
		public RuleCall getFeatureJvmIdentifiableElementFeatureCallIDParserRuleCall_0_1_0_1() { return cFeatureJvmIdentifiableElementFeatureCallIDParserRuleCall_0_1_0_1; }
		
		//OpSingleAssign
		public RuleCall getOpSingleAssignParserRuleCall_0_2() { return cOpSingleAssignParserRuleCall_0_2; }
		
		//value=XAssignment
		public Assignment getValueAssignment_0_3() { return cValueAssignment_0_3; }
		
		//XAssignment
		public RuleCall getValueXAssignmentParserRuleCall_0_3_0() { return cValueXAssignmentParserRuleCall_0_3_0; }
		
		//XConditionalExpression (
		//    =>({xbase::XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpMultiAssign]) rightOperand=XAssignment
		//)?
		public Group getGroup_1() { return cGroup_1; }
		
		//XConditionalExpression
		public RuleCall getXConditionalExpressionParserRuleCall_1_0() { return cXConditionalExpressionParserRuleCall_1_0; }
		
		//(
		//       =>({xbase::XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpMultiAssign]) rightOperand=XAssignment
		//   )?
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//=>({xbase::XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpMultiAssign])
		public Group getGroup_1_1_0() { return cGroup_1_1_0; }
		
		//{xbase::XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpMultiAssign]
		public Group getGroup_1_1_0_0() { return cGroup_1_1_0_0; }
		
		//{xbase::XBinaryOperation.leftOperand=current}
		public Action getXBinaryOperationLeftOperandAction_1_1_0_0_0() { return cXBinaryOperationLeftOperandAction_1_1_0_0_0; }
		
		//feature=[types::JvmIdentifiableElement|OpMultiAssign]
		public Assignment getFeatureAssignment_1_1_0_0_1() { return cFeatureAssignment_1_1_0_0_1; }
		
		//[types::JvmIdentifiableElement|OpMultiAssign]
		public CrossReference getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0() { return cFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0; }
		
		//OpMultiAssign
		public RuleCall getFeatureJvmIdentifiableElementOpMultiAssignParserRuleCall_1_1_0_0_1_0_1() { return cFeatureJvmIdentifiableElementOpMultiAssignParserRuleCall_1_1_0_0_1_0_1; }
		
		//rightOperand=XAssignment
		public Assignment getRightOperandAssignment_1_1_1() { return cRightOperandAssignment_1_1_1; }
		
		//XAssignment
		public RuleCall getRightOperandXAssignmentParserRuleCall_1_1_1_0() { return cRightOperandXAssignmentParserRuleCall_1_1_1_0; }
	}
	public class XConditionalExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.purexbase.PureXbase.XConditionalExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cXOrExpressionParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cGroup_1.eContents().get(0);
		private final Group cGroup_1_0_0 = (Group)cGroup_1_0.eContents().get(0);
		private final Action cXIfExpressionIfAction_1_0_0_0 = (Action)cGroup_1_0_0.eContents().get(0);
		private final Assignment cConditionalExpressionAssignment_1_0_0_1 = (Assignment)cGroup_1_0_0.eContents().get(1);
		private final Keyword cConditionalExpressionQuestionMarkKeyword_1_0_0_1_0 = (Keyword)cConditionalExpressionAssignment_1_0_0_1.eContents().get(0);
		private final Assignment cThenAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cThenXExpressionParserRuleCall_1_1_0 = (RuleCall)cThenAssignment_1_1.eContents().get(0);
		private final Group cGroup_1_2 = (Group)cGroup_1.eContents().get(2);
		private final Keyword cColonKeyword_1_2_0 = (Keyword)cGroup_1_2.eContents().get(0);
		private final Assignment cElseAssignment_1_2_1 = (Assignment)cGroup_1_2.eContents().get(1);
		private final RuleCall cElseXExpressionParserRuleCall_1_2_1_0 = (RuleCall)cElseAssignment_1_2_1.eContents().get(0);
		
		//XConditionalExpression returns xbase::XExpression :
		//    XOrExpression (
		//        // The java grammar does only allow other XConditionalExpression after the colon, but we can be more relaxed
		//        ->({xbase::XIfExpression.if=current} conditionalExpression?='?') then=XExpression (->':' else=XExpression)?
		//    )?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//XOrExpression (
		//    // The java grammar does only allow other XConditionalExpression after the colon, but we can be more relaxed
		//    ->({xbase::XIfExpression.if=current} conditionalExpression?='?') then=XExpression (->':' else=XExpression)?
		//)?
		public Group getGroup() { return cGroup; }
		
		//XOrExpression
		public RuleCall getXOrExpressionParserRuleCall_0() { return cXOrExpressionParserRuleCall_0; }
		
		//(
		//       // The java grammar does only allow other XConditionalExpression after the colon, but we can be more relaxed
		//       ->({xbase::XIfExpression.if=current} conditionalExpression?='?') then=XExpression (->':' else=XExpression)?
		//   )?
		public Group getGroup_1() { return cGroup_1; }
		
		//// The java grammar does only allow other XConditionalExpression after the colon, but we can be more relaxed
		//->({xbase::XIfExpression.if=current} conditionalExpression?='?')
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//{xbase::XIfExpression.if=current} conditionalExpression?='?'
		public Group getGroup_1_0_0() { return cGroup_1_0_0; }
		
		//{xbase::XIfExpression.if=current}
		public Action getXIfExpressionIfAction_1_0_0_0() { return cXIfExpressionIfAction_1_0_0_0; }
		
		//conditionalExpression?='?'
		public Assignment getConditionalExpressionAssignment_1_0_0_1() { return cConditionalExpressionAssignment_1_0_0_1; }
		
		//'?'
		public Keyword getConditionalExpressionQuestionMarkKeyword_1_0_0_1_0() { return cConditionalExpressionQuestionMarkKeyword_1_0_0_1_0; }
		
		//then=XExpression
		public Assignment getThenAssignment_1_1() { return cThenAssignment_1_1; }
		
		//XExpression
		public RuleCall getThenXExpressionParserRuleCall_1_1_0() { return cThenXExpressionParserRuleCall_1_1_0; }
		
		//(->':' else=XExpression)?
		public Group getGroup_1_2() { return cGroup_1_2; }
		
		//->':'
		public Keyword getColonKeyword_1_2_0() { return cColonKeyword_1_2_0; }
		
		//else=XExpression
		public Assignment getElseAssignment_1_2_1() { return cElseAssignment_1_2_1; }
		
		//XExpression
		public RuleCall getElseXExpressionParserRuleCall_1_2_1_0() { return cElseXExpressionParserRuleCall_1_2_1_0; }
	}
	
	
	private final ModelElements pModel;
	private final SpecialBlockExpressionElements pSpecialBlockExpression;
	private final FeatureCallIDElements pFeatureCallID;
	private final XTryCatchFinallyExpressionElements pXTryCatchFinallyExpression;
	private final InitialisedVariableDeclarationElements pInitialisedVariableDeclaration;
	private final XAssignmentElements pXAssignment;
	private final XConditionalExpressionElements pXConditionalExpression;
	
	private final Grammar grammar;
	
	private final XbaseGrammarAccess gaXbase;
	
	private final XtypeGrammarAccess gaXtype;

	@Inject
	public PureXbaseGrammarAccess(GrammarProvider grammarProvider,
			XbaseGrammarAccess gaXbase,
			XtypeGrammarAccess gaXtype) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaXbase = gaXbase;
		this.gaXtype = gaXtype;
		this.pModel = new ModelElements();
		this.pSpecialBlockExpression = new SpecialBlockExpressionElements();
		this.pFeatureCallID = new FeatureCallIDElements();
		this.pXTryCatchFinallyExpression = new XTryCatchFinallyExpressionElements();
		this.pInitialisedVariableDeclaration = new InitialisedVariableDeclarationElements();
		this.pXAssignment = new XAssignmentElements();
		this.pXConditionalExpression = new XConditionalExpressionElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.purexbase.PureXbase".equals(grammar.getName())) {
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
	
	
	public XbaseGrammarAccess getXbaseGrammarAccess() {
		return gaXbase;
	}
	
	public XtypeGrammarAccess getXtypeGrammarAccess() {
		return gaXtype;
	}

	
	//Model:
	//    importSection=XImportSection? block=SpecialBlockExpression;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//SpecialBlockExpression returns xbase::XBlockExpression:
	//    {xbase::XBlockExpression}
	//    (expressions+=XExpressionOrVarDeclaration ';'?)*;
	public SpecialBlockExpressionElements getSpecialBlockExpressionAccess() {
		return pSpecialBlockExpression;
	}
	
	public ParserRule getSpecialBlockExpressionRule() {
		return getSpecialBlockExpressionAccess().getRule();
	}
	
	//@Override
	//FeatureCallID:
	//    ValidID;
	public FeatureCallIDElements getFeatureCallIDAccess() {
		return pFeatureCallID;
	}
	
	public ParserRule getFeatureCallIDRule() {
		return getFeatureCallIDAccess().getRule();
	}
	
	//@Override
	//XTryCatchFinallyExpression returns xbase::XExpression:
	//    {xbase::XTryCatchFinallyExpression}
	//    'try' (
	//        '(' resources+=InitialisedVariableDeclaration (';' resources+=InitialisedVariableDeclaration)* ';'? ')'
	//        expression=XExpression
	//        ->(
	//            catchClauses+=XCatchClause+
	//            (=>'finally' finallyExpression=XExpression)?
	//        |    'finally' finallyExpression=XExpression
	//        )?
	//    |
	//        expression=XExpression
	//        (
	//            catchClauses+=XCatchClause+
	//            (=>'finally' finallyExpression=XExpression)?
	//        |    'finally' finallyExpression=XExpression
	//        )
	//    )
	//;
	public XTryCatchFinallyExpressionElements getXTryCatchFinallyExpressionAccess() {
		return pXTryCatchFinallyExpression;
	}
	
	public ParserRule getXTryCatchFinallyExpressionRule() {
		return getXTryCatchFinallyExpressionAccess().getRule();
	}
	
	//InitialisedVariableDeclaration returns xbase::XVariableDeclaration:
	//    {xbase::XVariableDeclaration}
	//    (writeable?='var'|'val')
	//    (=>(type=JvmTypeReference name=ValidID) | name=ValidID) '=' right=XExpression
	//;
	public InitialisedVariableDeclarationElements getInitialisedVariableDeclarationAccess() {
		return pInitialisedVariableDeclaration;
	}
	
	public ParserRule getInitialisedVariableDeclarationRule() {
		return getInitialisedVariableDeclarationAccess().getRule();
	}
	
	//@Override
	//XAssignment returns xbase::XExpression :
	//    {xbase::XAssignment} feature=[types::JvmIdentifiableElement|FeatureCallID] OpSingleAssign value=XAssignment |
	//    XConditionalExpression (
	//        =>({xbase::XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpMultiAssign]) rightOperand=XAssignment
	//    )?;
	public XAssignmentElements getXAssignmentAccess() {
		return pXAssignment;
	}
	
	public ParserRule getXAssignmentRule() {
		return getXAssignmentAccess().getRule();
	}
	
	//XConditionalExpression returns xbase::XExpression :
	//    XOrExpression (
	//        // The java grammar does only allow other XConditionalExpression after the colon, but we can be more relaxed
	//        ->({xbase::XIfExpression.if=current} conditionalExpression?='?') then=XExpression (->':' else=XExpression)?
	//    )?
	//;
	public XConditionalExpressionElements getXConditionalExpressionAccess() {
		return pXConditionalExpression;
	}
	
	public ParserRule getXConditionalExpressionRule() {
		return getXConditionalExpressionAccess().getRule();
	}
	
	//XExpression returns XExpression :
	//    XAssignment;
	public XbaseGrammarAccess.XExpressionElements getXExpressionAccess() {
		return gaXbase.getXExpressionAccess();
	}
	
	public ParserRule getXExpressionRule() {
		return getXExpressionAccess().getRule();
	}
	
	//OpSingleAssign:
	//    '='
	//;
	public XbaseGrammarAccess.OpSingleAssignElements getOpSingleAssignAccess() {
		return gaXbase.getOpSingleAssignAccess();
	}
	
	public ParserRule getOpSingleAssignRule() {
		return getOpSingleAssignAccess().getRule();
	}
	
	//OpMultiAssign:
	//    '+=' | '-=' | '*=' | '/=' | '%=' |
	//    '<' '<' '=' |
	//    '>' '>'? '>=';
	public XbaseGrammarAccess.OpMultiAssignElements getOpMultiAssignAccess() {
		return gaXbase.getOpMultiAssignAccess();
	}
	
	public ParserRule getOpMultiAssignRule() {
		return getOpMultiAssignAccess().getRule();
	}
	
	//XOrExpression returns XExpression:
	//    XAndExpression (=>({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpOr]) rightOperand=XAndExpression)*;
	public XbaseGrammarAccess.XOrExpressionElements getXOrExpressionAccess() {
		return gaXbase.getXOrExpressionAccess();
	}
	
	public ParserRule getXOrExpressionRule() {
		return getXOrExpressionAccess().getRule();
	}
	
	//OpOr:
	//    '||';
	public XbaseGrammarAccess.OpOrElements getOpOrAccess() {
		return gaXbase.getOpOrAccess();
	}
	
	public ParserRule getOpOrRule() {
		return getOpOrAccess().getRule();
	}
	
	//XAndExpression returns XExpression:
	//    XEqualityExpression (=>({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpAnd]) rightOperand=XEqualityExpression)*;
	public XbaseGrammarAccess.XAndExpressionElements getXAndExpressionAccess() {
		return gaXbase.getXAndExpressionAccess();
	}
	
	public ParserRule getXAndExpressionRule() {
		return getXAndExpressionAccess().getRule();
	}
	
	//OpAnd:
	//    '&&';
	public XbaseGrammarAccess.OpAndElements getOpAndAccess() {
		return gaXbase.getOpAndAccess();
	}
	
	public ParserRule getOpAndRule() {
		return getOpAndAccess().getRule();
	}
	
	//XEqualityExpression returns XExpression:
	//    XRelationalExpression (=>({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpEquality])
	//    rightOperand=XRelationalExpression)*;
	public XbaseGrammarAccess.XEqualityExpressionElements getXEqualityExpressionAccess() {
		return gaXbase.getXEqualityExpressionAccess();
	}
	
	public ParserRule getXEqualityExpressionRule() {
		return getXEqualityExpressionAccess().getRule();
	}
	
	//OpEquality:
	//    '==' | '!=' | '===' | '!==';
	public XbaseGrammarAccess.OpEqualityElements getOpEqualityAccess() {
		return gaXbase.getOpEqualityAccess();
	}
	
	public ParserRule getOpEqualityRule() {
		return getOpEqualityAccess().getRule();
	}
	
	//XRelationalExpression returns XExpression:
	//    XOtherOperatorExpression
	//    (=>({XInstanceOfExpression.expression=current} 'instanceof') type=JvmTypeReference |
	//     =>({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpCompare]) rightOperand=XOtherOperatorExpression)*;
	public XbaseGrammarAccess.XRelationalExpressionElements getXRelationalExpressionAccess() {
		return gaXbase.getXRelationalExpressionAccess();
	}
	
	public ParserRule getXRelationalExpressionRule() {
		return getXRelationalExpressionAccess().getRule();
	}
	
	//OpCompare:
	//    '>=' | '<' '=' | '>' | '<' ;
	public XbaseGrammarAccess.OpCompareElements getOpCompareAccess() {
		return gaXbase.getOpCompareAccess();
	}
	
	public ParserRule getOpCompareRule() {
		return getOpCompareAccess().getRule();
	}
	
	//XOtherOperatorExpression returns XExpression:
	//    XAdditiveExpression (=>({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpOther])
	//    rightOperand=XAdditiveExpression)*;
	public XbaseGrammarAccess.XOtherOperatorExpressionElements getXOtherOperatorExpressionAccess() {
		return gaXbase.getXOtherOperatorExpressionAccess();
	}
	
	public ParserRule getXOtherOperatorExpressionRule() {
		return getXOtherOperatorExpressionAccess().getRule();
	}
	
	//OpOther:
	//      '->'
	//    | '..<'
	//    | '>' '..'
	//    | '..'
	//    | '=>'
	//    | '>' (=>('>' '>') | '>')
	//    | '<' (=>('<' '<') | '<' | '=>')
	//    | '<>'
	//    | '?:';
	public XbaseGrammarAccess.OpOtherElements getOpOtherAccess() {
		return gaXbase.getOpOtherAccess();
	}
	
	public ParserRule getOpOtherRule() {
		return getOpOtherAccess().getRule();
	}
	
	//XAdditiveExpression returns XExpression:
	//    XMultiplicativeExpression (=>({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpAdd])
	//    rightOperand=XMultiplicativeExpression)*;
	public XbaseGrammarAccess.XAdditiveExpressionElements getXAdditiveExpressionAccess() {
		return gaXbase.getXAdditiveExpressionAccess();
	}
	
	public ParserRule getXAdditiveExpressionRule() {
		return getXAdditiveExpressionAccess().getRule();
	}
	
	//OpAdd:
	//    '+' | '-';
	public XbaseGrammarAccess.OpAddElements getOpAddAccess() {
		return gaXbase.getOpAddAccess();
	}
	
	public ParserRule getOpAddRule() {
		return getOpAddAccess().getRule();
	}
	
	//XMultiplicativeExpression returns XExpression:
	//    XUnaryOperation (=>({XBinaryOperation.leftOperand=current} feature=[types::JvmIdentifiableElement|OpMulti]) rightOperand=XUnaryOperation)*;
	public XbaseGrammarAccess.XMultiplicativeExpressionElements getXMultiplicativeExpressionAccess() {
		return gaXbase.getXMultiplicativeExpressionAccess();
	}
	
	public ParserRule getXMultiplicativeExpressionRule() {
		return getXMultiplicativeExpressionAccess().getRule();
	}
	
	//OpMulti:
	//    '*' | '**' | '/' | '%';
	public XbaseGrammarAccess.OpMultiElements getOpMultiAccess() {
		return gaXbase.getOpMultiAccess();
	}
	
	public ParserRule getOpMultiRule() {
		return getOpMultiAccess().getRule();
	}
	
	//XUnaryOperation returns XExpression:
	//    {XUnaryOperation} feature=[types::JvmIdentifiableElement|OpUnary] operand=XUnaryOperation
	//    | XCastedExpression;
	public XbaseGrammarAccess.XUnaryOperationElements getXUnaryOperationAccess() {
		return gaXbase.getXUnaryOperationAccess();
	}
	
	public ParserRule getXUnaryOperationRule() {
		return getXUnaryOperationAccess().getRule();
	}
	
	//OpUnary:
	//    "!" | "-" | "+";
	public XbaseGrammarAccess.OpUnaryElements getOpUnaryAccess() {
		return gaXbase.getOpUnaryAccess();
	}
	
	public ParserRule getOpUnaryRule() {
		return getOpUnaryAccess().getRule();
	}
	
	//XCastedExpression returns XExpression:
	//    XPostfixOperation (=>({XCastedExpression.target=current} 'as') type=JvmTypeReference)*
	//;
	public XbaseGrammarAccess.XCastedExpressionElements getXCastedExpressionAccess() {
		return gaXbase.getXCastedExpressionAccess();
	}
	
	public ParserRule getXCastedExpressionRule() {
		return getXCastedExpressionAccess().getRule();
	}
	
	//XPostfixOperation returns XExpression:
	//    XMemberFeatureCall =>({XPostfixOperation.operand=current} feature=[types::JvmIdentifiableElement|OpPostfix])?
	//;
	public XbaseGrammarAccess.XPostfixOperationElements getXPostfixOperationAccess() {
		return gaXbase.getXPostfixOperationAccess();
	}
	
	public ParserRule getXPostfixOperationRule() {
		return getXPostfixOperationAccess().getRule();
	}
	
	//OpPostfix:
	//    "++" | "--"
	//;
	public XbaseGrammarAccess.OpPostfixElements getOpPostfixAccess() {
		return gaXbase.getOpPostfixAccess();
	}
	
	public ParserRule getOpPostfixRule() {
		return getOpPostfixAccess().getRule();
	}
	
	//XMemberFeatureCall returns XExpression:
	//    XPrimaryExpression
	//    (=>({XAssignment.assignable=current} ('.'|explicitStatic?="::") feature=[types::JvmIdentifiableElement|FeatureCallID] OpSingleAssign) value=XAssignment
	//    |=>({XMemberFeatureCall.memberCallTarget=current} ("."|nullSafe?="?."|explicitStatic?="::"))
	//        ('<' typeArguments+=JvmArgumentTypeReference (',' typeArguments+=JvmArgumentTypeReference)* '>')?
	//        feature=[types::JvmIdentifiableElement|IdOrSuper] (
	//            =>explicitOperationCall?='('
	//                (
	//                    memberCallArguments+=XShortClosure
	//                  | memberCallArguments+=XExpression (',' memberCallArguments+=XExpression)*
	//                )?
	//            ')')?
	//            memberCallArguments+=XClosure?
	//        )*;
	public XbaseGrammarAccess.XMemberFeatureCallElements getXMemberFeatureCallAccess() {
		return gaXbase.getXMemberFeatureCallAccess();
	}
	
	public ParserRule getXMemberFeatureCallRule() {
		return getXMemberFeatureCallAccess().getRule();
	}
	
	//XPrimaryExpression returns XExpression:
	//    XConstructorCall |
	//    XBlockExpression |
	//    XSwitchExpression |
	//    XSynchronizedExpression |
	//    XFeatureCall |
	//    XLiteral |
	//    XIfExpression |
	//    XForLoopExpression |
	//    XBasicForLoopExpression |
	//    XWhileExpression |
	//    XDoWhileExpression |
	//    XThrowExpression |
	//    XReturnExpression |
	//    XTryCatchFinallyExpression |
	//    XParenthesizedExpression;
	public XbaseGrammarAccess.XPrimaryExpressionElements getXPrimaryExpressionAccess() {
		return gaXbase.getXPrimaryExpressionAccess();
	}
	
	public ParserRule getXPrimaryExpressionRule() {
		return getXPrimaryExpressionAccess().getRule();
	}
	
	//XLiteral returns XExpression:
	//    XCollectionLiteral |
	//    XClosure |
	//    XBooleanLiteral |
	//    XNumberLiteral |
	//    XNullLiteral |
	//    XStringLiteral |
	//    XTypeLiteral
	//;
	public XbaseGrammarAccess.XLiteralElements getXLiteralAccess() {
		return gaXbase.getXLiteralAccess();
	}
	
	public ParserRule getXLiteralRule() {
		return getXLiteralAccess().getRule();
	}
	
	//XCollectionLiteral:
	//    XSetLiteral | XListLiteral
	//;
	public XbaseGrammarAccess.XCollectionLiteralElements getXCollectionLiteralAccess() {
		return gaXbase.getXCollectionLiteralAccess();
	}
	
	public ParserRule getXCollectionLiteralRule() {
		return getXCollectionLiteralAccess().getRule();
	}
	
	//XSetLiteral:
	//    {XSetLiteral} '#' '{' (elements+=XExpression (',' elements+=XExpression )*)? '}'
	//;
	public XbaseGrammarAccess.XSetLiteralElements getXSetLiteralAccess() {
		return gaXbase.getXSetLiteralAccess();
	}
	
	public ParserRule getXSetLiteralRule() {
		return getXSetLiteralAccess().getRule();
	}
	
	//XListLiteral:
	//    {XListLiteral} '#' '[' (elements+=XExpression (',' elements+=XExpression )*)? ']'
	//;
	public XbaseGrammarAccess.XListLiteralElements getXListLiteralAccess() {
		return gaXbase.getXListLiteralAccess();
	}
	
	public ParserRule getXListLiteralRule() {
		return getXListLiteralAccess().getRule();
	}
	
	//XClosure returns XExpression:
	//    =>({XClosure}
	//    '[')
	//        =>((declaredFormalParameters+=JvmFormalParameter (',' declaredFormalParameters+=JvmFormalParameter)*)? explicitSyntax?='|')?
	//        expression=XExpressionInClosure
	//    ']';
	public XbaseGrammarAccess.XClosureElements getXClosureAccess() {
		return gaXbase.getXClosureAccess();
	}
	
	public ParserRule getXClosureRule() {
		return getXClosureAccess().getRule();
	}
	
	//XExpressionInClosure returns XExpression:
	//    {XBlockExpression}
	//    (expressions+=XExpressionOrVarDeclaration ';'?)*
	//;
	public XbaseGrammarAccess.XExpressionInClosureElements getXExpressionInClosureAccess() {
		return gaXbase.getXExpressionInClosureAccess();
	}
	
	public ParserRule getXExpressionInClosureRule() {
		return getXExpressionInClosureAccess().getRule();
	}
	
	//XShortClosure returns XExpression:
	//    =>({XClosure} (declaredFormalParameters+=JvmFormalParameter (',' declaredFormalParameters+=JvmFormalParameter)*)? explicitSyntax?='|') expression=XExpression;
	public XbaseGrammarAccess.XShortClosureElements getXShortClosureAccess() {
		return gaXbase.getXShortClosureAccess();
	}
	
	public ParserRule getXShortClosureRule() {
		return getXShortClosureAccess().getRule();
	}
	
	//XParenthesizedExpression returns XExpression:
	//    '(' XExpression ')';
	public XbaseGrammarAccess.XParenthesizedExpressionElements getXParenthesizedExpressionAccess() {
		return gaXbase.getXParenthesizedExpressionAccess();
	}
	
	public ParserRule getXParenthesizedExpressionRule() {
		return getXParenthesizedExpressionAccess().getRule();
	}
	
	//XIfExpression returns XExpression:
	//    {XIfExpression}
	//    'if' '(' if=XExpression ')'
	//    then=XExpression
	//    (=>'else' else=XExpression)?;
	public XbaseGrammarAccess.XIfExpressionElements getXIfExpressionAccess() {
		return gaXbase.getXIfExpressionAccess();
	}
	
	public ParserRule getXIfExpressionRule() {
		return getXIfExpressionAccess().getRule();
	}
	
	//XSwitchExpression returns XExpression:
	//    {XSwitchExpression}
	//    'switch' (=>('(' declaredParam=JvmFormalParameter ':') switch=XExpression ')'
	//        | =>(declaredParam=JvmFormalParameter ':')? switch=XExpression) '{'
	//    (cases+=XCasePart)*
	//    ('default' ':' default=XExpression )?
	//    '}';
	public XbaseGrammarAccess.XSwitchExpressionElements getXSwitchExpressionAccess() {
		return gaXbase.getXSwitchExpressionAccess();
	}
	
	public ParserRule getXSwitchExpressionRule() {
		return getXSwitchExpressionAccess().getRule();
	}
	
	//XCasePart:
	//    {XCasePart}
	//    typeGuard=JvmTypeReference? ('case' case=XExpression)?
	//        (':' then=XExpression | fallThrough?=',') ;
	public XbaseGrammarAccess.XCasePartElements getXCasePartAccess() {
		return gaXbase.getXCasePartAccess();
	}
	
	public ParserRule getXCasePartRule() {
		return getXCasePartAccess().getRule();
	}
	
	//XForLoopExpression returns XExpression:
	//    =>({XForLoopExpression}
	//    'for' '(' declaredParam=JvmFormalParameter ':') forExpression=XExpression ')'
	//        eachExpression=XExpression;
	public XbaseGrammarAccess.XForLoopExpressionElements getXForLoopExpressionAccess() {
		return gaXbase.getXForLoopExpressionAccess();
	}
	
	public ParserRule getXForLoopExpressionRule() {
		return getXForLoopExpressionAccess().getRule();
	}
	
	//XBasicForLoopExpression returns XExpression:
	//    {XBasicForLoopExpression}
	//    'for' '('(initExpressions+=XExpressionOrVarDeclaration (',' initExpressions+=XExpressionOrVarDeclaration)*)? ';'
	//        expression=XExpression? ';'
	//        (updateExpressions+=XExpression (',' updateExpressions+=XExpression)*)? ')'
	//        eachExpression=XExpression;
	public XbaseGrammarAccess.XBasicForLoopExpressionElements getXBasicForLoopExpressionAccess() {
		return gaXbase.getXBasicForLoopExpressionAccess();
	}
	
	public ParserRule getXBasicForLoopExpressionRule() {
		return getXBasicForLoopExpressionAccess().getRule();
	}
	
	//XWhileExpression returns XExpression:
	//    {XWhileExpression}
	//    'while' '(' predicate=XExpression ')'
	//        body=XExpression;
	public XbaseGrammarAccess.XWhileExpressionElements getXWhileExpressionAccess() {
		return gaXbase.getXWhileExpressionAccess();
	}
	
	public ParserRule getXWhileExpressionRule() {
		return getXWhileExpressionAccess().getRule();
	}
	
	//XDoWhileExpression returns XExpression:
	//    {XDoWhileExpression}
	//    'do'
	//        body=XExpression
	//    'while' '(' predicate=XExpression ')';
	public XbaseGrammarAccess.XDoWhileExpressionElements getXDoWhileExpressionAccess() {
		return gaXbase.getXDoWhileExpressionAccess();
	}
	
	public ParserRule getXDoWhileExpressionRule() {
		return getXDoWhileExpressionAccess().getRule();
	}
	
	//XBlockExpression returns XExpression:
	//    {XBlockExpression}
	//    '{'
	//        (expressions+=XExpressionOrVarDeclaration ';'?)*
	//    '}';
	public XbaseGrammarAccess.XBlockExpressionElements getXBlockExpressionAccess() {
		return gaXbase.getXBlockExpressionAccess();
	}
	
	public ParserRule getXBlockExpressionRule() {
		return getXBlockExpressionAccess().getRule();
	}
	
	//XExpressionOrVarDeclaration returns XExpression:
	//    XVariableDeclaration | XExpression;
	public XbaseGrammarAccess.XExpressionOrVarDeclarationElements getXExpressionOrVarDeclarationAccess() {
		return gaXbase.getXExpressionOrVarDeclarationAccess();
	}
	
	public ParserRule getXExpressionOrVarDeclarationRule() {
		return getXExpressionOrVarDeclarationAccess().getRule();
	}
	
	//XVariableDeclaration returns XExpression:
	//    {XVariableDeclaration}
	//    (writeable?='var'|'val') (=>(type=JvmTypeReference name=ValidID) | name=ValidID) ('=' right=XExpression)?;
	public XbaseGrammarAccess.XVariableDeclarationElements getXVariableDeclarationAccess() {
		return gaXbase.getXVariableDeclarationAccess();
	}
	
	public ParserRule getXVariableDeclarationRule() {
		return getXVariableDeclarationAccess().getRule();
	}
	
	//JvmFormalParameter returns types::JvmFormalParameter:
	//    (parameterType=JvmTypeReference)? name=ValidID;
	public XbaseGrammarAccess.JvmFormalParameterElements getJvmFormalParameterAccess() {
		return gaXbase.getJvmFormalParameterAccess();
	}
	
	public ParserRule getJvmFormalParameterRule() {
		return getJvmFormalParameterAccess().getRule();
	}
	
	//FullJvmFormalParameter returns types::JvmFormalParameter:
	//    parameterType=JvmTypeReference name=ValidID;
	public XbaseGrammarAccess.FullJvmFormalParameterElements getFullJvmFormalParameterAccess() {
		return gaXbase.getFullJvmFormalParameterAccess();
	}
	
	public ParserRule getFullJvmFormalParameterRule() {
		return getFullJvmFormalParameterAccess().getRule();
	}
	
	//XFeatureCall returns XExpression:
	//    {XFeatureCall}
	//    ('<' typeArguments+=JvmArgumentTypeReference (',' typeArguments+=JvmArgumentTypeReference)* '>')?
	//    feature=[types::JvmIdentifiableElement|IdOrSuper]
	//    (=>explicitOperationCall?='('
	//        (
	//            featureCallArguments+=XShortClosure
	//          | featureCallArguments+=XExpression (',' featureCallArguments+=XExpression)*
	//        )?
	//    ')')?
	//    featureCallArguments+=XClosure?;
	public XbaseGrammarAccess.XFeatureCallElements getXFeatureCallAccess() {
		return gaXbase.getXFeatureCallAccess();
	}
	
	public ParserRule getXFeatureCallRule() {
		return getXFeatureCallAccess().getRule();
	}
	
	//IdOrSuper :
	//    FeatureCallID | 'super'
	//;
	public XbaseGrammarAccess.IdOrSuperElements getIdOrSuperAccess() {
		return gaXbase.getIdOrSuperAccess();
	}
	
	public ParserRule getIdOrSuperRule() {
		return getIdOrSuperAccess().getRule();
	}
	
	//XConstructorCall returns XExpression:
	//    {XConstructorCall}
	//    'new' constructor=[types::JvmConstructor|QualifiedName]
	//    (=>'<' typeArguments+=JvmArgumentTypeReference (',' typeArguments+=JvmArgumentTypeReference)* '>')?
	//    (=>explicitConstructorCall?='('
	//        (
	//            arguments+=XShortClosure
	//          | arguments+=XExpression (',' arguments+=XExpression)*
	//        )?
	//    ')')?
	//    arguments+=XClosure?;
	public XbaseGrammarAccess.XConstructorCallElements getXConstructorCallAccess() {
		return gaXbase.getXConstructorCallAccess();
	}
	
	public ParserRule getXConstructorCallRule() {
		return getXConstructorCallAccess().getRule();
	}
	
	//XBooleanLiteral returns XExpression :
	//    {XBooleanLiteral} ('false' | isTrue?='true');
	public XbaseGrammarAccess.XBooleanLiteralElements getXBooleanLiteralAccess() {
		return gaXbase.getXBooleanLiteralAccess();
	}
	
	public ParserRule getXBooleanLiteralRule() {
		return getXBooleanLiteralAccess().getRule();
	}
	
	//XNullLiteral returns XExpression :
	//    {XNullLiteral} 'null';
	public XbaseGrammarAccess.XNullLiteralElements getXNullLiteralAccess() {
		return gaXbase.getXNullLiteralAccess();
	}
	
	public ParserRule getXNullLiteralRule() {
		return getXNullLiteralAccess().getRule();
	}
	
	//XNumberLiteral returns XExpression :
	//    {XNumberLiteral} value=Number;
	public XbaseGrammarAccess.XNumberLiteralElements getXNumberLiteralAccess() {
		return gaXbase.getXNumberLiteralAccess();
	}
	
	public ParserRule getXNumberLiteralRule() {
		return getXNumberLiteralAccess().getRule();
	}
	
	//XStringLiteral returns XExpression:
	//    {XStringLiteral} value=STRING;
	public XbaseGrammarAccess.XStringLiteralElements getXStringLiteralAccess() {
		return gaXbase.getXStringLiteralAccess();
	}
	
	public ParserRule getXStringLiteralRule() {
		return getXStringLiteralAccess().getRule();
	}
	
	//XTypeLiteral returns XExpression :
	//    {XTypeLiteral} 'typeof' '(' type=[types::JvmType|QualifiedName] (arrayDimensions+=ArrayBrackets)* ')'
	//;
	public XbaseGrammarAccess.XTypeLiteralElements getXTypeLiteralAccess() {
		return gaXbase.getXTypeLiteralAccess();
	}
	
	public ParserRule getXTypeLiteralRule() {
		return getXTypeLiteralAccess().getRule();
	}
	
	//XThrowExpression returns XExpression :
	//    {XThrowExpression} 'throw' expression=XExpression;
	public XbaseGrammarAccess.XThrowExpressionElements getXThrowExpressionAccess() {
		return gaXbase.getXThrowExpressionAccess();
	}
	
	public ParserRule getXThrowExpressionRule() {
		return getXThrowExpressionAccess().getRule();
	}
	
	//XReturnExpression returns XExpression :
	//    {XReturnExpression} 'return' (->expression=XExpression)?;
	public XbaseGrammarAccess.XReturnExpressionElements getXReturnExpressionAccess() {
		return gaXbase.getXReturnExpressionAccess();
	}
	
	public ParserRule getXReturnExpressionRule() {
		return getXReturnExpressionAccess().getRule();
	}
	
	//XSynchronizedExpression returns XExpression:
	//    =>({XSynchronizedExpression}
	//    'synchronized' '(') param=XExpression ')' expression=XExpression;
	public XbaseGrammarAccess.XSynchronizedExpressionElements getXSynchronizedExpressionAccess() {
		return gaXbase.getXSynchronizedExpressionAccess();
	}
	
	public ParserRule getXSynchronizedExpressionRule() {
		return getXSynchronizedExpressionAccess().getRule();
	}
	
	//XCatchClause :
	//    =>'catch' '(' declaredParam=FullJvmFormalParameter ')' expression=XExpression;
	public XbaseGrammarAccess.XCatchClauseElements getXCatchClauseAccess() {
		return gaXbase.getXCatchClauseAccess();
	}
	
	public ParserRule getXCatchClauseRule() {
		return getXCatchClauseAccess().getRule();
	}
	
	//@Override
	//QualifiedName:
	//    ValidID (=>'.' ValidID)*;
	public XbaseGrammarAccess.QualifiedNameElements getQualifiedNameAccess() {
		return gaXbase.getQualifiedNameAccess();
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}
	
	//Number hidden():
	//    HEX | (INT | DECIMAL) ('.' (INT | DECIMAL))?;
	public XbaseGrammarAccess.NumberElements getNumberAccess() {
		return gaXbase.getNumberAccess();
	}
	
	public ParserRule getNumberRule() {
		return getNumberAccess().getRule();
	}
	
	///**
	// * Dummy rule, for "better" downwards compatibility, since GrammarAccess generates non-static inner classes,
	// * which makes downstream grammars break on classloading, when a rule is removed.
	// */
	//StaticQualifier:
	//    (ValidID '::')+
	//;
	public XbaseGrammarAccess.StaticQualifierElements getStaticQualifierAccess() {
		return gaXbase.getStaticQualifierAccess();
	}
	
	public ParserRule getStaticQualifierRule() {
		return getStaticQualifierAccess().getRule();
	}
	
	//terminal HEX:
	//    ('0x'|'0X') ('0'..'9'|'a'..'f'|'A'..'F'|'_')+
	//    ('#' (('b'|'B')('i'|'I') | ('l'|'L')))?;
	public TerminalRule getHEXRule() {
		return gaXbase.getHEXRule();
	}
	
	//terminal INT returns ecore::EInt:
	//    '0'..'9' ('0'..'9'|'_')*;
	public TerminalRule getINTRule() {
		return gaXbase.getINTRule();
	}
	
	//terminal DECIMAL:
	//    INT
	//    (('e'|'E') ('+'|'-')? INT)?
	//    (('b'|'B')('i'|'I'|'d'|'D') | ('l'|'L'|'d'|'D'|'f'|'F'))?;
	public TerminalRule getDECIMALRule() {
		return gaXbase.getDECIMALRule();
	}
	
	//JvmTypeReference:
	//    JvmParameterizedTypeReference =>({JvmGenericArrayTypeReference.componentType=current} ArrayBrackets)*
	//    | XFunctionTypeRef;
	public XtypeGrammarAccess.JvmTypeReferenceElements getJvmTypeReferenceAccess() {
		return gaXtype.getJvmTypeReferenceAccess();
	}
	
	public ParserRule getJvmTypeReferenceRule() {
		return getJvmTypeReferenceAccess().getRule();
	}
	
	//ArrayBrackets :
	//    '[' ']'
	//;
	public XtypeGrammarAccess.ArrayBracketsElements getArrayBracketsAccess() {
		return gaXtype.getArrayBracketsAccess();
	}
	
	public ParserRule getArrayBracketsRule() {
		return getArrayBracketsAccess().getRule();
	}
	
	//XFunctionTypeRef:
	//    ('(' (paramTypes+=JvmTypeReference (',' paramTypes+=JvmTypeReference)*)? ')')? '=>' returnType=JvmTypeReference;
	public XtypeGrammarAccess.XFunctionTypeRefElements getXFunctionTypeRefAccess() {
		return gaXtype.getXFunctionTypeRefAccess();
	}
	
	public ParserRule getXFunctionTypeRefRule() {
		return getXFunctionTypeRefAccess().getRule();
	}
	
	//JvmParameterizedTypeReference:
	//    type=[JvmType|QualifiedName] (
	//        =>'<' arguments+=JvmArgumentTypeReference (',' arguments+=JvmArgumentTypeReference)* '>'
	//        (=>({JvmInnerTypeReference.outer=current} '.') type=[JvmType|ValidID] (=>'<' arguments+=JvmArgumentTypeReference (',' arguments+=JvmArgumentTypeReference)* '>')?)*
	//    )?;
	public XtypeGrammarAccess.JvmParameterizedTypeReferenceElements getJvmParameterizedTypeReferenceAccess() {
		return gaXtype.getJvmParameterizedTypeReferenceAccess();
	}
	
	public ParserRule getJvmParameterizedTypeReferenceRule() {
		return getJvmParameterizedTypeReferenceAccess().getRule();
	}
	
	//JvmArgumentTypeReference returns JvmTypeReference:
	//    JvmTypeReference | JvmWildcardTypeReference;
	public XtypeGrammarAccess.JvmArgumentTypeReferenceElements getJvmArgumentTypeReferenceAccess() {
		return gaXtype.getJvmArgumentTypeReferenceAccess();
	}
	
	public ParserRule getJvmArgumentTypeReferenceRule() {
		return getJvmArgumentTypeReferenceAccess().getRule();
	}
	
	//JvmWildcardTypeReference:
	//    {JvmWildcardTypeReference} '?' (
	//      constraints+=JvmUpperBound (constraints+=JvmUpperBoundAnded)*
	//    | constraints+=JvmLowerBound (constraints+=JvmLowerBoundAnded)*
	//    )?;
	public XtypeGrammarAccess.JvmWildcardTypeReferenceElements getJvmWildcardTypeReferenceAccess() {
		return gaXtype.getJvmWildcardTypeReferenceAccess();
	}
	
	public ParserRule getJvmWildcardTypeReferenceRule() {
		return getJvmWildcardTypeReferenceAccess().getRule();
	}
	
	//JvmUpperBound :
	//    'extends' typeReference=JvmTypeReference;
	public XtypeGrammarAccess.JvmUpperBoundElements getJvmUpperBoundAccess() {
		return gaXtype.getJvmUpperBoundAccess();
	}
	
	public ParserRule getJvmUpperBoundRule() {
		return getJvmUpperBoundAccess().getRule();
	}
	
	//JvmUpperBoundAnded returns JvmUpperBound:
	//    '&' typeReference=JvmTypeReference;
	public XtypeGrammarAccess.JvmUpperBoundAndedElements getJvmUpperBoundAndedAccess() {
		return gaXtype.getJvmUpperBoundAndedAccess();
	}
	
	public ParserRule getJvmUpperBoundAndedRule() {
		return getJvmUpperBoundAndedAccess().getRule();
	}
	
	//JvmLowerBound :
	//    'super' typeReference=JvmTypeReference;
	public XtypeGrammarAccess.JvmLowerBoundElements getJvmLowerBoundAccess() {
		return gaXtype.getJvmLowerBoundAccess();
	}
	
	public ParserRule getJvmLowerBoundRule() {
		return getJvmLowerBoundAccess().getRule();
	}
	
	//JvmLowerBoundAnded returns JvmLowerBound:
	//    '&' typeReference=JvmTypeReference;
	public XtypeGrammarAccess.JvmLowerBoundAndedElements getJvmLowerBoundAndedAccess() {
		return gaXtype.getJvmLowerBoundAndedAccess();
	}
	
	public ParserRule getJvmLowerBoundAndedRule() {
		return getJvmLowerBoundAndedAccess().getRule();
	}
	
	//JvmTypeParameter :
	//    name=ValidID
	//    (constraints+=JvmUpperBound (constraints+=JvmUpperBoundAnded)*)?;
	public XtypeGrammarAccess.JvmTypeParameterElements getJvmTypeParameterAccess() {
		return gaXtype.getJvmTypeParameterAccess();
	}
	
	public ParserRule getJvmTypeParameterRule() {
		return getJvmTypeParameterAccess().getRule();
	}
	
	//QualifiedNameWithWildcard :
	//    QualifiedName  '.' '*';
	public XtypeGrammarAccess.QualifiedNameWithWildcardElements getQualifiedNameWithWildcardAccess() {
		return gaXtype.getQualifiedNameWithWildcardAccess();
	}
	
	public ParserRule getQualifiedNameWithWildcardRule() {
		return getQualifiedNameWithWildcardAccess().getRule();
	}
	
	//ValidID:
	//    ID;
	public XtypeGrammarAccess.ValidIDElements getValidIDAccess() {
		return gaXtype.getValidIDAccess();
	}
	
	public ParserRule getValidIDRule() {
		return getValidIDAccess().getRule();
	}
	
	//XImportSection:
	//    importDeclarations+=XImportDeclaration+;
	public XtypeGrammarAccess.XImportSectionElements getXImportSectionAccess() {
		return gaXtype.getXImportSectionAccess();
	}
	
	public ParserRule getXImportSectionRule() {
		return getXImportSectionAccess().getRule();
	}
	
	//XImportDeclaration:
	//    'import' (
	//        (static?='static' extension?='extension'? importedType=[JvmDeclaredType|QualifiedNameInStaticImport] (wildcard?='*' | memberName=ValidID))
	//        | importedType=[JvmDeclaredType|QualifiedName]
	//        | importedNamespace=QualifiedNameWithWildcard) ';'?
	//;
	public XtypeGrammarAccess.XImportDeclarationElements getXImportDeclarationAccess() {
		return gaXtype.getXImportDeclarationAccess();
	}
	
	public ParserRule getXImportDeclarationRule() {
		return getXImportDeclarationAccess().getRule();
	}
	
	//QualifiedNameInStaticImport:
	//    (ValidID '.')+
	//;
	public XtypeGrammarAccess.QualifiedNameInStaticImportElements getQualifiedNameInStaticImportAccess() {
		return gaXtype.getQualifiedNameInStaticImportAccess();
	}
	
	public ParserRule getQualifiedNameInStaticImportRule() {
		return getQualifiedNameInStaticImportAccess().getRule();
	}
	
	//terminal ID:
	//    '^'? ('a'..'z'|'A'..'Z'|'$'|'_') ('a'..'z'|'A'..'Z'|'$'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaXtype.getIDRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* ('b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\') */ | !('\\'|'"') )* '"'? |
	//            "'" ( '\\' . /* ('b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\') */ | !('\\'|"'") )* "'"?;
	public TerminalRule getSTRINGRule() {
		return gaXtype.getSTRINGRule();
	}
	
	//terminal ML_COMMENT: '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaXtype.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT: '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaXtype.getSL_COMMENTRule();
	}
	
	//terminal WS: (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaXtype.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaXtype.getANY_OTHERRule();
	}
}
