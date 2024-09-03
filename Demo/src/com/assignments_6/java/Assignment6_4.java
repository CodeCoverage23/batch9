package com.assignments_6.java;

import java.util.Scanner;

/*
 * design method int factorial(int no)
 * which returns int value to that method
 * print the result into main method
 */

public class Assignment6_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		sc.close();
		
		int result = factorial(num);
		System.out.println("The factorial of " + num + " is " + result);
	}
	public static int factorial(int no) {
		int result = 1;
		for(int i = 1; i <= no; i++) {
			result = result * i;
		}
		return result;
				
	}

}
