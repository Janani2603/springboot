package com.test.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCalc {

	@Test
	void testAdd() {
		Calculator calc=new Calculator();
		int expected=10+20;
		int result=calc.add(10, 20);
		//assertEquals(expected, result);
		boolean res=(result==expected);
		assertTrue(res);
	}

}
