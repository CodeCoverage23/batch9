package com.java.program;

import java.util.Scanner;

// WAp to define freq of character from given string

public class FrequencyOfString {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a string to check frequncy of character>>");
		 
		String str = sc.next();
		
		 int[] freq= new int[str.length()];
		
		int i, j;
		
		char[] strArray =str.toCharArray();
		
		
		for(i=0;i<str.length();i++) {
			freq[i]=1;
			for(j=i+1;j<str.length();j++) {
				
				if(strArray[i]==strArray[j]) { //p==r
					
					freq[i]++;
					
					strArray[j]='0';
				}
				
			}
			
			
		}
		
		//to display occurance of character in string we are using for loop
		System.out.println("character and their corresponding frequecnies>>");
		
		for(i=0;i<freq.length;i++) {
			
			
			if(strArray[i]!=' ' && strArray[i]!='0') {
				System.out.println(strArray[i]+ " -"+freq[i]);
				
			}
		}
		
		
		
		
		
		
		
		
	}

}
