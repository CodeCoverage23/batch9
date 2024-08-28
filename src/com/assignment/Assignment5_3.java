package com.assignment;
import java.util.Scanner;


public class Assignment5_3 {
	
	static int a,b,c;
	
	public static void main() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number to check which one is greater :");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if(a>b && a>c) {
			
			System.out.println(a+ "is greater number among three");
			
		}else if(b>a && b>c) {
			
			System.out.println(b+ "is greater number among three");
			
		}
		else {
			
			System.out.println(c+ "is greater number among three");
		}
	}

}
