//3.write a program to find out maximum number among three number(if else if ladder statement)

package com.Assignment5;

import java.util.Scanner;
public class MaxThreeNo {
	



	    public static void main(String[] args) {
	    
	        Scanner scanner = new Scanner(System.in);

	    
	        System.out.print("Enter the first number: ");
	        int num1 = scanner.nextInt();
	        System.out.print("Enter the second number: ");
	        int num2 = scanner.nextInt();
	        System.out.print("Enter the third number: ");
	        int num3 = scanner.nextInt();

	       
	        if (num1 >= num2 && num1 >= num3) {
	            System.out.println(num1 + " is the maximum number.");
	        } else if (num2 >= num1 && num2 >= num3) {
	            System.out.println(num2 + " is the maximum number.");
	        } else {
	            System.out.println(num3 + " is the maximum number.");
	        }

	      
	        scanner.close();
	    }
	}



