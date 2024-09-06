package com.rishi.assignments.Assingment_7;

import java.util.Scanner;

public class ReverseNum {

	public static int getReverseNumber(int number) {
		int rev = 0;

		while (number != 0) {
			rev = rev * 10 + number % 10;
			number = number / 10;
		}
		return rev;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();

		int res = getReverseNumber(num);
		System.out.println("Reverse of " + num + " is " + res);
	}

}
