package com.java.program;

import java.util.Scanner;

//Wap to print a prime number Series for a given number

public class PrimeNumberSeries {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 System.out.println("please enter a number to print the series of prime number>>");
		 int number = sc.nextInt();
		if(number>1) {
			
			for(int i=2;i<=number;i++) {
				 int count=0;
			for(int j=1;j<=i;j++) {
				
				if(i%j==0) {
					
					count++;
				}
				}
				if(count==2) {
					
					System.out.print(i+" ");
				}
		
			
			}

	}else {
		System.out.println("please enter a valid number to print prime number series");
	}
}
}