package com.nut;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Unittestall {
	private MathBasic test;

	@BeforeEach
	void setUp() throws Exception {
		test = new MathBasic();
	}

	@AfterEach
	void tearDown() throws Exception {
		test = null;
	}

	@Test
	void addtestJ() {
		int result = test.add(3,4);
		assertEquals(7, result);
	}
	@Test
	void subtrtestJ() {
		int result = test.subtract(4,3);
		assertEquals(1, result);
	}
	@Test
	void divitestJ() {
		double result = test.divide(4,0);
		assertEquals(-1.0, result);
	}
	@Test
	void multtestJ() {
		int result = test.multiply(3,4);
		assertEquals(12, result);
	}
	@Test
	void divitest1J1() {
		double result = test.divide(4,2);
		assertEquals(2.0, result);
	}

}
