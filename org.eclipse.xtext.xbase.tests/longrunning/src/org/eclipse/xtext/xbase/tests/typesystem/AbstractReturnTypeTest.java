/**
 * Copyright (c) 2012, 2021 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.xbase.tests.typesystem;

import org.eclipse.xtext.util.JavaRuntimeVersion;
import org.junit.Test;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public abstract class AbstractReturnTypeTest<Reference extends Object> extends AbstractTypeResolverTest<Reference> {
	@Test
	@Override
	public void testReturnExpression_01() throws Exception {
		resolvesTo("return 'foo'", "String");
	}

	@Test
	@Override
	public void testReturnExpression_02() throws Exception {
		resolvesTo("return try { if (true) 'foo' else 'bar' } finally { String::valueOf('zonk') }", "String");
	}

	@Test
	@Override
	public void testReturnExpression_03() throws Exception {
		resolvesTo("{ val c = [ int i | return i ] c.apply(1) return null }", "null");
	}

	@Test
	@Override
	public void testReturnExpression_04() throws Exception {
		resolvesTo("{ val c = [ int i | i ] c.apply(1) return null }", "null");
	}

	@Test
	@Override
	public void testReturnExpression_06() throws Exception {
		resolvesTo("{ var closure = [| return 'literal'] return closure.apply }", "String");
	}

	@Test
	@Override
	public void testReturnExpression_08() throws Exception {
		resolvesTo("return [| return 'literal'].apply", "String");
	}

	@Test
	@Override
	public void testReturnExpression_10() throws Exception {
		resolvesTo("return if (true) while(false) ('foo'+'bar').length", "null");
	}

	@Test
	@Override
	public void testBooleanLiteral_02() throws Exception {
		resolvesTo("return true", "boolean");
	}

	@Test
	@Override
	public void testIfExpression_03() throws Exception {
		resolvesTo("if (true) return 'foo'", "String");
	}

	@Test
	@Override
	public void testIfExpression_04() throws Exception {
		if (JavaRuntimeVersion.isJava11OrLater()) {
			resolvesTo("if (true) return '' else new StringBuilder", "Serializable & Comparable<?> & CharSequence");
		} else {
			resolvesTo("if (true) return '' else new StringBuilder", "Serializable & CharSequence");
		}
	}

	@Test
	@Override
	public void testIfExpression_17() throws Exception {
		resolvesTo("if (true) return 1", "int");
	}

	@Test
	@Override
	public void testIfExpression_19() throws Exception {
		resolvesTo("if (true) return else null", "void");
	}

	@Test
	@Override
	public void testIfExpression_23() throws Exception {
		resolvesTo("{ val x = if (true) return 1 x }", "Integer");
	}

	@Test
	@Override
	public void testIfExpression_24() throws Exception {
		resolvesTo("{ val x = if (true) return; x }", "void");
	}

	@Test
	@Override
	public void testIfExpression_25() throws Exception {
		resolvesTo("{ val x = if (true) return else null x }", "void");
	}

	@Test
	@Override
	public void testIfExpression_28() throws Exception {
		if (JavaRuntimeVersion.isJava12OrLater()) {
			resolvesTo("if (true) return '' else 1", "Comparable<?> & Constable & ConstantDesc & Serializable");
		} else {
			resolvesTo("if (true) return '' else 1", "Comparable<?> & Serializable");
		}
	}

	@Test
	@Override
	public void testSwitchExpression_1() throws Exception {
		resolvesTo("switch true { case true : return 's' default: null}", "String");
	}

	@Test
	@Override
	public void testSwitchExpression_2() throws Exception {
		resolvesTo("switch null { Object : return null }", "null");
	}

	@Test
	@Override
	public void testForExpression_05() throws Exception {
		resolvesTo("for(String x : new java.util.ArrayList<String>()) return x.length", "Integer");
		resolvesTo("for(String x : newArrayList('foo')) return x.length", "Integer");
		resolvesTo("for(String x : <String>newArrayList()) return x.length", "Integer");
	}

	@Test
	@Override
	public void testForExpression_06() throws Exception {
		resolvesTo("for(x : new java.util.ArrayList<String>()) return x.length", "Integer");
		resolvesTo("for(x : <String>newArrayList()) return x.length", "Integer");
		resolvesTo("for(x : newArrayList('foo')) return x.length", "Integer");
	}

	@Test
	@Override
	public void testForExpression_07() throws Exception {
		resolvesTo("for(String x : null as String[]) return x.length", "Integer");
	}

	@Test
	@Override
	public void testForExpression_08() throws Exception {
		resolvesTo("for(x : null as String[]) return x.length", "Integer");
	}

	@Test
	public void testForExpression_10() throws Exception {
		resolvesTo("{ for(x : null as String[]) return x.length 1 }", "int");
	}

	@Test
	public void testForExpression_11() throws Exception {
		resolvesTo("for(x : null as String[]) if (true) return 1", "Integer");
	}

	@Test
	public void testForExpression_12() throws Exception {
		resolvesTo("for(x : null as String[]) if (true) return 1 else return 2", "Integer");
	}

	@Test
	@Override
	public void testWhileExpression_02() throws Exception {
		resolvesTo("while(true) return 1", "Integer");
	}

	@Test
	public void testWhileExpression_03() throws Exception {
		resolvesTo("while(if (true) return 1 else false) ''.length", "Integer");
	}

	@Test
	public void testWhileExpression_04() throws Exception {
		resolvesTo("while(null instanceof String) return ''", "String");
	}

	@Test
	public void testWhileExpression_05() throws Exception {
		resolvesTo("{ while(null instanceof String) return '' return '' }", "String");
	}

	@Test
	public void testWhileExpression_EarlyExitWithSwitchCase() throws Exception {
		// @formatter:off
		resolvesTo(
				"while(true) {\n" +
				"	switch 'test' {\n" +
				"		case 'foo' : return 'result'\n" +
				"	}\n" +
				"}",
				"String");
		// @formatter:on
	}

	@Test
	public void testWhileExpression_EarlyExitWithSwitchDefault() throws Exception {
		// @formatter:off
		resolvesTo(
				"while(true) {\n" +
				"	switch 'test' {\n" +
				"		case 'foo' : {}\n" +
				"		default : return 'result'\n" +
				"	}\n" +
				"}",
				"String");
		// @formatter:on
	}

	@Test
	public void testWhileExpression_EarlyExitWithSwitchAndIf() throws Exception {
		// @formatter:off
		resolvesTo(
				"while(true) {\n" +
				"	if(false) {\n" +
				"		switch 'test' {\n" +
				"			case 'foo' : if(false) return 'result'\n" +
				"		}\n" +
				"	}\n" +
				"}",
				"String");
		// @formatter:on
	}

	@Test
	@Override
	public void testTryCatchFinallyExpression_08() throws Exception {
		resolvesTo("try return 'foo' catch (Exception e) return 'bar'", "String");
	}

	@Test
	@Override
	public void testTryCatchFinallyExpression_09() throws Exception {
		resolvesTo("try return 'foo' catch (Exception e) return 'bar' catch(RuntimeException e) return 'baz'", "String");
	}

	@Test
	@Override
	public void testTryCatchFinallyExpression_10() throws Exception {
		resolvesTo("try return 'foo' catch (Exception e) return 'bar' catch(RuntimeException e) return 'baz' finally true", "String");
	}

	@Test
	@Override
	public void testTryCatchFinallyExpression_11() throws Exception {
		if (JavaRuntimeVersion.isJava15OrLater()) {
			resolvesTo("try { return 'literal' as Object as Boolean } catch(ClassCastException e) return 'caught'",
					"Serializable & Comparable<?> & Constable");
		} else {
			resolvesTo("try { return 'literal' as Object as Boolean } catch(ClassCastException e) return 'caught'",
					"Serializable & Comparable<?>");
		}
	}

	@Test
	@Override
	public void testTryCatchFinallyExpression_12() throws Exception {
		if (JavaRuntimeVersion.isJava15OrLater()) {
			resolvesTo("try { return 'literal' as Object as Boolean } catch(ClassCastException e) {return 'caught'}",
					"Serializable & Comparable<?> & Constable");
		} else {
			resolvesTo("try { return 'literal' as Object as Boolean } catch(ClassCastException e) {return 'caught'}",
					"Serializable & Comparable<?>");
		}
	}

	@Test
	@Override
	public void testTryCatchFinallyExpression_13() throws Exception {
		// @formatter:off
		if (JavaRuntimeVersion.isJava15OrLater()) {
			resolvesTo(
					"try return 'literal' as Object as Boolean\n" +
							"catch(NullPointerException e) return 'second thing is thrown'" +
							"catch(ClassCastException e) throw new NullPointerException()",
					"Serializable & Comparable<?> & Constable");
		} else {
			resolvesTo(
					"try return 'literal' as Object as Boolean\n" +
							"catch(NullPointerException e) return 'second thing is thrown'" +
							"catch(ClassCastException e) throw new NullPointerException()",
					"Serializable & Comparable<?>");
		}
		// @formatter:on
	}

	@Test
	@Override
	public void testTryCatchFinallyExpression_14() throws Exception {
		// @formatter:off
		if (JavaRuntimeVersion.isJava15OrLater()) {
			resolvesTo(
					"try return 'literal' as Object as Boolean\n"+
							"catch(ClassCastException e) throw new NullPointerException()\n" +
							"catch(NullPointerException e) return 'dont catch subsequent exceptions'",
					"Serializable & Comparable<?> & Constable");
		} else {
			resolvesTo(
					"try return 'literal' as Object as Boolean\n"+
							"catch(ClassCastException e) throw new NullPointerException()\n" +
							"catch(NullPointerException e) return 'dont catch subsequent exceptions'",
					"Serializable & Comparable<?>");
		}
		// @formatter:on
	}

	@Test
	@Override
	public void testTryCatchFinallyExpression_15() throws Exception {
		// @formatter:off
		resolvesTo(
				"try return 'literal' as Object as Boolean\n" +
				"catch(ClassCastException e) return null as Number\n" +
				"catch(NullPointerException e) return 'dont catch subsequent exceptions'",
				"Serializable");
		// @formatter:on
	}

	@Test
	@Override
	public void testTryCatchFinallyExpression_19() throws Exception {
		if (JavaRuntimeVersion.isJava15OrLater()) {
			resolvesTo("try { return 'literal' as Object as Boolean } catch(ClassCastException e) 'caught'", "Serializable & Comparable<?> & Constable");
		} else {
			resolvesTo("try { return 'literal' as Object as Boolean } catch(ClassCastException e) 'caught'", "Serializable & Comparable<?>");
		}
	}

	@Test
	@Override
	public void testTryCatchFinallyExpression_20() throws Exception {
		if (JavaRuntimeVersion.isJava15OrLater()) {
			resolvesTo("try { return 'literal' as Object as Boolean } catch(ClassCastException e) {'caught'}", "Serializable & Comparable<?> & Constable");
		} else {
			resolvesTo("try { return 'literal' as Object as Boolean } catch(ClassCastException e) {'caught'}", "Serializable & Comparable<?>");
		}
	}

	@Test
	@Override
	public void testTryCatchFinallyExpression_21() throws Exception {
		// @formatter:off
		if (JavaRuntimeVersion.isJava15OrLater()) {
			resolvesTo(
					"try return 'literal' as Object as Boolean\n" +
							"catch(NullPointerException e) 'second thing is thrown'\n" +
							"catch(ClassCastException e) throw new NullPointerException()",
					"Serializable & Comparable<?> & Constable");
		} else {
			resolvesTo(
					"try return 'literal' as Object as Boolean\n" +
							"catch(NullPointerException e) 'second thing is thrown'\n" +
							"catch(ClassCastException e) throw new NullPointerException()",
					"Serializable & Comparable<?>");
		}
		// @formatter:on
	}

	@Test
	@Override
	public void testTryCatchFinallyExpression_22() throws Exception {
		// @formatter:off
		if (JavaRuntimeVersion.isJava15OrLater()) {
			resolvesTo(
					"try return 'literal' as Object as Boolean\n" +
							"catch(ClassCastException e) throw new NullPointerException()\n" +
							"catch(NullPointerException e) 'dont catch subsequent exceptions'",
					"Serializable & Comparable<?> & Constable");
		} else {
			resolvesTo(
					"try return 'literal' as Object as Boolean\n" +
							"catch(ClassCastException e) throw new NullPointerException()\n" +
							"catch(NullPointerException e) 'dont catch subsequent exceptions'",
					"Serializable & Comparable<?>");
		}
		// @formatter:on
	}

	@Test
	@Override
	public void testTryCatchFinallyExpression_25() throws Exception {
		if (JavaRuntimeVersion.isJava15OrLater()) {
			resolvesTo("try true catch (Exception e) return 'bar' catch(RuntimeException e) return 'baz'", "Serializable & Comparable<?> & Constable");
		} else {
			resolvesTo("try true catch (Exception e) return 'bar' catch(RuntimeException e) return 'baz'", "Serializable & Comparable<?>");
		}
	}

	@Test
	@Override
	public void testTryCatchFinallyExpression_26() throws Exception {
		if (JavaRuntimeVersion.isJava15OrLater()) {
			resolvesTo("try 'foo' catch (Exception e) 'bar' catch(RuntimeException e) return true finally true",
					"Serializable & Comparable<?> & Constable");
		} else {
			resolvesTo("try 'foo' catch (Exception e) 'bar' catch(RuntimeException e) return true finally true",
					"Serializable & Comparable<?>");
		}
	}

	@Test
	@Override
	public void testTryCatchFinallyExpression_27() throws Exception {
		if (JavaRuntimeVersion.isJava15OrLater()) {
			resolvesTo("try { 'literal' as Object as Boolean } catch(ClassCastException e) return 'caught'", "Serializable & Comparable<?> & Constable");
		} else {
			resolvesTo("try { 'literal' as Object as Boolean } catch(ClassCastException e) return 'caught'", "Serializable & Comparable<?>");
		}
	}

	@Test
	@Override
	public void testTryCatchFinallyExpression_28() throws Exception {
		if (JavaRuntimeVersion.isJava15OrLater()) {
			resolvesTo("try { 'literal' as Object as Boolean } catch(ClassCastException e) {return 'caught'}", "Serializable & Comparable<?> & Constable");
		} else {
			resolvesTo("try { 'literal' as Object as Boolean } catch(ClassCastException e) {return 'caught'}", "Serializable & Comparable<?>");
		}
	}

	@Test
	@Override
	public void testTryCatchFinallyExpression_29() throws Exception {
		// @formatter:off
		if (JavaRuntimeVersion.isJava15OrLater()) {
			resolvesTo(
					"try 'literal' as Object as Boolean\n" +
							"catch(NullPointerException e) return 'second thing is thrown'\n" +
							"catch(ClassCastException e) throw new NullPointerException()",
					"Serializable & Comparable<?> & Constable");
		} else {
			resolvesTo(
					"try 'literal' as Object as Boolean\n" +
							"catch(NullPointerException e) return 'second thing is thrown'\n" +
							"catch(ClassCastException e) throw new NullPointerException()",
					"Serializable & Comparable<?>");
		}
		// @formatter:on
	}

	@Test
	@Override
	public void testTryCatchFinallyExpression_30() throws Exception {
		// @formatter:off
		if (JavaRuntimeVersion.isJava15OrLater()) {
			resolvesTo(
					"try 'literal' as Object as Boolean\n" +
							"catch(ClassCastException e) throw new NullPointerException()\n" +
							"catch(NullPointerException e) return 'dont catch subsequent exceptions'",
					"Serializable & Comparable<?> & Constable");
		} else {
			resolvesTo(
					"try 'literal' as Object as Boolean\n" +
							"catch(ClassCastException e) throw new NullPointerException()\n" +
							"catch(NullPointerException e) return 'dont catch subsequent exceptions'",
					"Serializable & Comparable<?>");
		}
		// @formatter:on
	}

	@Test
	@Override
	public void testTryCatchFinallyExpression_31() throws Exception {
		// @formatter:off
		resolvesTo(
				"try 'literal' as Object as Boolean\n" +
				"catch(ClassCastException e) return null as Number\n" +
				"catch(NullPointerException e) return 'dont catch subsequent exceptions'",
				"Serializable");
		// @formatter:on
	}

	@Test
	public void testThrowExpressionAfterLoop_01() throws Exception {
		// @formatter:off
		resolvesTo(
				"{\n" +
				"	while(true) ''.toString\n" +
				"		throw new RuntimeException()\n" +
				"}", "void");
		// @formatter:on
	}

	@Test
	public void testThrowExpressionAfterLoop_02() throws Exception {
		// @formatter:off
		resolvesTo(
				"{\n" +
				"	while(true) return 1\n" +
				"	throw new RuntimeException()\n" +
				"}", "int");
		// @formatter:on
	}

	@Test
	public void testThrowExpressionAfterLoop_03() throws Exception {
		// @formatter:off
		resolvesTo(
				"{\n" +
				"	while(true) if (true) return 1 else ''\n" +
				"	throw new RuntimeException()\n" +
				"}", "int");
		// @formatter:on
	}

	@Test
	@Override
	public void testBlockExpression_09() throws Exception {
		resolvesTo("{val Object x = if (false) return; x }", "void");
	}

	@Test
	@Override
	public void testBlockExpression_10() throws Exception {
		resolvesTo("{ ( if (true) {val Object x = if (false) return; x } ) }", "void");
	}

	@Test
	@Override
	public void testBlockExpression_11() throws Exception {
		resolvesTo("{ ( if (true) {val Object x = if (false) return; x } ) {val Object x = if (false) return; x } }", "void");
	}

	@Test
	@Override
	public void testBlockExpression_12() throws Exception {
		resolvesTo("{ ( if (true) if (true) return else null ) { if (true) return else null } }", "void");
	}
}
