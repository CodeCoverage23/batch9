package com.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {

		HashMap<String, String> hashMap = new HashMap<String, String>();
		
		hashMap.put(null, null);
		hashMap.put("101", "Jiya");
		hashMap.put("104", "jack");
		hashMap.put("102", "Jiya");
		hashMap.put("100", "Becky");
		System.out.println(hashMap);
		Set<Entry<String, String>> entrySet = hashMap.entrySet();
		
		for(Entry<String, String>  m: entrySet) {
			System.out.println(m.getKey()+""+m.getValue());
			
		}
		System.out.println();
		
		Iterator<Entry<String, String>> itr = hashMap.entrySet().iterator();
		
		while(itr.hasNext()) {
			Entry<String, String> next = itr.next();
			System.out.println(next.getKey()+" "+next.getValue());
		}

	}

}
