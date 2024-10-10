package com.assignment_22.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Suppose I have Map<String,Integer> contain key 
 * as Ram, Sohan, Ashok, Ajay, Prasanna and value is 3,2,1,6,5 
 * now I want to sort the value from map and print it.
 */


public class Assignment22_1 {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("Ram", 3);
		map.put("Sohan", 2);
		map.put("Ashok", 1);
		map.put("Ajay", 6);
		map.put("Prasanna", 5);
		
		List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
		list.sort(Map.Entry.comparingByValue());
		
		System.out.println("Sorted Map by Values: ");
		for(Map.Entry<String, Integer> entry : list) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
	}

}
