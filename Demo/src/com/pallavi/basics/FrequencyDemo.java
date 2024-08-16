package com.pallavi.basics;

import java.util.Scanner;
 //to define frequency of character
public class FrequencyDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to check frequency: ");
		
		String str=sc.nextLine();
		
		sc.close();
		
		int [] freq = new int [str.length()];
		
		int i, j;
		char[] strArray = str.toCharArray();
		
        for(i =0; i<str.length(); i++)
        {
        	freq[i]=1;
        for(j=i+1; j<str.length(); j++) {
        	if(strArray[i]==strArray[j])
        	{
        		freq[i]++;
        		strArray[j]='0';
        	}
        	
        }
        
        	
        }
        //to display occurrence of character in string we are using for loop
        System.out.println("Character and their corresponding frequency: ");
        
        for(i=0; i<freq.length;i++) {
        	
        	if(strArray[i] !=' '&& strArray[i] != '0') {
        		System.out.println(strArray[i]+ "-"+freq[i]);
        	}
        	
        }
	}

	
	}


