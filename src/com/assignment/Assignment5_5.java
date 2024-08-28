package com.assignment;
import java.util.Scanner;

public class Assignment5_5 {

	public static void main(String args[]) 
	{
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter the number : " );
		int num= s.nextInt();
				
		if(num%2==0) 
		{	System.out.println(num+ " is EVEN number" ); }
		
		else 
		{	System.out.println(num+ " is ODD number" ); }
	}
}
