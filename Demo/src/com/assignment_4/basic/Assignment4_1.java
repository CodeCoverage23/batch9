package com.assignment_4.basic;

public class Assignment4_1 {
	
	//Method to add two numbers
	
	public static int add(int a, int b) {
		return a+b;
	}

	public static void main(String[] args) {
		
		//Variable to hold the numbers
		
		int num1 = 10;
		int num2 = 20;
		
		//Calling the add method and storing the result
		
		int result = add(num1, num2);
		
		System.out.println("The Addition of: " + num1 + " + " + num2 + " = " + result);
		
		
		
		}
}
