package com.softserve.edu;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for creating and work with PascalTriangle
 * 
 * @author Yurii Khilchenko
 * @version 1.0
 */
public class PascalTriangle implements ShowMaker {

	/** @param n - size-variable for triangle */
	private int n;

	/**
	 * @param triangle - variable for save values of Pascal triangle
	 */
	private List<ArrayList<Integer>> triangle;

	/** Common constructor with triangle initialization */
	public PascalTriangle() {
		this.triangle = new ArrayList<ArrayList<Integer>>();
	}

	/** Common constructor with triangle and n initialization */
	public PascalTriangle(int n) {
		if (n <= 0) {
			throw new IllegalArgumentException(
					"n <= 0 in PascalTriangle constructor!!!");
		} else {
			this.n = n;
			this.triangle = new ArrayList<ArrayList<Integer>>(n);
			while (n > 0) {
				triangle.add(new ArrayList<Integer>());
				n--;
			}
		}
	}

	/** Method what return triangle */
	public List<ArrayList<Integer>> getTriangle() {
		return this.triangle;
	}

	/** Method what calculate C for Newton binom */
	public int calculateC(int k, int n) {
		if (n < 0 || k < 0 || n < k) {
			throw new IllegalArgumentException(
					"n < 0 or k < 0 in calculateC method!!!");
		} else {
			NaturalNumbers varForFact = new NaturalNumbers();
			return varForFact.factorial(n)
					/ ((varForFact.factorial(k))
							* varForFact.factorial(n - k));
		}
	}

	/** Method what adding new number in triangle */
	public void addNewNumber(int index, int number) {
		if (index < 0) {
			throw new IllegalArgumentException(
					"n < 0 in addNewNumber method!!!");
		} else {
			triangle.get(index).add(number);
		}
	}

	/** Method what make Pascal triangle with n-size */
	public void triangleMaker() {
		for (int i = 0; i < this.n; i++) {
			for (int j = 0; j <= i; j++) {
				addNewNumber(i, calculateC(j, i));
			}
		}
	}

	/** Method what show Pascal triangle in console */
	public void showWork() {
		String str = "";
		for (int i = 0; i <= this.n - 1; i++) {
			for (int j = 0; j <= (triangle.get(i).size() - 1); j++) {
				str += triangle.get(i).get(j) + " ";
			}
			System.out.println(str);
			str = "";
		}
	}

	/** Override method equals for PascalTriangle objects */
	@Override
	public boolean equals(Object obj) {
		boolean flag = true;
		// Check-null and equals class for object
		if ((obj == null) || (obj.getClass() != this.getClass())) {
			return false;
		} else {
			PascalTriangle ptObj = (PascalTriangle) obj;
			// Check size equals
			if (this.triangle.size() != ptObj.triangle.size()) {
				return false;

			} else {
				for (int i = 0; (i < this.n - 1)
						|| (flag == false); i++) {
					for (int j = 0; (j <= (this.triangle.get(i).size()
							- 1)); j++) {
						// Check size equals for inner lists
						if (this.triangle.get(i)
								.size() != ptObj.triangle.get(i)
										.size()) {
							return false;
							// Check equals for inner values
						} else if (this.triangle.get(i).get(
								j) != ptObj.triangle.get(i).get(j)) {
							return false;
						}
					}
				}
			}
		}
		return true;
	}
}