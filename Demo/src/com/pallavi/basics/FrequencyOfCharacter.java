package com.pallavi.basics;
	
   import java.util.Scanner;

public class FrequencyOfCharacter {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the string: ");
	        String str = sc.nextLine();
	        String checkedChars = ""; // To keep track of characters we've already counted
             sc.close();
	        System.out.println("Frequency of characters:");
	        for (int i = 0; i < str.length(); i++)
	        {
	            char currentChar = str.charAt(i);
	            if (checkedChars.indexOf(currentChar) == -1) { // Check if the character is already counted
	                int count = 0;
	                for (int j = 0; j < str.length(); j++) {
	                    if (str.charAt(j) == currentChar) {
	                        count++;
	
	                }
	            }
	                System.out.println(currentChar + " : " + count );
	                checkedChars += currentChar;
	            }
	        }
	}
}
	                
	            
