package com.assignment_4.basic;

public class Assignment4_4 {
	
	//Method to division two numbers
	
		public static int div(int a, int b) {
			return a/b;
		}

		public static void main(String[] args) {
			
			//Variable to hold the numbers
			
			int num1 = 60;
			int num2 = 20;
			
			//Calling the div method and storing the result
			
			int result = div(num1, num2);
			
			System.out.println("The division of: " + num1 + " / " + num2 + " = " + result);
			
			
		}

}
