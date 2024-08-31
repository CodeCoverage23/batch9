package com.pallavi.basics;

public class CountFrequency {
      
	
	public static void main(String[] args) {
		
		
		 String str = "Withput array";
	        String checkedChars = ""; // To keep track of characters we've already counted

	        for (int i = 0; i < str.length(); i++) {
	            char currentChar = str.charAt(i);
	            if (checkedChars.indexOf(currentChar) == -1) { // Check if the character is already counted
	                int count = 0;
	                for (int j = 0; j < str.length(); j++) {
	                    if (str.charAt(j) == currentChar) {
	                        count++;
	                    }
	                }
	                System.out.println(currentChar + ": " + count);
	                checkedChars += currentChar; // Mark this character as counted
	            }
	        }
	    }
	}
	