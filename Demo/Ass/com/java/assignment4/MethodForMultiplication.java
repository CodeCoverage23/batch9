package com.java.assignment4;

// Write the java program to design method for multiplication of two number which returns int value
// to that method and result should be print into main method.

public class MethodForMultiplication {

	public static void main(String[] args) {

		MethodForMultiplication m = new MethodForMultiplication();
		int a = m.mul(52, 7);

		System.out.println(a);

	}

	public int mul(int x, int y) {
		return x * y;

	}

}
