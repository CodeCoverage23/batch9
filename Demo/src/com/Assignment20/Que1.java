package com.Assignment20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//1. Write program to add the five students mobile number into arraylist and iterate that elements using iterator. 

public class Que1 {

	public static void main(String[] args) {
		
		List<String> l=new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 Students Number : ");
		for(int i=0;i<5;i++) {
			l.add(sc.next());
		}
		
		System.out.println("Student Numbers : ");
		Iterator<String> itr = l.iterator();
		
		while(itr.hasNext()) {
			String data=itr.next();
			System.out.println(data);
		}
		

	}

}
