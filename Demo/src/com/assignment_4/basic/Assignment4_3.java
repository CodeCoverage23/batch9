package com.assignment_4.basic;

public class Assignment4_3 {
	
	
	//Method to multiplication two numbers
	
		public static int multi(int a, int b) {
			return a*b;
		}

		public static void main(String[] args) {
			
			//Variable to hold the numbers
			
			int num1 = 36;
			int num2 = 20;
			
			//Calling the multi method and storing the result
			
			int result = multi(num1, num2);
			
			System.out.println("The Multiplicatin of: " + num1 + " * " + num2 + " = " + result);
			
		}	
			

}
