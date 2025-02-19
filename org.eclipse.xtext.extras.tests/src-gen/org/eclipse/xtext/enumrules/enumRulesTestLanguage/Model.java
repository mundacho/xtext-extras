/**
 * Copyright (c) 2011, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.enumrules.enumRulesTestLanguage;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.enumrules.enums.ExistingEnum;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.enumrules.enumRulesTestLanguage.Model#getExisting <em>Existing</em>}</li>
 *   <li>{@link org.eclipse.xtext.enumrules.enumRulesTestLanguage.Model#getGenerated <em>Generated</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.enumrules.enumRulesTestLanguage.EnumRulesTestLanguagePackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Existing</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.xtext.enumrules.enums.ExistingEnum}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Existing</em>' attribute.
   * @see org.eclipse.xtext.enumrules.enums.ExistingEnum
   * @see #setExisting(ExistingEnum)
   * @see org.eclipse.xtext.enumrules.enumRulesTestLanguage.EnumRulesTestLanguagePackage#getModel_Existing()
   * @model
   * @generated
   */
  ExistingEnum getExisting();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.enumrules.enumRulesTestLanguage.Model#getExisting <em>Existing</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Existing</em>' attribute.
   * @see org.eclipse.xtext.enumrules.enums.ExistingEnum
   * @see #getExisting()
   * @generated
   */
  void setExisting(ExistingEnum value);

  /**
   * Returns the value of the '<em><b>Generated</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.xtext.enumrules.enumRulesTestLanguage.GeneratedEnum}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Generated</em>' attribute.
   * @see org.eclipse.xtext.enumrules.enumRulesTestLanguage.GeneratedEnum
   * @see #setGenerated(GeneratedEnum)
   * @see org.eclipse.xtext.enumrules.enumRulesTestLanguage.EnumRulesTestLanguagePackage#getModel_Generated()
   * @model
   * @generated
   */
  GeneratedEnum getGenerated();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.enumrules.enumRulesTestLanguage.Model#getGenerated <em>Generated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Generated</em>' attribute.
   * @see org.eclipse.xtext.enumrules.enumRulesTestLanguage.GeneratedEnum
   * @see #getGenerated()
   * @generated
   */
  void setGenerated(GeneratedEnum value);

} // Model
