package com.assignment5.java;

import java.util.Scanner;

public class Assignmnet5_5 {
	
	//WAP check whether number is even or odd.

	public static void main(String[] args) {
	
		 Scanner r = new Scanner(System.in);

	        System.out.print("Enter a number - ");

	        int num = r.nextInt();

	        if(num % 2 == 0)

	            System.out.println(num + "  is even Number");
	        else
	            System.out.println(num + "  is odd Number");

	}

}
