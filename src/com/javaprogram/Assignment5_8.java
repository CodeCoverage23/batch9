package com.javaprogram;

import java.util.Scanner;

public class Assignment5_8 {
	
	static int a,b,c,d,e,f;
	public static void main(String[] args) {

		System.out.println(" Using a third variable: ");
Scanner s= new Scanner(System.in);
		
		System.out.println("Enter the number : " );
	    a= s.nextInt();
	    b= s.nextInt();
		int temp;
		System.out.println("\n Numbers before swapping : a=" +a+ " " + " b="  +b);

		temp=a;
		a=b;
		b=temp;
		System.out.println("\n Numbers after swapping: a=" +a+ " " + " b=" +b);

		System.out.println("\n\n Using arithmetic operator + -");


		System.out.println("Enter the number : " );
	    c= s.nextInt();
	    d= s.nextInt();
		 System.out.println("\n Numbers before swapping : c=" +c+ " " + " d=" +d);


		 c=c+d; 
		 d=c-d; 
		 c=c-d; 
		 System.out.println("\n Numbers after swapping : c=" +c+ " " + " d=" +d);
		
		 System.out.println("\n\n  Using arithmetic operator * /");

			System.out.println("Enter the number : " );
		    e= s.nextInt();
		    f= s.nextInt();
		 
		 System.out.println("\n Numbers before swapping: e=" +e+ " " + " f=" +f);

		 e=e*f; 
		 f=e/f; 
		 e=e/f; 
		 
		 System.out.println("\n Numbers after swapping: e=" +e+ " " + " f=" +f);
	}


}
