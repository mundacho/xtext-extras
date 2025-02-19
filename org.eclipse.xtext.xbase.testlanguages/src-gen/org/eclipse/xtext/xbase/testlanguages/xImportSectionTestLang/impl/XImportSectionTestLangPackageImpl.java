/**
 * Copyright (c) 2011, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.xbase.testlanguages.xImportSectionTestLang.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.common.types.TypesPackage;

import org.eclipse.xtext.xbase.testlanguages.xImportSectionTestLang.ImportSectionTestLanguageRoot;
import org.eclipse.xtext.xbase.testlanguages.xImportSectionTestLang.XImportSectionTestLangFactory;
import org.eclipse.xtext.xbase.testlanguages.xImportSectionTestLang.XImportSectionTestLangPackage;

import org.eclipse.xtext.xtype.XtypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XImportSectionTestLangPackageImpl extends EPackageImpl implements XImportSectionTestLangPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importSectionTestLanguageRootEClass = null;

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
   * @see org.eclipse.xtext.xbase.testlanguages.xImportSectionTestLang.XImportSectionTestLangPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private XImportSectionTestLangPackageImpl()
  {
    super(eNS_URI, XImportSectionTestLangFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link XImportSectionTestLangPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static XImportSectionTestLangPackage init()
  {
    if (isInited) return (XImportSectionTestLangPackage)EPackage.Registry.INSTANCE.getEPackage(XImportSectionTestLangPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredXImportSectionTestLangPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    XImportSectionTestLangPackageImpl theXImportSectionTestLangPackage = registeredXImportSectionTestLangPackage instanceof XImportSectionTestLangPackageImpl ? (XImportSectionTestLangPackageImpl)registeredXImportSectionTestLangPackage : new XImportSectionTestLangPackageImpl();

    isInited = true;

    // Initialize simple dependencies
    XtypePackage.eINSTANCE.eClass();
    TypesPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theXImportSectionTestLangPackage.createPackageContents();

    // Initialize created meta-data
    theXImportSectionTestLangPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theXImportSectionTestLangPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(XImportSectionTestLangPackage.eNS_URI, theXImportSectionTestLangPackage);
    return theXImportSectionTestLangPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getImportSectionTestLanguageRoot()
  {
    return importSectionTestLanguageRootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getImportSectionTestLanguageRoot_ImportSection()
  {
    return (EReference)importSectionTestLanguageRootEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public XImportSectionTestLangFactory getXImportSectionTestLangFactory()
  {
    return (XImportSectionTestLangFactory)getEFactoryInstance();
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
    importSectionTestLanguageRootEClass = createEClass(IMPORT_SECTION_TEST_LANGUAGE_ROOT);
    createEReference(importSectionTestLanguageRootEClass, IMPORT_SECTION_TEST_LANGUAGE_ROOT__IMPORT_SECTION);
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
    XtypePackage theXtypePackage = (XtypePackage)EPackage.Registry.INSTANCE.getEPackage(XtypePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(importSectionTestLanguageRootEClass, ImportSectionTestLanguageRoot.class, "ImportSectionTestLanguageRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getImportSectionTestLanguageRoot_ImportSection(), theXtypePackage.getXImportSection(), null, "importSection", null, 0, 1, ImportSectionTestLanguageRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //XImportSectionTestLangPackageImpl
