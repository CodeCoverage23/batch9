package com.Assignment17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class VowelNumberCount {

	public static void main(String[] args) {
		String file = "C:\\Batch9\\Git\\Pratiksha\\batch9\\Demo\\src\\com\\Assignment17\\file";
		int vowelCount = 0;
		int digitCount = 0;
		try(BufferedReader br=new BufferedReader(new FileReader(file))){
			String line;
			while((line=br.readLine())!=null) {
				line.toLowerCase();
				
				for(char ch : line.toCharArray()) {
					if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
						vowelCount++;
					}
					else if(Character.isDigit(ch)) {
						digitCount++;
					}
				}
			}
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Number of Vowels found in the File : "+vowelCount);
		System.out.println("Number of Digits found in the File : "+digitCount);

	}

}
