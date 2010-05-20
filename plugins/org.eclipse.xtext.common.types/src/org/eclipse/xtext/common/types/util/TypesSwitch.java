/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.common.types.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.*;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmAnnotationTarget;
import org.eclipse.xtext.common.types.JvmAnnotationType;
import org.eclipse.xtext.common.types.JvmArrayType;
import org.eclipse.xtext.common.types.JvmComponentType;
import org.eclipse.xtext.common.types.JvmConstraintOwner;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmEnumerationType;
import org.eclipse.xtext.common.types.JvmExecutable;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericArrayTypeReference;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmIdentifyableElement;
import org.eclipse.xtext.common.types.JvmLowerBound;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmPrimitiveType;
import org.eclipse.xtext.common.types.JvmReferenceTypeArgument;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeArgument;
import org.eclipse.xtext.common.types.JvmTypeConstraint;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmTypeParameterDeclarator;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.common.types.JvmUpperBound;
import org.eclipse.xtext.common.types.JvmWildcardTypeArgument;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.common.types.TypesPackage
 * @generated
 */
public class TypesSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TypesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesSwitch() {
		if (modelPackage == null) {
			modelPackage = TypesPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TypesPackage.JVM_IDENTIFYABLE_ELEMENT: {
				JvmIdentifyableElement jvmIdentifyableElement = (JvmIdentifyableElement)theEObject;
				T result = caseJvmIdentifyableElement(jvmIdentifyableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.JVM_TYPE: {
				JvmType jvmType = (JvmType)theEObject;
				T result = caseJvmType(jvmType);
				if (result == null) result = caseJvmIdentifyableElement(jvmType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.JVM_VOID: {
				JvmVoid jvmVoid = (JvmVoid)theEObject;
				T result = caseJvmVoid(jvmVoid);
				if (result == null) result = caseJvmType(jvmVoid);
				if (result == null) result = caseJvmIdentifyableElement(jvmVoid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.JVM_COMPONENT_TYPE: {
				JvmComponentType jvmComponentType = (JvmComponentType)theEObject;
				T result = caseJvmComponentType(jvmComponentType);
				if (result == null) result = caseJvmType(jvmComponentType);
				if (result == null) result = caseJvmIdentifyableElement(jvmComponentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.JVM_PRIMITIVE_TYPE: {
				JvmPrimitiveType jvmPrimitiveType = (JvmPrimitiveType)theEObject;
				T result = caseJvmPrimitiveType(jvmPrimitiveType);
				if (result == null) result = caseJvmComponentType(jvmPrimitiveType);
				if (result == null) result = caseJvmType(jvmPrimitiveType);
				if (result == null) result = caseJvmIdentifyableElement(jvmPrimitiveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.JVM_ARRAY_TYPE: {
				JvmArrayType jvmArrayType = (JvmArrayType)theEObject;
				T result = caseJvmArrayType(jvmArrayType);
				if (result == null) result = caseJvmComponentType(jvmArrayType);
				if (result == null) result = caseJvmType(jvmArrayType);
				if (result == null) result = caseJvmIdentifyableElement(jvmArrayType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.JVM_DECLARED_TYPE: {
				JvmDeclaredType jvmDeclaredType = (JvmDeclaredType)theEObject;
				T result = caseJvmDeclaredType(jvmDeclaredType);
				if (result == null) result = caseJvmComponentType(jvmDeclaredType);
				if (result == null) result = caseJvmMember(jvmDeclaredType);
				if (result == null) result = caseJvmType(jvmDeclaredType);
				if (result == null) result = caseJvmAnnotationTarget(jvmDeclaredType);
				if (result == null) result = caseJvmIdentifyableElement(jvmDeclaredType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.JVM_TYPE_PARAMETER: {
				JvmTypeParameter jvmTypeParameter = (JvmTypeParameter)theEObject;
				T result = caseJvmTypeParameter(jvmTypeParameter);
				if (result == null) result = caseJvmComponentType(jvmTypeParameter);
				if (result == null) result = caseJvmConstraintOwner(jvmTypeParameter);
				if (result == null) result = caseJvmType(jvmTypeParameter);
				if (result == null) result = caseJvmIdentifyableElement(jvmTypeParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.JVM_TYPE_PARAMETER_DECLARATOR: {
				JvmTypeParameterDeclarator jvmTypeParameterDeclarator = (JvmTypeParameterDeclarator)theEObject;
				T result = caseJvmTypeParameterDeclarator(jvmTypeParameterDeclarator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.JVM_CONSTRAINT_OWNER: {
				JvmConstraintOwner jvmConstraintOwner = (JvmConstraintOwner)theEObject;
				T result = caseJvmConstraintOwner(jvmConstraintOwner);
				if (result == null) result = caseJvmIdentifyableElement(jvmConstraintOwner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.JVM_TYPE_CONSTRAINT: {
				JvmTypeConstraint jvmTypeConstraint = (JvmTypeConstraint)theEObject;
				T result = caseJvmTypeConstraint(jvmTypeConstraint);
				if (result == null) result = caseJvmIdentifyableElement(jvmTypeConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.JVM_UPPER_BOUND: {
				JvmUpperBound jvmUpperBound = (JvmUpperBound)theEObject;
				T result = caseJvmUpperBound(jvmUpperBound);
				if (result == null) result = caseJvmTypeConstraint(jvmUpperBound);
				if (result == null) result = caseJvmIdentifyableElement(jvmUpperBound);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.JVM_LOWER_BOUND: {
				JvmLowerBound jvmLowerBound = (JvmLowerBound)theEObject;
				T result = caseJvmLowerBound(jvmLowerBound);
				if (result == null) result = caseJvmTypeConstraint(jvmLowerBound);
				if (result == null) result = caseJvmIdentifyableElement(jvmLowerBound);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.JVM_ANNOTATION_TYPE: {
				JvmAnnotationType jvmAnnotationType = (JvmAnnotationType)theEObject;
				T result = caseJvmAnnotationType(jvmAnnotationType);
				if (result == null) result = caseJvmDeclaredType(jvmAnnotationType);
				if (result == null) result = caseJvmComponentType(jvmAnnotationType);
				if (result == null) result = caseJvmMember(jvmAnnotationType);
				if (result == null) result = caseJvmType(jvmAnnotationType);
				if (result == null) result = caseJvmAnnotationTarget(jvmAnnotationType);
				if (result == null) result = caseJvmIdentifyableElement(jvmAnnotationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.JVM_ENUMERATION_TYPE: {
				JvmEnumerationType jvmEnumerationType = (JvmEnumerationType)theEObject;
				T result = caseJvmEnumerationType(jvmEnumerationType);
				if (result == null) result = caseJvmDeclaredType(jvmEnumerationType);
				if (result == null) result = caseJvmComponentType(jvmEnumerationType);
				if (result == null) result = caseJvmMember(jvmEnumerationType);
				if (result == null) result = caseJvmType(jvmEnumerationType);
				if (result == null) result = caseJvmAnnotationTarget(jvmEnumerationType);
				if (result == null) result = caseJvmIdentifyableElement(jvmEnumerationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.JVM_ENUMERATION_LITERAL: {
				JvmEnumerationLiteral jvmEnumerationLiteral = (JvmEnumerationLiteral)theEObject;
				T result = caseJvmEnumerationLiteral(jvmEnumerationLiteral);
				if (result == null) result = caseJvmIdentifyableElement(jvmEnumerationLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.JVM_GENERIC_TYPE: {
				JvmGenericType jvmGenericType = (JvmGenericType)theEObject;
				T result = caseJvmGenericType(jvmGenericType);
				if (result == null) result = caseJvmDeclaredType(jvmGenericType);
				if (result == null) result = caseJvmTypeParameterDeclarator(jvmGenericType);
				if (result == null) result = caseJvmComponentType(jvmGenericType);
				if (result == null) result = caseJvmMember(jvmGenericType);
				if (result == null) result = caseJvmType(jvmGenericType);
				if (result == null) result = caseJvmAnnotationTarget(jvmGenericType);
				if (result == null) result = caseJvmIdentifyableElement(jvmGenericType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.JVM_TYPE_REFERENCE: {
				JvmTypeReference jvmTypeReference = (JvmTypeReference)theEObject;
				T result = caseJvmTypeReference(jvmTypeReference);
				if (result == null) result = caseJvmIdentifyableElement(jvmTypeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.JVM_PARAMETERIZED_TYPE_REFERENCE: {
				JvmParameterizedTypeReference jvmParameterizedTypeReference = (JvmParameterizedTypeReference)theEObject;
				T result = caseJvmParameterizedTypeReference(jvmParameterizedTypeReference);
				if (result == null) result = caseJvmTypeReference(jvmParameterizedTypeReference);
				if (result == null) result = caseJvmIdentifyableElement(jvmParameterizedTypeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.JVM_GENERIC_ARRAY_TYPE_REFERENCE: {
				JvmGenericArrayTypeReference jvmGenericArrayTypeReference = (JvmGenericArrayTypeReference)theEObject;
				T result = caseJvmGenericArrayTypeReference(jvmGenericArrayTypeReference);
				if (result == null) result = caseJvmTypeReference(jvmGenericArrayTypeReference);
				if (result == null) result = caseJvmIdentifyableElement(jvmGenericArrayTypeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.JVM_TYPE_ARGUMENT: {
				JvmTypeArgument jvmTypeArgument = (JvmTypeArgument)theEObject;
				T result = caseJvmTypeArgument(jvmTypeArgument);
				if (result == null) result = caseJvmIdentifyableElement(jvmTypeArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.JVM_WILDCARD_TYPE_ARGUMENT: {
				JvmWildcardTypeArgument jvmWildcardTypeArgument = (JvmWildcardTypeArgument)theEObject;
				T result = caseJvmWildcardTypeArgument(jvmWildcardTypeArgument);
				if (result == null) result = caseJvmTypeArgument(jvmWildcardTypeArgument);
				if (result == null) result = caseJvmConstraintOwner(jvmWildcardTypeArgument);
				if (result == null) result = caseJvmIdentifyableElement(jvmWildcardTypeArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.JVM_REFERENCE_TYPE_ARGUMENT: {
				JvmReferenceTypeArgument jvmReferenceTypeArgument = (JvmReferenceTypeArgument)theEObject;
				T result = caseJvmReferenceTypeArgument(jvmReferenceTypeArgument);
				if (result == null) result = caseJvmTypeArgument(jvmReferenceTypeArgument);
				if (result == null) result = caseJvmIdentifyableElement(jvmReferenceTypeArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.JVM_MEMBER: {
				JvmMember jvmMember = (JvmMember)theEObject;
				T result = caseJvmMember(jvmMember);
				if (result == null) result = caseJvmAnnotationTarget(jvmMember);
				if (result == null) result = caseJvmIdentifyableElement(jvmMember);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.JVM_FEATURE: {
				JvmFeature jvmFeature = (JvmFeature)theEObject;
				T result = caseJvmFeature(jvmFeature);
				if (result == null) result = caseJvmIdentifyableElement(jvmFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.JVM_FIELD: {
				JvmField jvmField = (JvmField)theEObject;
				T result = caseJvmField(jvmField);
				if (result == null) result = caseJvmMember(jvmField);
				if (result == null) result = caseJvmFeature(jvmField);
				if (result == null) result = caseJvmAnnotationTarget(jvmField);
				if (result == null) result = caseJvmIdentifyableElement(jvmField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.JVM_EXECUTABLE: {
				JvmExecutable jvmExecutable = (JvmExecutable)theEObject;
				T result = caseJvmExecutable(jvmExecutable);
				if (result == null) result = caseJvmMember(jvmExecutable);
				if (result == null) result = caseJvmTypeParameterDeclarator(jvmExecutable);
				if (result == null) result = caseJvmAnnotationTarget(jvmExecutable);
				if (result == null) result = caseJvmIdentifyableElement(jvmExecutable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.JVM_CONSTRUCTOR: {
				JvmConstructor jvmConstructor = (JvmConstructor)theEObject;
				T result = caseJvmConstructor(jvmConstructor);
				if (result == null) result = caseJvmExecutable(jvmConstructor);
				if (result == null) result = caseJvmMember(jvmConstructor);
				if (result == null) result = caseJvmTypeParameterDeclarator(jvmConstructor);
				if (result == null) result = caseJvmAnnotationTarget(jvmConstructor);
				if (result == null) result = caseJvmIdentifyableElement(jvmConstructor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.JVM_OPERATION: {
				JvmOperation jvmOperation = (JvmOperation)theEObject;
				T result = caseJvmOperation(jvmOperation);
				if (result == null) result = caseJvmExecutable(jvmOperation);
				if (result == null) result = caseJvmFeature(jvmOperation);
				if (result == null) result = caseJvmMember(jvmOperation);
				if (result == null) result = caseJvmTypeParameterDeclarator(jvmOperation);
				if (result == null) result = caseJvmAnnotationTarget(jvmOperation);
				if (result == null) result = caseJvmIdentifyableElement(jvmOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.JVM_FORMAL_PARAMETER: {
				JvmFormalParameter jvmFormalParameter = (JvmFormalParameter)theEObject;
				T result = caseJvmFormalParameter(jvmFormalParameter);
				if (result == null) result = caseJvmIdentifyableElement(jvmFormalParameter);
				if (result == null) result = caseJvmAnnotationTarget(jvmFormalParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.JVM_ANNOTATION_TARGET: {
				JvmAnnotationTarget jvmAnnotationTarget = (JvmAnnotationTarget)theEObject;
				T result = caseJvmAnnotationTarget(jvmAnnotationTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.JVM_ANNOTATION_REFERENCE: {
				JvmAnnotationReference jvmAnnotationReference = (JvmAnnotationReference)theEObject;
				T result = caseJvmAnnotationReference(jvmAnnotationReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.JVM_ANNOTATION_VALUE: {
				JvmAnnotationValue jvmAnnotationValue = (JvmAnnotationValue)theEObject;
				T result = caseJvmAnnotationValue(jvmAnnotationValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.JVM_INT_ANNOTATION_VALUE: {
				JvmIntAnnotationValue jvmIntAnnotationValue = (JvmIntAnnotationValue)theEObject;
				T result = caseJvmIntAnnotationValue(jvmIntAnnotationValue);
				if (result == null) result = caseJvmAnnotationValue(jvmIntAnnotationValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.JVM_BOOLEAN_ANNOTATION_VALUE: {
				JvmBooleanAnnotationValue jvmBooleanAnnotationValue = (JvmBooleanAnnotationValue)theEObject;
				T result = caseJvmBooleanAnnotationValue(jvmBooleanAnnotationValue);
				if (result == null) result = caseJvmAnnotationValue(jvmBooleanAnnotationValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.JVM_BYTE_ANNOTATION_VALUE: {
				JvmByteAnnotationValue jvmByteAnnotationValue = (JvmByteAnnotationValue)theEObject;
				T result = caseJvmByteAnnotationValue(jvmByteAnnotationValue);
				if (result == null) result = caseJvmAnnotationValue(jvmByteAnnotationValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.JVM_SHORT_ANNOTATION_VALUE: {
				JvmShortAnnotationValue jvmShortAnnotationValue = (JvmShortAnnotationValue)theEObject;
				T result = caseJvmShortAnnotationValue(jvmShortAnnotationValue);
				if (result == null) result = caseJvmAnnotationValue(jvmShortAnnotationValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.JVM_LONG_ANNOTATION_VALUE: {
				JvmLongAnnotationValue jvmLongAnnotationValue = (JvmLongAnnotationValue)theEObject;
				T result = caseJvmLongAnnotationValue(jvmLongAnnotationValue);
				if (result == null) result = caseJvmAnnotationValue(jvmLongAnnotationValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.JVM_DOUBLE_ANNOTATION_VALUE: {
				JvmDoubleAnnotationValue jvmDoubleAnnotationValue = (JvmDoubleAnnotationValue)theEObject;
				T result = caseJvmDoubleAnnotationValue(jvmDoubleAnnotationValue);
				if (result == null) result = caseJvmAnnotationValue(jvmDoubleAnnotationValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.JVM_FLOAT_ANNOTATION_VALUE: {
				JvmFloatAnnotationValue jvmFloatAnnotationValue = (JvmFloatAnnotationValue)theEObject;
				T result = caseJvmFloatAnnotationValue(jvmFloatAnnotationValue);
				if (result == null) result = caseJvmAnnotationValue(jvmFloatAnnotationValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.JVM_CHAR_ANNOTATION_VALUE: {
				JvmCharAnnotationValue jvmCharAnnotationValue = (JvmCharAnnotationValue)theEObject;
				T result = caseJvmCharAnnotationValue(jvmCharAnnotationValue);
				if (result == null) result = caseJvmAnnotationValue(jvmCharAnnotationValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.JVM_STRING_ANNOTATION_VALUE: {
				JvmStringAnnotationValue jvmStringAnnotationValue = (JvmStringAnnotationValue)theEObject;
				T result = caseJvmStringAnnotationValue(jvmStringAnnotationValue);
				if (result == null) result = caseJvmAnnotationValue(jvmStringAnnotationValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.JVM_TYPE_ANNOTATION_VALUE: {
				JvmTypeAnnotationValue jvmTypeAnnotationValue = (JvmTypeAnnotationValue)theEObject;
				T result = caseJvmTypeAnnotationValue(jvmTypeAnnotationValue);
				if (result == null) result = caseJvmAnnotationValue(jvmTypeAnnotationValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.JVM_ANNOTATION_ANNOTATION_VALUE: {
				JvmAnnotationAnnotationValue jvmAnnotationAnnotationValue = (JvmAnnotationAnnotationValue)theEObject;
				T result = caseJvmAnnotationAnnotationValue(jvmAnnotationAnnotationValue);
				if (result == null) result = caseJvmAnnotationValue(jvmAnnotationAnnotationValue);
				if (result == null) result = caseJvmAnnotationTarget(jvmAnnotationAnnotationValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.JVM_ENUM_ANNOTATION_VALUE: {
				JvmEnumAnnotationValue jvmEnumAnnotationValue = (JvmEnumAnnotationValue)theEObject;
				T result = caseJvmEnumAnnotationValue(jvmEnumAnnotationValue);
				if (result == null) result = caseJvmAnnotationValue(jvmEnumAnnotationValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jvm Identifyable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jvm Identifyable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJvmIdentifyableElement(JvmIdentifyableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jvm Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jvm Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJvmType(JvmType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jvm Void</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jvm Void</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJvmVoid(JvmVoid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jvm Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jvm Component Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJvmComponentType(JvmComponentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jvm Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jvm Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJvmPrimitiveType(JvmPrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jvm Array Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jvm Array Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJvmArrayType(JvmArrayType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jvm Declared Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jvm Declared Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJvmDeclaredType(JvmDeclaredType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jvm Type Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jvm Type Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJvmTypeParameter(JvmTypeParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jvm Type Parameter Declarator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jvm Type Parameter Declarator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJvmTypeParameterDeclarator(JvmTypeParameterDeclarator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jvm Constraint Owner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jvm Constraint Owner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJvmConstraintOwner(JvmConstraintOwner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jvm Type Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jvm Type Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJvmTypeConstraint(JvmTypeConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jvm Upper Bound</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jvm Upper Bound</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJvmUpperBound(JvmUpperBound object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jvm Lower Bound</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jvm Lower Bound</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJvmLowerBound(JvmLowerBound object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jvm Annotation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jvm Annotation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJvmAnnotationType(JvmAnnotationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jvm Enumeration Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jvm Enumeration Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJvmEnumerationType(JvmEnumerationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jvm Enumeration Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jvm Enumeration Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJvmEnumerationLiteral(JvmEnumerationLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jvm Generic Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jvm Generic Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJvmGenericType(JvmGenericType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jvm Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jvm Type Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJvmTypeReference(JvmTypeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jvm Parameterized Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jvm Parameterized Type Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJvmParameterizedTypeReference(JvmParameterizedTypeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jvm Generic Array Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jvm Generic Array Type Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJvmGenericArrayTypeReference(JvmGenericArrayTypeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jvm Type Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jvm Type Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJvmTypeArgument(JvmTypeArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jvm Wildcard Type Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jvm Wildcard Type Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJvmWildcardTypeArgument(JvmWildcardTypeArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jvm Reference Type Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jvm Reference Type Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJvmReferenceTypeArgument(JvmReferenceTypeArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jvm Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jvm Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJvmMember(JvmMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jvm Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jvm Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJvmFeature(JvmFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jvm Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jvm Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJvmField(JvmField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jvm Executable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jvm Executable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJvmExecutable(JvmExecutable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jvm Constructor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jvm Constructor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJvmConstructor(JvmConstructor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jvm Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jvm Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJvmOperation(JvmOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jvm Formal Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jvm Formal Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJvmFormalParameter(JvmFormalParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jvm Annotation Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jvm Annotation Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJvmAnnotationTarget(JvmAnnotationTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jvm Annotation Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jvm Annotation Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJvmAnnotationReference(JvmAnnotationReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jvm Annotation Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jvm Annotation Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJvmAnnotationValue(JvmAnnotationValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jvm Int Annotation Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jvm Int Annotation Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJvmIntAnnotationValue(JvmIntAnnotationValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jvm Byte Annotation Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jvm Byte Annotation Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJvmByteAnnotationValue(JvmByteAnnotationValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jvm Boolean Annotation Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jvm Boolean Annotation Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJvmBooleanAnnotationValue(JvmBooleanAnnotationValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jvm Short Annotation Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jvm Short Annotation Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJvmShortAnnotationValue(JvmShortAnnotationValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jvm Long Annotation Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jvm Long Annotation Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJvmLongAnnotationValue(JvmLongAnnotationValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jvm Double Annotation Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jvm Double Annotation Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJvmDoubleAnnotationValue(JvmDoubleAnnotationValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jvm Float Annotation Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jvm Float Annotation Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJvmFloatAnnotationValue(JvmFloatAnnotationValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jvm Char Annotation Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jvm Char Annotation Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJvmCharAnnotationValue(JvmCharAnnotationValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jvm String Annotation Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jvm String Annotation Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJvmStringAnnotationValue(JvmStringAnnotationValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jvm Type Annotation Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jvm Type Annotation Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJvmTypeAnnotationValue(JvmTypeAnnotationValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jvm Annotation Annotation Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jvm Annotation Annotation Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJvmAnnotationAnnotationValue(JvmAnnotationAnnotationValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jvm Enum Annotation Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jvm Enum Annotation Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJvmEnumAnnotationValue(JvmEnumAnnotationValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //TypesSwitch
