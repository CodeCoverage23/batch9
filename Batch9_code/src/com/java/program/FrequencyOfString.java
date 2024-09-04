package com.java.program;

import java.util.Scanner;

// WAp to define freq of character from given string

public class FrequencyOfString {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a string to check frequncy of character>>");
		 
		String str = sc.nextLine(); // pradeep
		
		 int[] freq= new int[str.length()];//[0,0,0,0,0,0,0]
		
		int i, j;
		
		char[] strArray =str.toCharArray();//[p,r,a,d,e,0,0]
		
		
		for(i=0;i<str.length();i++) { //r
			freq[i]=1;       //[2,1,1,1,2,0,0]
			for(j=i+1;j<str.length();j++) {//j=6
				
				if(strArray[i]==strArray[j]) { //r==
					
					freq[i]++;
					
					strArray[j]='0';
				}
				
			}
			
			
		}
		
		//to display occurance of character in string we are using for loop
		System.out.println("character and their corresponding frequecnies>>");
		
		for(i=0;i<freq.length;i++) {
			
			
			if(strArray[i]!=' ' && strArray[i]!='0') {
				System.out.println(strArray[i]+ " -"+freq[i]);  // p-2  // r-1
				
			}
		}
		
		
		
		
		
		
		
		
	}

}
