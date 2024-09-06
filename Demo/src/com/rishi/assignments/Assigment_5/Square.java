package com.rishi.assignments.Assigment_5_7;

import java.util.Scanner;

public class Square {

	public void square(int num) {
		int square = num * num;
		System.out.println("Square of number is : " + square);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();

		Square s = new Square();
		s.square(n);

	}

}
