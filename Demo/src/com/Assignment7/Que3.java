package com.Assignment7;

import java.util.ArrayList;
import java.util.Scanner;

//3. Design method to print factors of given number( Enter no = 6 then factors should be displayed like 1,2,3,6.

public class Que3 {
	
	public static void factors(int n) {
		ArrayList<Integer> l=new ArrayList<>();
		
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				l.add(i);
			}
		}
		System.out.println("Factors of "+n+" : ");
		
			System.out.print(l);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		factors(n);

	}

}
