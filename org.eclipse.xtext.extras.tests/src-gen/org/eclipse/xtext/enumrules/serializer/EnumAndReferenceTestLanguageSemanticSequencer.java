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
import org.eclipse.xtext.enumrules.enumAndReferenceTestLanguage.EntityWithEnumAndReference;
import org.eclipse.xtext.enumrules.enumAndReferenceTestLanguage.EnumAndReferenceTestLanguagePackage;
import org.eclipse.xtext.enumrules.services.EnumAndReferenceTestLanguageGrammarAccess;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class EnumAndReferenceTestLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private EnumAndReferenceTestLanguageGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == EnumAndReferenceTestLanguagePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case EnumAndReferenceTestLanguagePackage.ENTITY_WITH_ENUM_AND_REFERENCE:
				sequence_EntityWithEnumAndReference(context, (EntityWithEnumAndReference) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     EntityWithEnumAndReference returns EntityWithEnumAndReference
	 *
	 * Constraint:
	 *     (type=KindOfKeyword name=ID ref=[EntityWithEnumAndReference|ID])
	 * </pre>
	 */
	protected void sequence_EntityWithEnumAndReference(ISerializationContext context, EntityWithEnumAndReference semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EnumAndReferenceTestLanguagePackage.Literals.ENTITY_WITH_ENUM_AND_REFERENCE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EnumAndReferenceTestLanguagePackage.Literals.ENTITY_WITH_ENUM_AND_REFERENCE__TYPE));
			if (transientValues.isValueTransient(semanticObject, EnumAndReferenceTestLanguagePackage.Literals.ENTITY_WITH_ENUM_AND_REFERENCE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EnumAndReferenceTestLanguagePackage.Literals.ENTITY_WITH_ENUM_AND_REFERENCE__NAME));
			if (transientValues.isValueTransient(semanticObject, EnumAndReferenceTestLanguagePackage.Literals.ENTITY_WITH_ENUM_AND_REFERENCE__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EnumAndReferenceTestLanguagePackage.Literals.ENTITY_WITH_ENUM_AND_REFERENCE__REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEntityWithEnumAndReferenceAccess().getTypeKindOfKeywordEnumRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getEntityWithEnumAndReferenceAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getEntityWithEnumAndReferenceAccess().getRefEntityWithEnumAndReferenceIDTerminalRuleCall_3_0_1(), semanticObject.eGet(EnumAndReferenceTestLanguagePackage.Literals.ENTITY_WITH_ENUM_AND_REFERENCE__REF, false));
		feeder.finish();
	}
	
	
}
