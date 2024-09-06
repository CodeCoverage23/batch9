package com.rishi.assignments.Assigment_5;

import java.util.Scanner;

public class PositiveNegative {

	public void validate(int num) {
		if (num > 0) {
			System.out.println("Number is Positive");
		} else if (num < 0) {
			System.out.println("Number is Negative");
		} else {
			System.out.println("Number is Zero");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();

		PositiveNegative o = new PositiveNegative();
		o.validate(n);

	}

}
