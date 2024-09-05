package com.sanjay.java;

import java.util.Scanner;
	// Arthmatic operations using switch case \\


public class ArthmaticOpr
{
	
	 void ad(int a, int b)
	  { 
		
		  System.out.println("addition :"+(a+b));
		  
	  } 
	 void sub(int a, int b)
	  { 
		 
		  System.out.println("Sub :"+(a-b));
		  
	  }
	 void mul(int a, int b)
	  { 
		
		  System.out.println("Mul :"+(a*b));
	  }
	 void div(int a, int b)
	  { 
		
		  System.out.println("div :"+(a/b));
		  
	  }


	public static void main(String[] args) {
		 // int P;
	    Scanner S=new Scanner(System.in);

		System.out.println("Enter 1 for add ,2 for Sub,3 for Mul ,4 for div");
		int P =S.nextInt();
	    
		switch (P)
		{
		case 1:
		
		System.out.println("Enter first num");
		int r =S.nextInt();
		System.out.println("Enter seconnd");
		int t=S.nextInt();
		ArthmaticOpr m = new ArthmaticOpr();
		m.ad(r,t);
		break;
		case 2:
			
			System.out.println("Enter first num");
			int q =S.nextInt();
			System.out.println("Enter seconnd");
			int w=S.nextInt();
			ArthmaticOpr m1 = new ArthmaticOpr();
			m1.sub(q,w) ;
			break;
		case 3:
			
			System.out.println("Enter first num");
			int e =S.nextInt();
			System.out.println("Enter seconnd");
			int o=S.nextInt();
			ArthmaticOpr m2 = new ArthmaticOpr();
			m2.mul(e,o) ;
			break;
		case 4:
			
			System.out.println("Enter first num");
			int j =S.nextInt();
			System.out.println("Enter seconnd");
			int k=S.nextInt();
			ArthmaticOpr m3 = new ArthmaticOpr();
			m3.div(j,k) ;
			break;
		 default:
			 System.out.println("invalid input");
			 
		}
	}

}
