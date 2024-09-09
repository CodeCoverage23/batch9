package com.assignment_10.basics;

import java.util.Scanner;

/*Write java program to check whether number is Armstrong or not.(A positive number is called
 *Armstrong number if it is equal to the sum of cubes of its digits for example 0, 1, 153, 370, 371, 407 etc.
 *Let's try to understand why 153 is an Armstrong number.
 *153 = (1*1*1)+(5*5*5)+(3*3*3)
 * 
 */



public class Assignment10_3 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();
	        sc.close();

	        if (isArmstrong(number)) {
	            System.out.println(number + " is an Armstrong number.");
	        } else {
	            System.out.println(number + " is not an Armstrong number.");
	        }
	    }

	    public static boolean isArmstrong(int number) {
	        int originalNumber = number;
	        int result = 0;
	        int n = String.valueOf(number).length();

	        while (number != 0) {
	            int digit = number % 10;
	            result += Math.pow(digit, n);
	            number /= 10;
	        }

	        
	       return result == originalNumber;
	}

}
