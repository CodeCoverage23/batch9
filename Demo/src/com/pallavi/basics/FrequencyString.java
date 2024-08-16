package com.pallavi.basics;


public class FrequencyString {

	public static void main(String[] args) {
		//given string
		 String str = "Pallavis coding is awesome.";
		 
	       char ch = 'l'; //character whose frequency must be determined
	        int frequency = 0; //store the frequency in frequency

	        for(int i = 0; i < str.length(); i++) { //Iterate through the string
	        	if(ch==str.charAt(i))  //if the specified character appear in the string
	          {
	                ++frequency; //increase frequency by 1
	            }
	        }

	        System.out.println("Frequency of "+ ch  + " = " + frequency);  //print the total frequency of 'char'
	    }

	}


