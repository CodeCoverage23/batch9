package com.assignment5.java;

import java.util.Scanner;

public class Assignment5_6 {
	
	//Check the number is greater than 100

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		sc.close();
		
		if(num > 100) {
			System.out.println("The number is greater than 100");
		}
		else {
			System.out.println("The number is not greater than 100");
		}
		
		
	}

}