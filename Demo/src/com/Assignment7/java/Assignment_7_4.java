package com.Assignment7.java;

import java.util.Scanner; 

public class Assignment_7_4 {
	
//WAP public int getReverseNumber(int num) which return int value to that method and result print into main method.


	public static void reverseNumber(int number) {  
		if (number < 10){  
	 
	System.out.println(number);  
		return;  
}  
	 else {  
		 
	System.out.print(number % 10);  
	  reverseNumber(number/10);  
	  
	}  
}  
	public static void main(String[] args) {
		
		System.out.print("Enter the number that you want to reverse --> ");  
		
		Scanner sc = new Scanner(System.in); 
		
		int num = sc.nextInt();  
		
		System.out.print("This is the reverse number --> ");  
		 
		reverseNumber(num); 

	}

}
