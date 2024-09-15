package com.Collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		
		al.add(10);
		al.add(15);
		al.add(20);
		System.out.println(al);
		LinkedList<Integer> l=new LinkedList<>(al);
		l.add(30);
		l.add(null);
		l.add(30);
		l.add(10);
		l.add(5);
		System.out.println(l);
		
		System.out.println("First : "+l.getFirst());
		System.out.println("Last : "+l.getLast());
		
		

	}

}
