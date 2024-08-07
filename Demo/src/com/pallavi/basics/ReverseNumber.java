package com.pallavi.basics;

import java.util.Scanner;

// wap to reverse a given number  example, 3476====>6743
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println( "Enter a number to reverse");
		
		int number = sc.nextInt();
		int rev = 0;
		
		while(number!=0) //12 //1
		{
			
			rev = rev*10 + number%10;  //0*10 + 123%10=0+3=3 //3*10 +12%10=30  +2=32  //32*10 +1%10=320+1=321
			number = number/10;    //123/10=12 // 12/10=1 // 1/10=0
			
		}
		
		System.out.println("Reverse number is : " + rev);

	}

}
