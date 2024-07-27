package com.basic;

import java.util.Scanner;

public class IfElseIfDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = sc.nextInt();

		if (number == 0) {
			System.out.println("The number is ZERO");
		} else if (number > 0) {
			System.out.println("The number is POSITIVE");
		} else {
			System.out.println("The number is NEGATIVE");
		}

	}

}
