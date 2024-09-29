package com.Collection;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map.Entry;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<String , Integer> m=new Hashtable<String,Integer>();
		
		m.put("Java", 12);
		m.put("Python", 13);
		m.put("C", 3);
		m.put("Html", 5);
		m.put("Css", 21);
		
		System.out.println(m);
		
		Enumeration<Integer> elements=m.elements();
		while(elements.hasMoreElements()) {
			System.out.println(elements.nextElement());
		}
		
		System.out.println("***********8");
		for(Entry<String,Integer> h:m.entrySet()) {
			System.out.println(h.getKey()+" "+h.getValue());
		}
		System.out.println("**********************");
		
		Enumeration<String> keys=m.keys();
		while(keys.hasMoreElements()) {
			System.out.println(keys.nextElement());
		}

	}

}
