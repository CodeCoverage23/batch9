package com.assignment5.java;

import java.util.Scanner; 

public class Assignment5_2 {

	 


		boolean isLeapYear(int y)  
		{  

		if (((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0))  
		{  
		return true;  
	   }  
	  
		return false;  
	   }  

		public static void main(String argvs[])  
	{  

	Assignment5_2 obj = new Assignment5_2();

	Scanner scnObj = new Scanner(System.in);  
	  
	System.out.println("Enter The Year - ");  

	int year = scnObj.nextInt();  
	  
	if(obj.isLeapYear(year))  
	{  
	    System.out.println("The year " + year + " This is a leap year.");  
	}  
	else  
	{  
	    System.out.println("The year " + year + " This is not a leap year.");  

	System.out.println();  
	  
		}
	}
	
}