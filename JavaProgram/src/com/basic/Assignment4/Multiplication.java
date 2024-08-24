package com.basic.Assignment4;

public class Multiplication {
	
	public int mul(int s, int t)
	{
		return s*t;
	}
	
	public static void main(String[] args) {
		
		Multiplication m  =  new Multiplication();
	    int result = m.mul(56, 89);
	    
	    System.out.println("The multiplication of two numbers is : " + result);
	}

}
