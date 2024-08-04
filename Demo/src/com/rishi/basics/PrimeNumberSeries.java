package com.rishi.basics;

import java.util.Scanner;

public class PrimeNumberSeries {

	public static void main(String[] args) {

		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to print the series of prime number upto it..");
		int num = sc.nextInt();

		if (num > 1) {
			for (int i = 2; i <= num; i++) {
				int count = 0;
				
				for (int j = 1; j <= i; j++) {
					if (i % j == 0) {
						count++;
					}
				}
				if (count == 2) {
					System.out.print(i + " ");
				}
			}
		} else {
			System.out.println("Enter a vaild number..");
		}
	}

}
