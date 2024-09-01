package com.rishi.assignments.Assigment_5_5;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		int num;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println(num + " is even number");
		} else {
			System.out.println(num + " is odd number");
		}

	}

}
