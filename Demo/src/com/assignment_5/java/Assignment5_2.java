package com.assignment_5.java;

  //Check the leap year using if else statement

import java.util.Scanner;

public class Assignment5_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a year: ");
		
		int year = sc.nextInt();
		sc.close();
		
		 boolean leap = false;
		 
		 if(year % 4 == 0) {
			 if(year % 100 == 0) {
				 if(year % 400 == 0) {
					 leap = true;
					 
				 }
			 }
			 else {
				 leap = true;
				 
				}
			 
		 }
		 
		 if(leap) {
			 System.out.println( "**This is a leap year**");
		 }
		 else {
			 System.out.println( "***This is not a leap year***");
		 }
		 
		 
		

	}

}
