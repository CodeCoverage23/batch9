package com.rishi.basics;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		int count = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int num = sc.nextInt();

		if (num > 1) {

			for (int i = 1; i <= num; i++) {

				if (num % i == 0) {
					count++;
				}
			}

			if (count == 2) {
				System.out.println("The number is prime..");
			} else {
				System.out.println("The number is not prime..");
			}
		} else {
			System.out.println("Enter a valid number to check!");
		}
	}

}
