/**
 * Copyright (c) 2011, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.xbase.testlanguages.contentAssistFragmentTestLang.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.xbase.XExpression;

import org.eclipse.xtext.xbase.testlanguages.contentAssistFragmentTestLang.ContentAssistFragmentTestLangPackage;
import org.eclipse.xtext.xbase.testlanguages.contentAssistFragmentTestLang.ContentAssistFragmentTestLanguageRoot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content Assist Fragment Test Language Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.xbase.testlanguages.contentAssistFragmentTestLang.impl.ContentAssistFragmentTestLanguageRootImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContentAssistFragmentTestLanguageRootImpl extends MinimalEObjectImpl.Container implements ContentAssistFragmentTestLanguageRoot
{
  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected XExpression expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContentAssistFragmentTestLanguageRootImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ContentAssistFragmentTestLangPackage.Literals.CONTENT_ASSIST_FRAGMENT_TEST_LANGUAGE_ROOT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public XExpression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(XExpression newExpression, NotificationChain msgs)
  {
    XExpression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContentAssistFragmentTestLangPackage.CONTENT_ASSIST_FRAGMENT_TEST_LANGUAGE_ROOT__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExpression(XExpression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContentAssistFragmentTestLangPackage.CONTENT_ASSIST_FRAGMENT_TEST_LANGUAGE_ROOT__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ContentAssistFragmentTestLangPackage.CONTENT_ASSIST_FRAGMENT_TEST_LANGUAGE_ROOT__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContentAssistFragmentTestLangPackage.CONTENT_ASSIST_FRAGMENT_TEST_LANGUAGE_ROOT__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ContentAssistFragmentTestLangPackage.CONTENT_ASSIST_FRAGMENT_TEST_LANGUAGE_ROOT__EXPRESSION:
        return basicSetExpression(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ContentAssistFragmentTestLangPackage.CONTENT_ASSIST_FRAGMENT_TEST_LANGUAGE_ROOT__EXPRESSION:
        return getExpression();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ContentAssistFragmentTestLangPackage.CONTENT_ASSIST_FRAGMENT_TEST_LANGUAGE_ROOT__EXPRESSION:
        setExpression((XExpression)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ContentAssistFragmentTestLangPackage.CONTENT_ASSIST_FRAGMENT_TEST_LANGUAGE_ROOT__EXPRESSION:
        setExpression((XExpression)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ContentAssistFragmentTestLangPackage.CONTENT_ASSIST_FRAGMENT_TEST_LANGUAGE_ROOT__EXPRESSION:
        return expression != null;
    }
    return super.eIsSet(featureID);
  }

} //ContentAssistFragmentTestLanguageRootImpl
