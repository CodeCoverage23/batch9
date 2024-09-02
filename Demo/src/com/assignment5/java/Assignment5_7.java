package com.assignment5.java;

import java.util.Scanner;

public class Assignment5_7 {

	//WAP to print the square of any number.
		
		public  int sqrnum(int num) {
			int res=num*num;
			return res;
		}
		public static void main(String args[]) 
		{
			
			Scanner s= new Scanner(System.in);
			
			System.out.println("Enter the number : " );
			int num= s.nextInt();
			
			Assignment5_7 a10 =new Assignment5_7();
			
			System.out.println("Square ofthe entered number is " +(a10.sqrnum(num)));
	}

}
