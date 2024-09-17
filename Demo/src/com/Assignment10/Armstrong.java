package com.Assignment10;
//3. Write java program to check whether number is Armstrong or not.(A positive number is called
//armstrong number if it is equal to the sum of cubes of its digits for example 0, 1, 153, 370, 371, 407 etc.
//Let's try to understand why 153 is an Armstrong number.
//153 = (1*1*1)+(5*5*5)+(3*3*3)
import java.util.Scanner;

public class Armstrong {
	public static boolean isArmstrong(int n){
		int digit=0,last=0,sum=0,temp;
		
		temp=n;
		while(temp>0) {
			temp/=10;
			digit++;
		}
		temp=n;
		while(temp>0) {
			last=temp%10;
			sum+=Math.pow(last, digit);
			temp/=10;
		}
		if(sum==n) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		if(isArmstrong(n)) {
			System.out.println(n+" is a Armstrong number");
		}
		else {
			System.out.println(n+" is not a Armstrong number");  
			
		}

	}

}
