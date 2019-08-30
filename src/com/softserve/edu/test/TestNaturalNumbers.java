package com.softserve.edu.test;

import org.junit.Assert;
import org.junit.Test;
import com.softserve.edu.NaturalNumbers;

/**
 * Class for testing another class - NaturalNumber.java
 * 
 * @author Yurii Khilchenko
 * @version 1.0
 */
public class TestNaturalNumbers {

	/** Test-method for testing method addNewNumber */
	@Test 
	public void testAddNewNumber() {
		NaturalNumbers numbers = new NaturalNumbers();
		numbers.addNewNumber(1);
		int trueresult = 1;
		int actual = numbers.getArray().get(0);
		Assert.assertEquals(trueresult, actual);
	}
	/** Test-method for testing method taskG */
	@Test
	public void testTaskG() {
		NaturalNumbers Testvar = new NaturalNumbers();
		Testvar.addNewNumber(1);
		Testvar.addNewNumber(1);
		Testvar.addNewNumber(1);
		Testvar.setN();
		int trueresult = 0;
		Assert.assertEquals(trueresult, Testvar.taskG());
	}

	/** Test-method for testing method taskD */
	@Test
	public void testTaskD() {
		NaturalNumbers Testvar = new NaturalNumbers();
		Testvar.addNewNumber(1);
		Testvar.addNewNumber(3);
		Testvar.addNewNumber(2);
		Testvar.setN();
		int trueresult = 0;
		Assert.assertEquals(trueresult, Testvar.taskD());
	}

	/** Positive Test-method for testing method factorial */
	@Test
	public void testFactorialPos() {
		NaturalNumbers varforfact = new NaturalNumbers();
		int trueresult = 6;
		Assert.assertEquals(trueresult, varforfact.factorial(3));
	}
	
	/** Negative Test-method for testing method factorial */
	@Test(expected = IllegalArgumentException.class)
	public void testFactorialNeg() {
		NaturalNumbers varforfact = new NaturalNumbers();
		varforfact.factorial(-3);
	}

}
