package com.assignment_4.basic;

public class Assignment4_2 {
	
	

	//Method to substraction two numbers
	
		public static int sub(int a, int b) {
			return a-b;
		}

		public static void main(String[] args) {
			
			//Variable to hold the numbers
			
			int num1 = 100;
			int num2 = 20;
			
			//Calling the sub method and storing the result
			
			int result = sub(num1, num2);
			
			System.out.println("The substraction of: " + num1 + " - " + num2 + " = " + result);
			
			
			
	}

}
