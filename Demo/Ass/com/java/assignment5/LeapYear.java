package com.java.assignment5;

//Write a program to check whether year is leap year or not. (If else stmt).

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check whether leap or not : ");

		int a = sc.nextInt();

		if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
			System.out.println("The given year is a leap year");
		} else {
			System.out.println("The given year is not a leap year");
		}
	}

}
