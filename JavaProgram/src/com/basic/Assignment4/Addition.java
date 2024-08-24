package com.basic.Assignment4;

public class Addition {
	
	public int add(int x, int y)
	{
		return x+y;
	}

	
	public static void main(String[] args) {
		
		Addition a = new Addition();
		int result = a.add(10, 20);
		
		System.out.println("The addition of two numbers is : " + result);
	}
}
