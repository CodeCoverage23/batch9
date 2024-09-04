package com.java.program;

import java.util.Scanner;

public class CheckCharacter {
	
	static void charCheck(char input_char) {
		if((input_char>=65 && input_char<=90)
		||(input_char>=97 && input_char <=122)) {
			
			System.out.println("the given character is Alphabet");
			
			
		}
		
		else
			if(input_char>=48 && input_char<=57) {
			
			System.out.println("the given character is Digit");
			
			
		}
			else {
				
				System.out.println("the given character is special character");
			}
		
		
		
		
	}
	
	
	
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("please enter a character >> ");
		String next = sc.next();
	    char input_char = next.charAt(0);
	    charCheck(input_char);
		
		
	}

}
