/*******************************************************************************
 * Copyright (c) 2011, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.enumrules.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.enumrules.multiRuleenums.Model;
import org.eclipse.xtext.enumrules.multiRuleenums.MultiRuleenumsPackage;
import org.eclipse.xtext.enumrules.services.MultiRuleEnumTestLanguageGrammarAccess;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class MultiRuleEnumTestLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MultiRuleEnumTestLanguageGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MultiRuleenumsPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MultiRuleenumsPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (a=EnumRuleA b=EnumRuleB c=EnumRuleC)
	 * </pre>
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MultiRuleenumsPackage.Literals.MODEL__A) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MultiRuleenumsPackage.Literals.MODEL__A));
			if (transientValues.isValueTransient(semanticObject, MultiRuleenumsPackage.Literals.MODEL__B) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MultiRuleenumsPackage.Literals.MODEL__B));
			if (transientValues.isValueTransient(semanticObject, MultiRuleenumsPackage.Literals.MODEL__C) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MultiRuleenumsPackage.Literals.MODEL__C));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getModelAccess().getAEnumRuleAEnumRuleCall_1_0(), semanticObject.getA());
		feeder.accept(grammarAccess.getModelAccess().getBEnumRuleBEnumRuleCall_2_0(), semanticObject.getB());
		feeder.accept(grammarAccess.getModelAccess().getCEnumRuleCEnumRuleCall_3_0(), semanticObject.getC());
		feeder.finish();
	}
	
	
}
