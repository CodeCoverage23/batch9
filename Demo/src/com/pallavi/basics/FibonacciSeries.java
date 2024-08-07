package com.pallavi.basics;

import java.util.Scanner;
public class FibonacciSeries {
	public static void main(String[] args) {
		
		int n , a=0, b=0, temp=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any  number : ");
		n = sc.nextInt();
		System.out.println("Fibonacci Series : ");
		for( int i=1; i<=n ; i++)
		{
			a=b;
			b=temp;
			temp=a+b;
			System.out.print(a + " ");
			
		
			
			
				
		}
		
		
		

	
		
	}

	
		
		
	}


