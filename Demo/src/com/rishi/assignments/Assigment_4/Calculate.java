package com.rishi.assignments.Assigment_4;

import java.util.Scanner;

public class Calculate {

	public int add(int num1, int num2) {
		return num1 + num2;
	}

	public int sub(int num1, int num2) {
		return num1 - num2;
	}

	public int mul(int num1, int num2) {
		return num1 * num2;
	}

	public int div(int num1, int num2) {
		return num1 / num2;
	}

	public static void main(String[] args) {

		int num1, num2;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two numbers :");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		Calculate c = new Calculate();
		int res = c.add(num1, num2);
		System.out.println("Addition is :" + res);

		int res2 = c.sub(num1, num2);
		System.out.println("Substraction is :" + res2);

		int res3 = c.mul(num1, num2);
		System.out.println("Multiplication is :" + res3);

		int res4 = c.div(num1, num2);
		System.out.println("Division is :" + res4);

	}

}
