/**
 * Copyright (c) 2011, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.xbase.testlanguages.bug462047.bug462047;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.xbase.testlanguages.bug462047.bug462047.Bug462047Factory
 * @model kind="package"
 * @generated
 */
public interface Bug462047Package extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "bug462047";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "xbase.bug462047";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "bug462047";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  Bug462047Package eINSTANCE = org.eclipse.xtext.xbase.testlanguages.bug462047.bug462047.impl.Bug462047PackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.xtext.xbase.testlanguages.bug462047.bug462047.impl.Bug462047RootImpl <em>Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.xbase.testlanguages.bug462047.bug462047.impl.Bug462047RootImpl
   * @see org.eclipse.xtext.xbase.testlanguages.bug462047.bug462047.impl.Bug462047PackageImpl#getBug462047Root()
   * @generated
   */
  int BUG462047_ROOT = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUG462047_ROOT__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUG462047_ROOT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.xbase.testlanguages.bug462047.bug462047.impl.Bug462047ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.xbase.testlanguages.bug462047.bug462047.impl.Bug462047ElementImpl
   * @see org.eclipse.xtext.xbase.testlanguages.bug462047.bug462047.impl.Bug462047PackageImpl#getBug462047Element()
   * @generated
   */
  int BUG462047_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUG462047_ELEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUG462047_ELEMENT__REF = 1;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUG462047_ELEMENT_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.xbase.testlanguages.bug462047.bug462047.Bug462047Root <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Root</em>'.
   * @see org.eclipse.xtext.xbase.testlanguages.bug462047.bug462047.Bug462047Root
   * @generated
   */
  EClass getBug462047Root();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.xbase.testlanguages.bug462047.bug462047.Bug462047Root#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.eclipse.xtext.xbase.testlanguages.bug462047.bug462047.Bug462047Root#getElements()
   * @see #getBug462047Root()
   * @generated
   */
  EReference getBug462047Root_Elements();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.xbase.testlanguages.bug462047.bug462047.Bug462047Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see org.eclipse.xtext.xbase.testlanguages.bug462047.bug462047.Bug462047Element
   * @generated
   */
  EClass getBug462047Element();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.xbase.testlanguages.bug462047.bug462047.Bug462047Element#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.xbase.testlanguages.bug462047.bug462047.Bug462047Element#getName()
   * @see #getBug462047Element()
   * @generated
   */
  EAttribute getBug462047Element_Name();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.xtext.xbase.testlanguages.bug462047.bug462047.Bug462047Element#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see org.eclipse.xtext.xbase.testlanguages.bug462047.bug462047.Bug462047Element#getRef()
   * @see #getBug462047Element()
   * @generated
   */
  EReference getBug462047Element_Ref();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  Bug462047Factory getBug462047Factory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.eclipse.xtext.xbase.testlanguages.bug462047.bug462047.impl.Bug462047RootImpl <em>Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.xbase.testlanguages.bug462047.bug462047.impl.Bug462047RootImpl
     * @see org.eclipse.xtext.xbase.testlanguages.bug462047.bug462047.impl.Bug462047PackageImpl#getBug462047Root()
     * @generated
     */
    EClass BUG462047_ROOT = eINSTANCE.getBug462047Root();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUG462047_ROOT__ELEMENTS = eINSTANCE.getBug462047Root_Elements();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.xbase.testlanguages.bug462047.bug462047.impl.Bug462047ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.xbase.testlanguages.bug462047.bug462047.impl.Bug462047ElementImpl
     * @see org.eclipse.xtext.xbase.testlanguages.bug462047.bug462047.impl.Bug462047PackageImpl#getBug462047Element()
     * @generated
     */
    EClass BUG462047_ELEMENT = eINSTANCE.getBug462047Element();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUG462047_ELEMENT__NAME = eINSTANCE.getBug462047Element_Name();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUG462047_ELEMENT__REF = eINSTANCE.getBug462047Element_Ref();

  }

} //Bug462047Package
