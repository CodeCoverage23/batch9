package com.pallavi.basics;

public class BasicOperator {

	public static void main(String[] args) {
		int x = 7;
		int y = 5;
		int a = 3;
		int b = 8;
		
		boolean result=x>y && a>b; // using AND operator
		
		System.out.println(result);

		int c = 10;
		int d = 16;
		int f = 23;
		int g = 19;
		
		boolean result1= c<d || f>g; // using OR operator
		
		System.out.println(result1);
	}

}
