package com.rishi.assignments.Assignment_6;

import java.util.Scanner;

public class Factorial {

	public static int factorial(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("Number must be positive");
		}

		int res=1;
		for (int i = 1; i <= n; i++) {
			res = res * i;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();

		int result = factorial(num);
		System.out.println("Factorial of " + num + " is " + result);

	}

}
