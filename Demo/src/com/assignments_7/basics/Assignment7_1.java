package com.assignments_7.basics;

/*
 * Design method to check whether the character is alphabet,
 *  digit and special symbol.
 */


import java.util.Scanner;

public class Assignment7_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any character: ");
		char ch = sc.next().charAt(0);
		sc.close();
		
		if(Character.isAlphabetic(ch)) {
			System.out.println(ch + " is an ALPHABET. ");
			
		}
		else if(Character.isDigit(ch)) {
			System.out.println(ch + " is a DIGIT.");
			
		}
		else {
			System.out.println(ch + " is a SPECIAL CHARACTER.");
		}

	}

}