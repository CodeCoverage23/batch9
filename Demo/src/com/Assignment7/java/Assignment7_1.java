package com.Assignment7.java;

import java.util.Scanner;

public class Assignment7_1 {
//WAP whether the character is alphabet, digit and special symbol.

	static void charCheck(char input_char) {
		if((input_char>=65 && input_char<=90)||(input_char>=97 && input_char <=122)) {
			
			System.out.println("The given Character is alphabet");
		}
		else 
			if(input_char>=48 && input_char<=57) {
				
				System.out.println("The given Character is Digit");
			
			}
			else {
				
				System.out.println("The givn Character is  Special Character");
			}
	}
	 public static void main (String[] str) {
		 Scanner sc= new Scanner(System.in);
		 
		 System.out.println("Please enter a Character --");
		 
		 String next = sc.next();
		 char input_char = next.charAt(0);
		 
		 charCheck(input_char);
	 }

}
