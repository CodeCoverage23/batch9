package com.assignment_5.java;

import java.util.Scanner;

  // Check the number is even or odd
public class Assignment5_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		sc.close();
		
		if(num % 2 == 0) {
			System.out.println("The number is even");
		}
		else {
			System.out.println("The number is odd");
		}
		
	}

}
