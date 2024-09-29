package com.basic.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class DemoHashMap {

	public static void main(String[] args) {

		HashMap<String, String> hashMap = new HashMap<String, String>();

		hashMap.put("101", "Java");
		hashMap.put("102", "Python");
		hashMap.put("103", "Scala");
		hashMap.put("104", "Cpp");

		Set<Entry<String, String>> entrySet = hashMap.entrySet();

		for (Entry<String, String> m : entrySet) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		System.out.println(hashMap);

		Iterator<Entry<String, String>> iterator = hashMap.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<String, String> next = iterator.next();
			System.out.println(next.getKey() + next.getValue());

		}
		
		

	}

}
