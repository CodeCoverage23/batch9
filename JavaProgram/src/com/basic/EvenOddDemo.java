package com.basic;

public class EvenOddDemo {
	
	public static void main(String[] args) {
		
		int number = 1000;
		System.out.println("List of Even Number from 0 to 1000" );
		
		for(int i=0; i<=number; i++)
		{
			if(i%2==0)
			{
				System.out.println(i+ "");
			}
		}
		
		System.out.println("List of Odd Number from 0 to 1000" );
		
		for(int i=0; i<=number; i++)
		{
			if(i%2!=0)
			{
				System.out.println(i+ "");
			}
		}
	}

}
