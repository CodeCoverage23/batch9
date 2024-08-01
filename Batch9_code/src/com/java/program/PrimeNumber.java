package com.java.program;

import java.util.Scanner;

//prime number are those numbers which is divisible 1 and itself.
// WAP to check the given is prime or not

public class PrimeNumber {

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
