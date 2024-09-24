package com.Collection;

import java.util.HashSet;
import java.util.Set;

public class HashsetDemo {

	public static void main(String[] args) {
		
		Set<Integer> s=new HashSet<>();
		s.add(45);
		s.add(25);
		s.add(45);
		s.add(5);
		s.add(3);
		s.add(54);
		
		Integer valueOf = Integer.valueOf(54);
		System.out.println(valueOf.hashCode());
		System.out.println(s.add(3));
		System.out.println(s.add(33));
		System.out.println(s);
		
		HashSet<Integer> h=new HashSet<>();
		h.add(85);
		h.add(61);
		h.add(77);
		h.addAll(s);
		System.out.println(h);

	}

}
