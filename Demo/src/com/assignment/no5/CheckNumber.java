package com.assignment.no5;

import java.util.Scanner;

public class CheckNumber {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // user to enter a number
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        // Check  the number is greater than 100 or not
	        if (number > 100) {
	            System.out.println(number + " is greater than 100.");
	        } else {
	            System.out.println(number + " is not greater than 100.");
	        }

	        scanner.close();
	    }
	}


