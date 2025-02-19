/*******************************************************************************
 * Copyright (c) 2014, 2020 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.xbase.testlanguages;

import org.eclipse.xtext.xbase.jvmmodel.IJvmModelInferrer;
import org.eclipse.xtext.xbase.testlanguages.jvmmodel.XImportSectionTestLangJvmModelInferrer;

/**
 * Use this class to register components to be used at runtime / without the
 * Equinox extension registry.
 */
public class XImportSectionTestLangRuntimeModule
		extends org.eclipse.xtext.xbase.testlanguages.AbstractXImportSectionTestLangRuntimeModule {
	public Class<? extends IJvmModelInferrer> bindIJvmModelInferrer() {
		return XImportSectionTestLangJvmModelInferrer.class;
	}
}
