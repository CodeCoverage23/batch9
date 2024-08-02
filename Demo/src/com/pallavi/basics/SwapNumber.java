package com.pallavi.basics;

public class SwapNumber {

	public static void main(String[] args) {
		
		
		
		System.out.println("With a third variable: ");
		int a=10;
		int b=20;
		int temp;
		System.out.println("Value before swapping : a=" +a+ " " + " b="  +b);
		
		temp=a;
		a=b;
		b=temp;
		System.out.println("Value after swapping: a=" +a+ " " + " b=" +b);
		     
		 System.out.println();
		 
		 // With + and - arithmetic operators without third variable
		
		 System.out.println("With + and - arithmetic operators without third variable");
		 
		 
		 int c=50;
		 int d=40;
		 System.out.println("Value before swapping : c=" +c+ " " + " d=" +d);
		 
		 
		 c=c+d; //c=50+40=70;
		 d=c-d; //d=70-40=30;
		 c=c-d; //c=70-30=40;
		 System.out.println("Value after swapping : c=" +c+ " " + " d=" +d);
		 System.out.println();
		 
		 //With * and / arithmetic operators without third variable
			
		 System.out.println("With * and / arithmetic operators without third variable");
		 
		 int e=50;
		 int f=30;
		 System.out.println("Value before swapping: e=" +e+ " " + " f=" +f);
		 
		 e=e*f; //e=50*30=1500;
		 f=e/f; //f=1500/30=50;
		 e=e/f; //e=1500/50=30;
		 System.out.println("Value after swapping: e=" +e+ " " + " f=" +f);
		 System.out.println();
	}

}
