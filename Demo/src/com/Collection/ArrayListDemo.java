package com.Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(2);
		al.add(20);
		al.add(22);
		al.add(22);
		al.add(null);
		
		al.add(0, 3);
		//Integer i=new Integer(3);
		//al.addFirst(3);
		
		
	
		
		//System.out.println(Integer.valueOf(3));
		
		System.out.println(al);
		al.remove(3);
		System.out.println(al);
		
		List<String> l=new ArrayList<>();
		l.add("code");
		l.add("java");
		l.add("code");
		l.add("cover");
	    
		System.out.println(l);
		for(String s : l) {
			System.out.println(s.toUpperCase());
		}

	}

}
