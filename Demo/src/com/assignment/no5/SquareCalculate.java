package com.assignment.no5;

import java.util.Scanner;

public class SquareCalculate {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        int square = number * number;

	        System.out.println("The square of " + number + " is: " + square);

	        
	    }
	}



