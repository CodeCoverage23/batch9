package com.basic.task;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first value");
		int a = sc.nextInt();
		System.out.println("Enter the second value");
		int b = sc.nextInt();

		Calculator c = new Calculator();
		int addition = c.addition(a, b);
		System.out.println(addition);

	}

	public int addition(int a, int b) {
		return a + b;
	}

}
