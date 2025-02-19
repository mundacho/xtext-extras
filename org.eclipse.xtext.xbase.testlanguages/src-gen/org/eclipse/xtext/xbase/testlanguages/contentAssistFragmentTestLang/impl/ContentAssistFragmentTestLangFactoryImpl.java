/**
 * Copyright (c) 2011, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.xbase.testlanguages.contentAssistFragmentTestLang.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.xtext.xbase.testlanguages.contentAssistFragmentTestLang.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContentAssistFragmentTestLangFactoryImpl extends EFactoryImpl implements ContentAssistFragmentTestLangFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ContentAssistFragmentTestLangFactory init()
  {
    try
    {
      ContentAssistFragmentTestLangFactory theContentAssistFragmentTestLangFactory = (ContentAssistFragmentTestLangFactory)EPackage.Registry.INSTANCE.getEFactory(ContentAssistFragmentTestLangPackage.eNS_URI);
      if (theContentAssistFragmentTestLangFactory != null)
      {
        return theContentAssistFragmentTestLangFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ContentAssistFragmentTestLangFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContentAssistFragmentTestLangFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ContentAssistFragmentTestLangPackage.CONTENT_ASSIST_FRAGMENT_TEST_LANGUAGE_ROOT: return createContentAssistFragmentTestLanguageRoot();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ContentAssistFragmentTestLanguageRoot createContentAssistFragmentTestLanguageRoot()
  {
    ContentAssistFragmentTestLanguageRootImpl contentAssistFragmentTestLanguageRoot = new ContentAssistFragmentTestLanguageRootImpl();
    return contentAssistFragmentTestLanguageRoot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ContentAssistFragmentTestLangPackage getContentAssistFragmentTestLangPackage()
  {
    return (ContentAssistFragmentTestLangPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ContentAssistFragmentTestLangPackage getPackage()
  {
    return ContentAssistFragmentTestLangPackage.eINSTANCE;
  }

} //ContentAssistFragmentTestLangFactoryImpl
