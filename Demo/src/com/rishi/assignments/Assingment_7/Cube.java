package com.rishi.assignments.Assingment_7;

import java.util.Scanner;

public class Cube {

	public static int getNumberCube(int num) {
		int cube = num * num * num;
		return cube;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();

		int result = getNumberCube(n);
		System.out.println("Cube of " + n + " is " + result);

	}

}
