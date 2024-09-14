package com.Assignment4;
//1. Write the java program to design method for addition of two number which returns int results to 
//that method and result should be print into main method

import java.util.Scanner;

//2. Write the java program to design method for substraction of two number which returns int value to 
//that method and result should be print into main method.

//3. Write the java program to design method for multiplication of two number which returns int value to 
//that method and result should be print into main method.

//4. Write the java program to design method for division of two number which returns int value to that
//method and result should be print into main method.


public class Que1to4{
	
	//1. method for addition of two number which returns int results 
	
	public static int add(int a,int b) {
		return a+b;
	}
	
	//2.method for substraction of two number which returns int value 
	
	public static int sub(int a,int b) {
		return a-b;
	}
	
	//3.method for multiplication of two number which returns int value 
	
	public static int mul(int a,int b) {
		return a*b;
	}
	
	//4. method for multiplication of two number which returns int value 
	public static int div(int a,int b) {
		return a/b;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two values to perform operation : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println("Addition : "+add(a,b));
		System.out.println("Substraction : "+sub(a,b));
		System.out.println("Multiplication : "+mul(a,b));
		System.out.println("Division : "+div(a,b));

	}

}
