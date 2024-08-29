package com.pallavi.basics;

import java.util.Scanner;

public class LeapYear3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the year: ");
		
		int year = sc.nextInt();
		sc.close();
		
		boolean leap = (year % 4 == 0) && ((year %100 != 0) || (year % 400 == 0));
		 
		if(leap)
			System.out.println("This is a leap year");
		else
			System.out.println("This is not a leap year");
	}

}
