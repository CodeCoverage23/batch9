package com.assignment_17.basics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Assignment17_1 {

	public static void main(String[] args) {
		String fileName = "C:\\Users\\Pallavi\\OneDrive\\Documents\\batch9_java\\git\\Pallavi\\batch9\\Demo\\src\\com\\assignment_17\\basics\\file";
		int vowelCount = 0;
		int digitCount = 0;
		
        System.out.println("File path: " + fileName); 
		
		try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
			int c;
			while((c = br.read()) != -1) {
				char ch = (char) c;
				if(isVowel(ch)) {
					vowelCount++;
				}else if(Character.isDigit(ch)){
					digitCount++;
					
				}
			}
		}catch(IOException e) {
			System.out.println("An error occurred while reading the file: ");
			e.getMessage();
			e.printStackTrace();
		}
		System.out.println("Number of vowels: " + vowelCount);
		System.out.println("Number of digit: " + digitCount);
	
	}
	private static boolean isVowel(char ch) {
		ch = Character.toLowerCase(ch);
		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	}

}

