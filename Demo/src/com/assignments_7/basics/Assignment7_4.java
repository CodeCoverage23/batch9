package com.assignments_7.basics;

import java.util.Scanner;

/*
 *  Design method public int getReverseNumber(int num)
 *  which return int value to that method and result print into main method.

 */

public class Assignment7_4 {
	
	//method to calculate the reverse number
	public int getReverseNumber(int num) {
		int rev = 0;
		while(num != 0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num /= 10;
		}
		return rev;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Assignment7_4 assig = new Assignment7_4();
		
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		
		int result = assig.getReverseNumber(number);
		System.out.println("The reverse of " + number + " is: " + result);
		
		 sc.close();
		
		
	}

}
