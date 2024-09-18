package com.java.assignment2;

// Write the java program to print the global variable value as 25.

public class PrintGlobalVariable {

	int a = 25;

	public static void main(String[] args) {

		DeclareGlobalVariable obj = new DeclareGlobalVariable();

		obj.y = 25;

		System.out.println(obj.y);

	}

}
