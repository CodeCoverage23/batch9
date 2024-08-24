package com.basic.Assignment4;

public class Substraction {

	public int sub(int a, int b)
	{
	return a - b;
	}

		public static void main(String[] args) {
			
			Substraction s = new Substraction();
			int result = s.sub(80 ,76);
			
			System.out.println("The substraction of two numbers is : " + result);
		}
}

