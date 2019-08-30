package com.softserve.edu.test;

import org.junit.Assert;
import org.junit.Test;
import com.softserve.edu.PascalTriangle;

/**
 * Class for testing another class PascalTriangle.java
 * 
 * @author Yurii Khilchenko
 * @version 1.0
 */
public class TestPascalTriangle {

	/** Test-method for testing method calculateC (positive) */
	@Test
	public void testClaculateCPos() {
		PascalTriangle triangle = new PascalTriangle();
		int trueResult = 3;
		Assert.assertEquals(trueResult, triangle.calculateC(2, 3));

	}
	
	/** Negative Test-method for testing method addNewNumber */
	@Test(expected = IllegalArgumentException.class)
	public void testAddNewNumberNeg() {
		PascalTriangle triangle = new PascalTriangle();
		triangle.addNewNumber(-1, 1);
	}

	/** Positive Test-method for testing method addNewNumber */
	@Test
	public void testAddNewNumberPos() {
		PascalTriangle triangle = new PascalTriangle(1);
		triangle.addNewNumber(0, -2);
		int trueResult = -2;
		int actualResult = triangle.getTriangle().get(0).get(0);
		Assert.assertEquals(actualResult, trueResult);

	}

	/** Test-method for testing method triangleMaker */
	@Test
	public void testTriangleMaker() {
		int triangleSize = 3;
		PascalTriangle triangle = new PascalTriangle(triangleSize);
		triangle.triangleMaker();
		PascalTriangle trueTriangle = new PascalTriangle(
				triangleSize);
		trueTriangle.addNewNumber(0, 1);
		trueTriangle.addNewNumber(1, 1);
		trueTriangle.addNewNumber(1, 1);
		trueTriangle.addNewNumber(2, 1);
		trueTriangle.addNewNumber(2, 2);
		trueTriangle.addNewNumber(2, 1);
		boolean actualResult = triangle.equals(trueTriangle);
		boolean expectedResult = true;
		Assert.assertEquals(expectedResult, actualResult);
	}
}
