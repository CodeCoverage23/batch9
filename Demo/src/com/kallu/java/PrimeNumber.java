package com.kallu.java;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);

		System.out.println("Please enter the number to print the seriese of prime number");
		int number=sc.nextInt();
		if(number>1)
		{
			for( int i=2;i<=number;i++)
			{
				int count=0;
				for(int j=1;j<=i;j++) {
					if(i%j==0) {
						count++;

					}

				}
				if(count==2) {

				System.out.println(i+" ");
				}
			}
		}
			else
			{
		    System.out.println("Please enter valid number to print prime number seriese ");

			}	
	}

}
