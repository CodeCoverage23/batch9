package com.java.assignment4;

// Write the java program to design method for subtraction of two number which returns int value
// to that method and result should be print into main method.

public class MethodForSubstraction {

	public static void main(String[] args) {

		MethodForSubstraction s = new MethodForSubstraction();
		int a = s.sub(99, 71);

		System.out.println(a);

	}

	public int sub(int x, int y) {
		return x - y;

	}

}
