package com.rishi.conditionalstmts;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {

		String firstName = "Rushikesh";
		String lastName = "Bhandekar";
		String fullName = "Rushikesh Bhandekar";

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();

		if (num % 5 == 0 && num % 7 == 0) {
			System.out.println(fullName);
		} else if (num % 5 == 0) {
			System.out.println(firstName);
		} else if (num % 7 == 0) {
			System.out.println(lastName);
		}

	}

}
