package com.assignments.basics;

public class Assignment2One {

	public static void main(String[] args) {
		int age = 27;
		System.out.println(age);
		
		boolean javaIsFun = true; // boolean assign the true false
		System.out.println(javaIsFun);
		
		boolean javaIsDifficult = false;
		System.out.println(javaIsDifficult);
		
		char letterA = '\u0041'; //this is Unicode number of letter A
		System.out.println(letterA);
		
	    char letter = 65; //The numeric value 65 corresponds to the Unicode code point for the letter a
	    System.out.println(letter); //numric value don't need to assign in single quotes
	    
        byte range = 127;  //This is a maximum range of byte
	    System.out.println(range); 
	    
	    short tempreture = -32768; //To start minimum rage of short from this number
	    System.out.println(tempreture);
	    
	    long length = 9223372036854775807L; //This is the maximum value for long and last range number also
	    System.out.println("Length: " + length);
	    
	    float number = 567.7f; // To tell the compiler to treat 567.7 as float rather than double you need to use f or F
	    System.out.println(number);
	    
	    double price1 = 234.67; // No 'd' suffix, still a double
	    System.out.println(price1);
	    
	    double price2  = 456.6; // With 'd' suffix, explicitly a double
	    System.out.println(price2);
	    
	}

}
