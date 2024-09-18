package com.java.assignment4;

//Write the java program to design method for addition of two number which returns int results 
// to that method and result should be print into main method.

public class MethodForAddition {

	public static void main(String[] args) {

		MethodForAddition a = new MethodForAddition();
		int m = a.add(54, 98);

		System.out.println(m);

	}

	public int add(int x, int y) {
		return x + y;
	}
}
