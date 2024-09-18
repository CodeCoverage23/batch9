package com.java.assignment5;

//Write a program to check whether number is even or odd.

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check even or odd : ");

		int i = sc.nextInt();

		if (i > 0) {

			if (i % 2 == 0) {
				System.out.println("The given number is even number");
			}

			else {
				System.out.println("The given number is odd number");
			}
		} else {
			System.out.println("Invalid number");
		}
	}

}
