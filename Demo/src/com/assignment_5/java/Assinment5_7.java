package com.assignment_5.java;

  //Square of any number

import java.util.Scanner;

public class "Assignment5_7"

	public static void main(String[] args) {


		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number =  sc.nextInt();
	        sc.close();

	        int square = number * number;
	        System.out.println("The square of " + number + " is " + square);
	}


