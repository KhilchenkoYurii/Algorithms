package com.softserve.edu;

/**
 * Class Main for checks work PascalTriangle.java and NaturalNumber
 * 
 * @author Yurii Khilchenko
 * @version 1.0
 */
public class Main {

	/** Main method */
	public static void main(String[] args) {
		int triangleSize = 10;
		PascalTriangle ptVar = new PascalTriangle(triangleSize);
		/*
		 * ptVar.triangleMaker(); ptVar.showWork(); int arraySize = 100; NaturalNumbers
		 * array = new NaturalNumbers(arraySize); array.showWork();
		 */
		ptVar.addNewNumber(0, 1);
	}
}
