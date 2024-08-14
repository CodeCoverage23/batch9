package com.pallavi.basics;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Simple Calculator");
		System.out.println("1. Addition");
		System.out.println("2. subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		System.out.println("Enter your choice (1-4):  ");
		int choice = sc.nextInt();
		System.out.println("Enter first number: ");
		double num1 = sc.nextDouble();
		System.out.println("Enter second number: ");
		double num2 = sc.nextDouble();
		switch (choice) {
		case 1:
			System.out.println("Result: " + add(num1, num2));
			break;
		case 2:
			System.out.println("Result:" + subtract(num1, num2) );
			break;
		case 3:
			System.out.println("Result:" + multiply(num1, num2) );
			break;
		case 4:
			if(num2 != 0)
			{
			System.out.println("Result:" + divide(num1, num2) );
			}
			else {
				System.out.println("Error:  Cannot divided");
			
			}
			break;
			default:
				System.out.println("Invalid choice");
		}
		sc.close();
	}
	public static double add(double num1, double num2) {
		return num1 + num2;
	}
	public static double  subtract( double num1, double num2) {
		return num1 - num2;
	}
	public static double multiply(double num1, double num2) {
		return num1 * num2;
	}
	public static double divide(double num1, double num2) {
		return num1 / num2;
	}
	
}	
		
		
		
				
		
		
		

	


