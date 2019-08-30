/*
 * @(#)NaturalNumbers.java 1.0 30/07/2019 
 */
package com.softserve.edu;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Class with all what need to do in algorithmic task
 * 
 * @version 1.0
 * @author Yurii Khilchenko
 * 
 */
public class NaturalNumbers implements ShowMaker {

	/** n - size of List<Integer> array */
	private int n;

	/** array - List<Integer> for save number */
	private List<Integer> array = new ArrayList<Integer>();

	/** Common empty constructor for this class */
	public NaturalNumbers() {
	}

	/**
	 * Constructor with parameters Initialization size of array - n and filling the
	 * array with random values
	 */
	public NaturalNumbers(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("n < 0!!!");
		} else {
			this.n = n;
			for (int i = 0; i < n; i++) {
				Random rnd = new Random();
				array.add(rnd.nextInt(n + 1));
			}
		}
	}

	/** Method for adding new number to array */
	public void addNewNumber(int number) {
		array.add(number);
	}

	/** Method for set value size of array */
	public void setN() {
		this.n = array.size();
	}
	
	/** Method for get value size of array */
	public List<Integer> getArray() {
		return this.array;
	}

	/** Method what calculate factorial */
	public int factorial(int n) {
		if (n < 0) {
			throw new IllegalArgumentException(
					"n < 0 int factorial method!!!");
		} else {
			int result = 1;
			for (int i = 1; i <= n; i++) {
				result *= i;
			}
			return result;
		}
	}

	/** Method what calculate result for task G */
	public int taskG() {
		int result = 0;
		for (int i = 1; i < (n - 1); i++) {
			if (array.get(i) < ((array.get(i - 1) + array.get(i + 1))
					/ 2)) {
				result++;
			}
		}
		return result;
	}

	/** Method what calculate result for task D */
	public int taskD() {
		int result = 0;
		for (int i = 1; i <= (n - 1); i++) {
			if ((array.get(i) < factorial(i))
					&& (array.get(i) > Math.pow(2, i))) {
				result++;
			}
		}
		return result;
	}

	/** Override method for show work result */
	@Override
	public void showWork() {
		System.out.println("Result for task 178 g wiht 10 elements= "
				+ this.taskG());
		System.out.println("Result for task 178 d wiht 10 elements= "
				+ this.taskD());
	}
}
