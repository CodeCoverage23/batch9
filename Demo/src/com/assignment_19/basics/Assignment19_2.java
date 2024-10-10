package com.assignment_19.basics;

import java.util.Scanner;

/*
 * Design the java method for String getReverseString(String reverse) 
 * and take the input from user into main method and pass to that method. 
 * Result will print into main method
   Output
   Enter string- pune
   Output enup

 */



public class Assignment19_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        
        String reversed = getReverseString(input);
        
        System.out.println("Output: " + reversed);
    }

    public static String getReverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    
		}

}
