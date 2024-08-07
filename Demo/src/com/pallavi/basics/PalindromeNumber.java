package com.pallavi.basics;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

				System.out.println("Enter a number to check palindrome number :  ");
		
		int number = sc.nextInt();
		int orgNumber = number;
		
		
		
	    int rev = 0;
		while(number!=0) //12 //1
		{
			
			rev = rev*10 + number%10;  //0*10 + 123%10=0+3=3 //3*10 +12%10=30  +2=32  //32*10 +1%10=320+1=321
			number = number/10;    //123/10=12 // 12/10=1 // 1/10=0
			
		}
		
		if(orgNumber==rev) {
		
		System.out.println("The number " + orgNumber + " Is palimndrome");
	}
		else
		{
			System.out.println("The given number " + orgNumber + "Is not palindrome"); {
				
			}
	

	}

}

	}


