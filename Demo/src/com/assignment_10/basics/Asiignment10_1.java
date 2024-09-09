package com.assignment_10.basics;

import java.util.Scanner;

/*1. Write Java program to check whether number is prime or not. ( Prime means a number which is
 *divisible by only two numbers: 1 and itself. So, if any number is divisible by any other number, 
 *it is not a prime number) 
 * 
 */


public class Asiignment10_1 {
	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
		
		System.out.print("Please enter the number:");
		int number=sc.nextInt();
		sc.close();
		if(isPrime(number)) {
			System.out.println(" This number is prime.");
		}else { 
			System.out.println(" This number is not prime.");
		}
	}
	
		public static boolean isPrime(int number) {
			if(number <= 1) {
				return false;
			}
		
			for( int i=2;i<=number / 2;i++)
			{
				if(number % i == 0) {
					return false;
				
					}
						
				}
			return true;
			
			}
		
			
	}

	


