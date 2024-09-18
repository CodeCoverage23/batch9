package com.java.assignment5;

//Write a program to swap the two numbers.

public class Swap {

	public static void main(String[] args) {

		// without using third variable

		int a = 30;
		int b = 12;

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("The number after swapping - ");
		System.out.println("a :" + a + " & b :" + b);
	}

}
