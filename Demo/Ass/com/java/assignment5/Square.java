package com.java.assignment5;

//Write the program to print the square of any number.

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");

		int a = sc.nextInt();

		int b = (int) Math.pow(a, 2);
		System.out.println("Square = " + b);

	}
}
