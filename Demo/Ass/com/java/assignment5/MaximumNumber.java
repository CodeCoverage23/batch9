package com.java.assignment5;

// Write a program to find out maximum number among three number(if else if ladder statement).

public class MaximumNumber {

	public static void main(String[] args) {

		int a = 70;
		int b = 91;
		int c = 26;

		if (a > b && a > c) {
			System.out.println("The maximum number among three number is : " + a);

		} else if (b > a && b > c) {

			System.out.println("The maximum number among three number is : " + b);

		} else if (c > a && c > b) {

			System.out.println("The maximum number among three number is : " + c);

		} else {
			System.out.println("the given number is invalid");
		}

	}
}
