package com.Assigment9.java;

//WAP in which create the multiple objects and display the count of number of objects created into class

public class Assignment9_1 {
	
	
	static int count=0;

	public static void main(String[] args) {
		
		Assignment9_1 c1=new Assignment9_1();   
		
		c1.count();  
		
		Assignment9_1 c2=new Assignment9_1(); 
		
		c2.count();  
		
		Assignment9_1 c3=new Assignment9_1(); 
		
		c3.count();  
		
		System.out.println("Total Number of Objects: "+count);  
		
		}
	
	static void count() 
	{  
		count++;
		}

	}

