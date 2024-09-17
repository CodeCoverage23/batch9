package com.Assignment10;
//1. Write Java program to check whether number is prime or not. ( Prime means a number which is
//divisible by only two numbers: 1 and itself. So, if any number is divisible by any other number, it is not a
//prime number.)
import java.util.Scanner;

public class PrimeNo {
	public static void isPrime(int n) {
		if(n==0||n==1) {
			System.out.println(n+" is not a prime number");
		}
		else {int flag=0;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				flag=1;
			}
		}
		if(flag==0) {
			System.out.println(n+" is a prime number ");
		}
		else {
			System.out.println(n+ " is not a prime number ");
		}
		
	}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		isPrime(n);
		

	}

}
