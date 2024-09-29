package com.basic.collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHadhMapDemo {

	public static void main(String[] args) {

		Map<Integer, String> map = new LinkedHashMap<Integer, String>();

		System.out.println("Is map empty : " + map.isEmpty());

		map.put(12, "Pune");
		map.put(30, "Akola");
		map.put(28, "Buldhana");
		map.put(27, "Amravati");
		map.put(14, "Latur");

		map.putIfAbsent(15, "Latur");
		map.replace(14, "PimpriC");

		System.out.println(map);

		System.out.println("Is map empty : " + map.isEmpty());

		System.out.println(map.get(12));

		if (map.containsKey(31)) {
			System.out.println(map.get(31));
		}

	}

}
