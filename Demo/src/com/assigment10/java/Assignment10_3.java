package com.assigment10.java;

import java.util.Scanner;  
import java.lang.Math; 

public class Assignment10_3 {
	
	//WAP to check whether number is Armstrong or not.

	static boolean isArmstrong(int n){  
		
	int temp, digits=0, last=0, sum=0;   
	  
	temp=n;   
	 
	while(temp>0){ 
		
		temp = temp/10;
  
		digits++;   
}   
		temp = n;   
	
		while(temp>0){   
	      
		last = temp % 10;   
	
		sum +=  (Math.pow(last, digits));   
	 
		temp = temp/10;   
	}  
	 
		if(n==sum)   
	  
			return true;      
	
		else return false;   
}
	public static void main(String[] args) {
		
		int num;   
		
		Scanner sc= new Scanner(System.in);  
		
		System.out.print("Enter the number --> ");  
		
		num=sc.nextInt(); 
		
		if(isArmstrong(num)) {  
			
		System.out.print("The number is Armstrong ");
		
	}  
		else {  
			
		System.out.print("The Number is Not Armstrong ");  
		}  


	}

}
