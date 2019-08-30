package com.softserve.edu.test;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.softserve.edu.PascalTriangle;

/**
 * Class for testing negative values for calculateC-method in
 * NaturalNumber.java
 * 
 * @author Yurii Khilchenko
 * @version 1.0
 */
@RunWith(Parameterized.class)
public class TestCalculateC {
	/** Parameters what we give to test-method */
	@Parameterized.Parameters(name = "{index}: k = {0};  n = {1}")
	public static Iterable<Object[]> data() {
		return Arrays.asList(
				new Object[][] { { -1, 2 }, { 1, -2 }, { 2, 1 } });
	}

	/** @param testN - variable for n argument */
	private int testN;

	/** @param testK - variable for k argument */
	private int testK;

	/** Constructor that take values for test-method */
	public TestCalculateC(int testK, int testN) {
		this.testK = testK;
		this.testN = testN;
	}

	/**
	 * Test-method for testing negative value for calculateC-method
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testCalculateC() {
		PascalTriangle triangle = new PascalTriangle();
		triangle.calculateC(testK, testN);
	}
}
