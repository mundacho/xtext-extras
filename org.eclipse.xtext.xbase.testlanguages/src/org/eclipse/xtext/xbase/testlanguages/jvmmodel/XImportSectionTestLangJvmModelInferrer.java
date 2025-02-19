/*******************************************************************************
 * Copyright (c) 2020 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.xbase.testlanguages.jvmmodel;

import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;

/**
 * <p>
 * Infers a JVM model from the source model.
 * </p>
 * 
 * <p>
 * The JVM model should contain all elements that would appear in the Java code
 * which is generated from the source model. Other models link against the JVM
 * model rather than the source model.
 * </p>
 */
public class XImportSectionTestLangJvmModelInferrer extends AbstractModelInferrer {
}
