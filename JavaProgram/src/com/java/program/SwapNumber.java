package com.java.program;

// Wap to swap the numbers with different approach
public class SwapNumber {

	public static void main(String[] args) {

		// with third variable
		System.out.println("with a third varaible >>");
		int a=10;
		int b=20;
		int temp;
		 System.out.println("value before swapping : a="+a+" "+"b="+b);

		temp=a;
		a=b;
		b=temp;
		 System.out.println("value after swapping : a="+a+" "+"b="+b);
		
		 System.out.println();
		 
		 //with + and - arithmatic operators without third variable
		 System.out.println("with arithmatic operators without third variable>>");
		 
		 int c=30;
		 int d=40;
		 System.out.println("value before swapping : c="+c+" "+"d="+d);

		 c=c+d;   //c=30+40=70
		 d=c-d;   //d=70-40=30
		 c=c-d;    //c=70-30=40
		 System.out.println("value after swapping : c="+c+" "+"d="+d);
		 System.out.println();

		 //with * and / arithmatic operators without third variable

		 System.out.println("with * and / arithmatic operators without third variable>>");

		 int e=50;
		 int f=60;
		 System.out.println("value before swapping : e="+e+" "+"f="+f);

		 e=e*f;  //e=50*60=3000;
		 f=e/f;  //f=3000/60=50;
         e=e/f;  //e=3000/50=60;
         
         System.out.println("value after swapping : e="+e+" "+"f="+f);
		 System.out.println();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}