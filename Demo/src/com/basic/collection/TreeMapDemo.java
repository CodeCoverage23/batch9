package com.basic.collection;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		TreeMap<Float, String> tm = new TreeMap<>();

		tm.put(12.5f, "ABC");
		tm.put(5.5f, "DEF");
		tm.put(42.4f, "GHI");
		tm.put(1.5f, "KLM");
		
		// by default asc order
		System.out.println(tm.reversed());

	}

}
