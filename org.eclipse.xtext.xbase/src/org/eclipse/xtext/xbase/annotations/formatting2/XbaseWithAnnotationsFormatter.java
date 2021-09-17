/**
 * Copyright (c) 2014, 2021 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.xbase.annotations.formatting2;

import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.IHiddenRegionFormatter;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotationElementValuePair;
import org.eclipse.xtext.xbase.formatting2.XbaseFormatter;

/**
 * @author Moritz Eysholdt - Initial implementation and API
 */
public class XbaseWithAnnotationsFormatter extends XbaseFormatter {
	protected void _format(XAnnotation ann, IFormattableDocument document) {
		document.append(textRegionExtensions.regionFor(ann).keyword("@"), IHiddenRegionFormatter::noSpace);
		document.surround(textRegionExtensions.regionFor(ann).keyword("("), IHiddenRegionFormatter::noSpace);
		if (ann.getValue() != null) {
			document.format(ann.getValue());
			document.prepend(textRegionExtensions.regionFor(ann).keyword(")"), IHiddenRegionFormatter::noSpace);
		} else {
			if (!ann.getElementValuePairs().isEmpty()) {
				for (XAnnotationElementValuePair pair : ann.getElementValuePairs()) {
					document.surround(textRegionExtensions.regionFor(pair).keyword("="),
							IHiddenRegionFormatter::noSpace);
					document.<XExpression>format(pair.getValue());
					document.append(document.prepend(textRegionExtensions.immediatelyFollowing(pair).keyword(","),
							IHiddenRegionFormatter::noSpace), IHiddenRegionFormatter::oneSpace);
				}
				document.prepend(textRegionExtensions.regionFor(ann).keyword(")"), IHiddenRegionFormatter::noSpace);
			}
		}
	}

	@Override
	public void format(Object ann, IFormattableDocument document) {
		if (ann instanceof XAnnotation) {
			_format((XAnnotation) ann, document);
			return;
		}
		super.format(ann, document);
	}
}
