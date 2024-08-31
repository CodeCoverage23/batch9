package com.pallavi.basics;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading demo = new MethodOverloading();
		
		demo.add(11, 22);
		demo.add(11,22,33);
		
		demo.operation(55, 44);
		demo.operation(78, 56);
		demo.operation(77, 66, false);

	}
	
	//Rule 1: 
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	public void add(int a, int b , int c) {
		System.out.println(a+b+c);
	}
	//Rule 2: Method overloading with Data type of parameters
	public void operation(int a, int b) {
		System.out.println(a-b);
	}
	public void operation(int a, float b) {
		System.out.println(a*b);
	}
	public void operation(int a , float b, boolean d) {
		if(d) {
		System.out.println(a+2);
	}else
	     System.out.println(a*b);
	}

}
