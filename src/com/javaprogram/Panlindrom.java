package com.javaprogram;

public class Panlindrom {

	public static void main(String args[]){  
		  int rem,sum=0,temp;    
		  int n=121; 
		  
		  temp=n;    
		  while(n>0){    
		   rem=n%10; 
		   sum=(sum*10)+rem;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("The number " +sum+ " " + "is palindrome number ");    
		  else    
		   System.out.println("The number " +sum+ " " + "is not palindrome");    
		}  
	
}
