package com.Assignment7;
//4. Design method public int getReverseNumber(int num) which return int value to that method and result print into main method.
import java.util.Scanner;

public class Que4 {
	public static int getReverse(int n) {
		int reverse=0;
		while(n!=0) {
			int remainder=n%10;
			reverse=reverse*10+remainder;
			n/=10;
		}
		return reverse;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Reverse of "+n+" : "+getReverse(n));

	}

}
