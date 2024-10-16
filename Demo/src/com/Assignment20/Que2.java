package com.Assignment20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//2. Design the generics arraylist for string and add five cities into it and iterate that using for each loop.
public class Que2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> l=new ArrayList<String>();
		
		System.out.println("Enter 5 cities name : ");
		
		for(int i=0;i<5;i++) {
			l.add(sc.next());
		}
		
		System.out.println("Cities : ");
		for(String s : l) {
			System.out.println(s);
		}
		

	}

}
