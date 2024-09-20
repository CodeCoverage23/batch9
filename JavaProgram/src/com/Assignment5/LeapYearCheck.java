
//2.write a program to check whether year is leap year or not. (If else stmt).

package com.Assignment5;

import java.util.Scanner;
public class LeapYearCheck {
	

	

	    public static void main(String[] args) {
	        // Create a scanner object for user input
	        Scanner scanner = new Scanner(System.in);

	        // Input the year
	        System.out.print("Enter a year: ");
	        int year = scanner.nextInt();

	        // Check if the year is a leap year
	        if (year % 4 == 0) {
	            if (year % 100 == 0) {
	                // If the year is divisible by 100, check if it's also divisible by 400
	                if (year % 400 == 0) {
	                    System.out.println(year + " is a leap year.");
	                } else {
	                    System.out.println(year + " is not a leap year.");
	                }
	            } else {
	                System.out.println(year + " is a leap year.");
	            }
	        } else {
	            System.out.println(year + " is not a leap year.");
	        }

	        // Close the scanner
	        scanner.close();
	    }
	}

