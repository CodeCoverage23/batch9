package com.Assignment2;
//1. Write the Java Program in which declares the different primitives data types.
//2. Write the java program to print first character of your name on console.
//3. Write the Java Program to declare the local variable as x .
//4. Write the java program to assign local variable value as 50.
//4. Write the Java Program to declare the global variables as y
//5. Write the java program to print the global variable value as 25.

public class Variables {
	
	//4. Write the Java Program to declare the global variables as y
	static int y;

	public static void main(String[] args) {
		System.out.println("***************************************");
		//1. Write the Java Program in which declares the different primitives data types.
		
		int i=2;
		float f=2.2f;
		short s=2;
		byte b=3;
		char c='a';
		long l=12;
		double d=2.2d;
		boolean bl=true;
		 // printing them
		System.out.println("i = "+i);
		System.out.println("f = "+f);
		System.out.println("s = "+s);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		System.out.println("l = "+l);
		System.out.println("d = "+d);
		System.out.println("bl = "+bl);
		
		System.out.println("******************************************");
		
		//2. Write the java program to print first character of your name on console.
		
		String name="Pratiksha";
		
		System.out.println("First character of a name : "+name.charAt(0));
		
		System.out.println("******************************************");
		
		//3. Write the Java Program to declare the local variable as x .
		
		int x;          //declaration of local variable;
		
		//4. Write the java program to assign local variable value as 50.
		
		x=50;          // Assigning value as 50
		
		System.out.println("x = "+x);
		
		//5. Write the java program to print the global variable value as 25.
		y=25;
		System.out.println("y = "+y);

	}
	

}
