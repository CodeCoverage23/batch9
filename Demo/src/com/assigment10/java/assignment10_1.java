package com.assigment10.java;

import java.util.Scanner;

public class assignment10_1 {
	
	//WAP check whether number is prime or not.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		 System.out.println("please enter a number to check prime or not >>");
		 int number = sc.nextInt();
		 int count=0;
		
		if(number>1) {
			for(int i=1;i<=number;i++) {
				
				if(number%i==0) {
					
					count++;
				}
				}
				if(count==2) {
					
					System.out.println("the given number is prime number");
				}
				else {
					
					System.out.println("the given number is not a prime number");
				}
				
			}
		else {
			
			System.out.println("number is invalid to check prime number");
			
		}
	}

}
