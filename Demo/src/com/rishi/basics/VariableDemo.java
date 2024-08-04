package com.rishi.basics;

public class VariableDemo {
	
	int a = 12;
	static int c=4;
	
	public static void main(String[] args) {
		
		int b = 10;
	    
	    //a=20;
	    System.out.println(b);
	    System.out.println(c);
	    VariableDemo v = new VariableDemo();
	    v.method();
		
	}
	
	public void method() {
		
		//b=5;
		
		System.out.println(c);
	}

}
