package com.basic;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int data = sc.nextInt();

		if (data % 2 == 0) {
			System.out.println("The number is even");

		} else {
			System.out.println("The number is odd");
		}

	}

}
