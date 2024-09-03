package com.java.program;

import java.util.Scanner;

public class SquareOfNumber {
	
	    public static void main(String[] args) {
	        // Create a Scanner object for user input
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter a number
	        System.out.print("Enter a number: ");
	        double number = scanner.nextDouble();

	        // Calculate the square of the number
	        double square = number * number;

	        // Print the square of the number
	        System.out.println("The square of " + number + " is: " + square);

	    }
	}


