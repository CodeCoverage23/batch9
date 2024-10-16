package com.Assignment22;
//. Suppose I have Map<String,Integer> contain key as Ram, Sohan, Ashok, Ajay, Prasanna 
//and value is 3,2,1,6,5 now I want to sort the value from map and print it.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Que1 {

	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<>();
		map.put("Ram", 3);
		map.put("Sohan", 2);
		map.put("Ashok", 1);
		map.put("Ajay", 6);
		map.put("Prasanna", 5);
		
		 ArrayList<Map.Entry<String, Integer>> al = new ArrayList<>(map.entrySet());
		 al.sort(Map.Entry.comparingByKey());
		 
		 System.out.println("Sorted Map by Key : ");
		 System.out.println(al);
		 
		 System.out.println("");
		 System.out.println("Sorted by Value : ");
		 al.sort(Map.Entry.comparingByValue());
		 System.out.println(al);
		

	}

}
