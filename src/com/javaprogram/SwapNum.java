package com.javaprogram;

public class SwapNum {
	
		public static void main(String[] args) {



			System.out.println(" Using a third variable: ");
			int a=10;
			int b=20;
			int temp;
			System.out.println("\n Numbers before swapping : a=" +a+ " " + " b="  +b);

			temp=a;
			a=b;
			b=temp;
			System.out.println("\n Numbers after swapping: a=" +a+ " " + " b=" +b);

			System.out.println("\n\n Using arithmetic operator + -");


			 int c=30;
			 int d=40;
			 System.out.println("\n Numbers before swapping : c=" +c+ " " + " d=" +d);


			 c=c+d; 
			 d=c-d; 
			 c=c-d; 
			 System.out.println("\n Numbers after swapping : c=" +c+ " " + " d=" +d);
			
			 System.out.println("\n\n  Using arithmetic operator * /");

			 int e=50;
			 int f=60;
			 
			 System.out.println("\n Numbers before swapping: e=" +e+ " " + " f=" +f);

			 e=e*f; 
			 f=e/f; 
			 e=e/f; 
			 
			 System.out.println("\n Numbers after swapping: e=" +e+ " " + " f=" +f);
		}
	
	
}
