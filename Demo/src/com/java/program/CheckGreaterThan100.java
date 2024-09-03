package com.java.program;

import java.util.Scanner;

public class CheckGreaterThan100 {
	
	    public static void main(String[] args) {
	      
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        double number = scanner.nextDouble();


	        if (number > 100) {
	            System.out.println("The number is greater than 100.");
	        } else {
	            System.out.println("The number is not greater than 100.");
	        }

	       
	    }
	}
	


