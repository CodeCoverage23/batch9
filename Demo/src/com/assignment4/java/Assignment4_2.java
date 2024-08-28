package com.assignment4.java;

public class Assignment4_2 {
	
	//method for substraction of two number which returns int value to that method
	
	public int sub(int a,int b) {
		int c= a-b;
		return c;
	}

	public static void main(String[] args) {
		
		Assignment4_2 a42 = new Assignment4_2();
		
		System.out.println("Substraction Answer is :" +a42.sub(100, 30));
	}

}
