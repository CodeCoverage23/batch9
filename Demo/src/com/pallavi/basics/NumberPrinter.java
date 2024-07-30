package com.pallavi.basics;

public class NumberPrinter {

	public static void main(String[] args) {
		int i;
		
		for(i=1; i<=100; i++)
			
			if(i % 5 == 0) {
				System.out.println("First Name");
			}
			else 
				if(i % 7 == 0)
				{
					System.out.println("Last Name");
				}
				else
					if(i % 5 ==0 && i % 7 ==0)
					{
						System.out.println("Full Name");
					}
					else {
						System.out.println(i);
				
			}
	}

}
