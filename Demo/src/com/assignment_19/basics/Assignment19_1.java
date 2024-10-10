package com.assignment_19.basics;

/*
 * Design a method for counting the alphabet, vowels and numbers from String. 
 * Input should be from user into main method and pass that to methods. 
 * And result will print into main method
 * 
 */

import java.util.Scanner;

public class Assignment19_1 {

	public static void main(String[] args) {
		
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a string:");
	        String input = sc.nextLine();

	        int alphabetCount = countAlphabets(input);
	        int vowelCount = countVowels(input);
	        int numberCount = countNumbers(input);

	        System.out.println("Alphabets: " + alphabetCount);
	        System.out.println("Vowels: " + vowelCount);
	        System.out.println("Numbers: " + numberCount);
	    
 }

    private static int countAlphabets(String str) {
		int count = 0;
		for(char ch : str.toCharArray()) {
			if(Character.isLetter(ch)) {
				count++;
			}
		}
		return count;
 }
	private static int countVowels(String str) {
		
	        int count = 0;
	        for (char ch : str.toCharArray()) {
	            if (isVowel(ch)) {
	                count++;
	            }
	        }
	        
		return count;
}

    private static int countNumbers(String str) {
    	
            int count = 0;
            for (char ch : str.toCharArray()) {
                if (Character.isDigit(ch)) {
                    count++;
                }
            }
            
		return count;
 }
	private static boolean isVowel(char ch) {
		ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'; 
		
	}

}
	


