package com.java.assignment4;

//  Write the java program to design method for division of two number which returns int value
// to that method and result should be print into main method.

public class MethodForDivision {

	public static void main(String[] args) {

		MethodForDivision d = new MethodForDivision();
		int a = d.div(80, 10);

		System.out.println(a);

	}

	public int div(int x, int y) {
		return x / y;

	}

}
