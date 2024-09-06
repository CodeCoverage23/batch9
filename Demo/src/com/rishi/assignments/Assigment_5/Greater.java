package com.rishi.assignments.Assigment_5_6;

import java.util.Scanner;

public class Greater {

	public void max(int num) {
		if (num > 100) {
			System.out.println(num + " is greater than 100");
		} else if (num < 100) {
			System.out.println(num + " is less than 100");
		} else {
			System.out.println("It's 100!!");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();

		Greater g = new Greater();
		g.max(n);

	}

}
