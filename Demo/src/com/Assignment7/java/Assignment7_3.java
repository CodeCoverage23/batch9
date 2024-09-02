package com.Assignment7.java;

public class Assignment7_3 {
	
	//WAP to print factors of given number

	public static void main(String[] args) {
	
		int number = 6;
		
		System.out.print("Factors of " + number + " are: ");
		
		for (int i = 1; i <= number; ++i) {
			
			if (number % i == 0) {
		        System.out.print(i + " ");
			}

		}

	}
}
