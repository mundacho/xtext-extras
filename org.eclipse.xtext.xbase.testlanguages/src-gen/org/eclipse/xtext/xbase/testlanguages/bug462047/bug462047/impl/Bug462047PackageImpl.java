/**
 * Copyright (c) 2011, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.xbase.testlanguages.bug462047.bug462047.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.common.types.TypesPackage;

import org.eclipse.xtext.xbase.testlanguages.bug462047.bug462047.Bug462047Element;
import org.eclipse.xtext.xbase.testlanguages.bug462047.bug462047.Bug462047Factory;
import org.eclipse.xtext.xbase.testlanguages.bug462047.bug462047.Bug462047Package;
import org.eclipse.xtext.xbase.testlanguages.bug462047.bug462047.Bug462047Root;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Bug462047PackageImpl extends EPackageImpl implements Bug462047Package
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bug462047RootEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bug462047ElementEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.eclipse.xtext.xbase.testlanguages.bug462047.bug462047.Bug462047Package#eNS_URI
   * @see #init()
   * @generated
   */
  private Bug462047PackageImpl()
  {
    super(eNS_URI, Bug462047Factory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link Bug462047Package#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static Bug462047Package init()
  {
    if (isInited) return (Bug462047Package)EPackage.Registry.INSTANCE.getEPackage(Bug462047Package.eNS_URI);

    // Obtain or create and register package
    Object registeredBug462047Package = EPackage.Registry.INSTANCE.get(eNS_URI);
    Bug462047PackageImpl theBug462047Package = registeredBug462047Package instanceof Bug462047PackageImpl ? (Bug462047PackageImpl)registeredBug462047Package : new Bug462047PackageImpl();

    isInited = true;

    // Initialize simple dependencies
    TypesPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theBug462047Package.createPackageContents();

    // Initialize created meta-data
    theBug462047Package.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theBug462047Package.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(Bug462047Package.eNS_URI, theBug462047Package);
    return theBug462047Package;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getBug462047Root()
  {
    return bug462047RootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getBug462047Root_Elements()
  {
    return (EReference)bug462047RootEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getBug462047Element()
  {
    return bug462047ElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getBug462047Element_Name()
  {
    return (EAttribute)bug462047ElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getBug462047Element_Ref()
  {
    return (EReference)bug462047ElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Bug462047Factory getBug462047Factory()
  {
    return (Bug462047Factory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    bug462047RootEClass = createEClass(BUG462047_ROOT);
    createEReference(bug462047RootEClass, BUG462047_ROOT__ELEMENTS);

    bug462047ElementEClass = createEClass(BUG462047_ELEMENT);
    createEAttribute(bug462047ElementEClass, BUG462047_ELEMENT__NAME);
    createEReference(bug462047ElementEClass, BUG462047_ELEMENT__REF);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(bug462047RootEClass, Bug462047Root.class, "Bug462047Root", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBug462047Root_Elements(), this.getBug462047Element(), null, "elements", null, 0, -1, Bug462047Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bug462047ElementEClass, Bug462047Element.class, "Bug462047Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBug462047Element_Name(), ecorePackage.getEString(), "name", null, 0, 1, Bug462047Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBug462047Element_Ref(), theTypesPackage.getJvmGenericType(), null, "ref", null, 0, 1, Bug462047Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //Bug462047PackageImpl
