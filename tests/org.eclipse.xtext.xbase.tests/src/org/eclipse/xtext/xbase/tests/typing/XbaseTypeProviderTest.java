/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.xbase.tests.typing;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.typing.ITypeProvider;
import org.eclipse.xtext.typing.TypeResolutionException;
import org.eclipse.xtext.xbase.XForLoopExpression;
import org.eclipse.xtext.xbase.tests.AbstractXbaseTestCase;
import org.eclipse.xtext.xbase.typing.IXbaseTypeProvider;
import org.eclipse.xtext.xbase.typing.TypesService;

import com.google.inject.Inject;

/**
 * @author Sven Efftinge
 */
public class XbaseTypeProviderTest extends AbstractXbaseTestCase {
	
	@Inject
	private IQualifiedNameConverter qualifiedNameConverter;
	
	public void testIfExpression() throws Exception {
		assertResolvedReturnType("java.lang.String", "if (true) 'foo' else null");
		assertResolvedReturnType("java.lang.String", "if (true) 'foo' else 'bar'");
		assertResolvedReturnType("java.lang.String", "if (true) 'foo'");
	}

	public void testSwitchExpression() throws Exception {
		assertResolvedReturnType(TypesService.STRING_TYPE_NAME,"switch true { case true : 's' case false : 'foo' default: 'bar'}");
		assertResolvedReturnType(TypesService.OBJECT_TYPE_NAME,"switch true { case true : 's' case false : new java.lang.Object() default: 'bar'}");
	}

	public void testBlockExpression() throws Exception {
		assertResolvedReturnType(TypesService.INTEGER_TYPE_NAME, "{true;4;}");
		assertResolvedReturnType(TypesService.BOOLEAN_TYPE_NAME, "{4;true;}");
		assertResolvedReturnType(TypesService.VOID_TYPE_NAME, "{null;}");
	}

	public void testNullLiteral() throws Exception {
		assertResolvedReturnType(TypesService.VOID_TYPE_NAME, "null");
	}
	
	public void testBooleanLiteral() throws Exception {
		assertResolvedReturnType(TypesService.BOOLEAN_TYPE_NAME, "true");
		assertResolvedReturnType(TypesService.BOOLEAN_TYPE_NAME, "false");
	}
	
	public void testStringLiteral() throws Exception {
		assertResolvedReturnType(TypesService.STRING_TYPE_NAME, "'foo'");
		assertResolvedReturnType(TypesService.STRING_TYPE_NAME, "\"foo\"");
	}
	
	public void testIntLiteral() throws Exception {
		assertResolvedReturnType(TypesService.INTEGER_TYPE_NAME, "3");
	}
	
	public void testCastExpression() throws Exception {
		assertResolvedReturnType(TypesService.STRING_TYPE_NAME, "null as String");
		assertResolvedReturnType(TypesService.BOOLEAN_TYPE_NAME, "'foo' as Boolean");
	}
	
	public void testConstructorCall() throws Exception {
		assertResolvedReturnType("java.util.ArrayList", "new java.util.ArrayList()");
		assertResolvedReturnType("java.util.ArrayList<java.lang.String>", 
								"new java.util.ArrayList<java.lang.String>()");
		assertResolvedReturnType("java.util.HashMap<java.lang.String,java.lang.Boolean>", 
								"new java.util.HashMap<java.lang.String, java.lang.Boolean>()");
		assertResolvedReturnType("java.util.HashMap<? extends java.lang.String,? super java.lang.Boolean>", 
							"new java.util.HashMap<? extends java.lang.String, ? super java.lang.Boolean>()");
	}
	
	public void testClosure() throws Exception {
		assertResolvedReturnType("(java.lang.String) => java.lang.Boolean", "[java.lang.String x| true]");
	}
	
	public void testFeatureCall() throws Exception {
		assertResolvedReturnType("java.lang.Integer", "'foo'.length");
	}
	
	public void testFeatureCall_1() throws Exception {
		assertResolvedReturnType("java.util.List<java.lang.Byte>", "'foo'.getBytes()");
		assertResolvedReturnType("java.lang.Boolean", "'foo'.getBytes().add(null)");
//		assertResolvedReturnType("java.lang.String", "new java.util.ArrayList<java.lang.String>().get(23)");
	}
	
	public void testFeatureCallWithOperatorOverloading2() throws Exception {
		assertResolvedReturnType("java.lang.Boolean", "'foo'.getBytes() += null");
		assertResolvedReturnType("java.lang.Boolean", "'foo'.getBytes() += 'x'.getBytes().get(0)");
	}
	
	public void testFeatureCallOnThis() throws Exception {
		assertResolvedReturnType("java.lang.Boolean", "{ val this = 'foo'; getBytes() += null;}");
		assertResolvedReturnType("java.lang.Boolean", "{ var this = 'foo'; this.getBytes() += getBytes().get(0);}");
	}
	
	public void testThrowExpression() throws Exception {
		assertResolvedReturnType("java.lang.Void", "throw new java.lang.Exception()");
	}
	
	//TODO
//	public void testTryCatchFinallyExpression_0() throws Exception {
//		assertResolvedReturnType("java.lang.String", "try 'foo' catch (java.lang.Exception e) 42"); 
//	}
//	public void testTryCatchFinallyExpression_1() throws Exception {
//		assertResolvedReturnType("java.lang.String", "try 'foo' catch (java.lang.Exception e) 42 catch(java.lang.RuntimeException e) 43");	
//	}
//	public void testTryCatchFinallyExpression_2() throws Exception {
//		assertResolvedReturnType("java.lang.String", "try 'foo' catch (java.lang.Exception e) 42 catch(java.lang.RuntimeException e) 43 finally true");	
//	}
	
	public void testForExpression() throws Exception {
		assertResolvedReturnType("java.lang.Void", "for(java.lang.String x : new java.util.ArrayList()) 'foo'");
	}
	
	public void testVariableDeclaration_in_ForExpression_0() throws Exception {
		XForLoopExpression expression = (XForLoopExpression) expression("for(x : null as java.util.List<String>) 'foo'", true);
		JvmTypeReference typeRef = typeProvider.getType(expression.getDeclaredParam());
		assertEquals("java.lang.String", typeRef.getCanonicalName());
	}
	public void testVariableDeclaration_in_ForExpression_1() throws Exception {
		XForLoopExpression expression = (XForLoopExpression) expression("for(x : null as Iterable<?>) 'foo'", true);
		JvmTypeReference typeRef = typeProvider.getType(expression.getDeclaredParam());
		assertEquals("java.lang.Object", typeRef.getCanonicalName());
	}
	public void testVariableDeclaration_in_ForExpression_2() throws Exception {
		XForLoopExpression expression = (XForLoopExpression) expression("for(x : null as java.util.ArrayList<? extends java.util.List<Integer>>) 'foo'", true);
		JvmTypeReference typeRef = typeProvider.getType(expression.getDeclaredParam());
		assertEquals("java.util.List<java.lang.Integer>", typeRef.getCanonicalName());
	}
	
	public void testNull() throws Exception {
		try {
			typeProvider.getType(null);
			fail("Exception expected");
		} catch (TypeResolutionException e) {
			assertTrue(e.getMessage().contains("is null"));
		}
	}
	
	public void testEObject() throws Exception {
		try {
			typeProvider.getType(EcoreFactory.eINSTANCE.createEObject());
			fail("Exception expected");
		} catch (TypeResolutionException e) {
			assertTrue(e.getMessage().contains("not implemented"));
		}
	}

	public void testProxy() throws Exception {
		try {
			EObject proxy = EcoreFactory.eINSTANCE.createEObject();
			((InternalEObject)proxy).eSetProxyURI(URI.createURI("path#fragment"));
			typeProvider.getType(proxy);
			fail("Exception expected");
		} catch (TypeResolutionException e) {
			assertTrue(e.getMessage().contains("unresolved proxy"));
		}
	}
	
	@Inject
	private IXbaseTypeProvider typeProvider;
	
	public void assertResolvedReturnType(QualifiedName typeName, String expression) throws Exception {
		JvmTypeReference typeRef = typeProvider.getType(expression(expression,true));
		assertNotNull("type ref was null for "+expression,typeRef);
		assertEquals(qualifiedNameConverter.toString(typeName) ,toString(typeRef));
	}

	public void assertResolvedReturnType(String typeName, String expression) throws Exception {
		assertResolvedReturnType(qualifiedNameConverter.toQualifiedName(typeName), expression);
	}
	
	protected String toString(JvmTypeReference typeref) {
		return typeref.getCanonicalName();
	}
	
	
}
