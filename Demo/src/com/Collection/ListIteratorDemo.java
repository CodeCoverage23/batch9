package com.Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("C");
		list.add("java");
		list.add("python");
		list.add("html");
		list.add("css");
		
		for(String s : list) {
			System.out.println(s);
		}
		System.out.println();
		ListIterator<String> listIterator = list.listIterator();
		while(listIterator.hasNext()) {
			String next = listIterator.next();
			System.out.println(next.toUpperCase());
		}

	}

}
