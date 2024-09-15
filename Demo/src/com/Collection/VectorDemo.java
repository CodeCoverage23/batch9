package com.Collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		
		v.addElement(222);
		System.out.println(v);
		
		Enumeration<Integer> elements = v.elements();
		while(elements.hasMoreElements()) {
			System.out.println(elements.nextElement()+100);
		}
		
		System.out.println("*********************");
		
		v.stream().forEach(System.out::println);
		System.out.println("*******************************");
		v.stream().forEach(entry->System.out.println(entry));
		

	}

}
