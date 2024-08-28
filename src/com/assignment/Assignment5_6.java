package com.assignment;
import java.util.Scanner;

public class Assignment5_6 {

	public static void main(String args[]) 
	{
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter the number : " );
		int num= s.nextInt();
				
		if(num>100) 
		{	System.out.println(num+ " is greater number than 100" ); }
		
		else 
		{	System.out.println(num+ " is not grater number than 100" ); }
	}
}

