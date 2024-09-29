package com.Collection;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Float,String> tm = new TreeMap<Float,String>();
		
		tm.put(12.5f, "EIT");
		tm.put(5.2f, "ABC");
		tm.put(32.5f, "KLM");
		tm.put(11.3f, "OPL");
		tm.put(23.3f, "TMI");
		System.out.println(tm);

	}

}
