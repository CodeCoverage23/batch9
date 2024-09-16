package com.Assignment6;

import java.util.Scanner;

//Design method void multiplication (int no) and print the multiplication table. ( Example enter the no=5 then output like 
//5*1=5.......5*10=50)

public class Que2 {
	public static void multiplication(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n+"*"+i+" = "+n*i);
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		multiplication(n);

	}

}
