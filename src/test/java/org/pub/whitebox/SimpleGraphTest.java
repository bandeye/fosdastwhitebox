package org.pub.whitebox;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SimpleGraphTest {

	@Test
	public void test() {
		assertEquals(5, SimpleGraph.simpleFunction(5, 2, 3));
	}

	@Test
	public void test354() {
		assertEquals(5, SimpleGraph.simpleFunction(354, 5, 3));
	}

	@Test
	public void test3() {
		assertEquals(3, SimpleGraph.simpleFunction(354, 2, 3));
	}

}
