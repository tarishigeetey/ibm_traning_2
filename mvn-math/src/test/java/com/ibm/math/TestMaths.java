package com.ibm.math;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestMaths {
	
	private static Maths maths;
	
	@BeforeAll
	public static void setup() {
		maths = new Maths();
	}
	
	@Test
	public void testAdd() {
		assertEquals(10, maths.sum(5,5));
	}
	
	@Test
	public void testSub() {
		assertEquals(10, maths.subs(15,5));
	}
	
	@Test
	public void testDiv() {
		assertEquals(10, maths.div(10,1));
	}
	
	@Test
	public void testZeroDiv() {
		assertThrows(ArithmeticException.class, () -> maths.div(2, 0));
	}
	
	@Test
	public void testSquare() {
		assertEquals(25, maths.square(5));
	}
	
	@Test
	public void testIncorrectSquare() {
		assertNotEquals(10, maths.square(3));
	}
}
