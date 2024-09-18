package com.java.assignment6;

// Write a program  to print all even number from 50 to 75.

public class EvenNumbers {

	public static void main(String[] args) {

		int a = 75;
		System.out.print("Even numbers from 50 to " + a + ": ");

		for (int i = 50; i <= a; i++) {

			if (i % 2 == 0) {
				System.out.print(i + " ");
			}

		}
	}
}
