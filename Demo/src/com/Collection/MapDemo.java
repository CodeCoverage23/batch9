package com.Collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	
	public static void main(String[]args) {
		
		Map<Integer,String> m=new HashMap<>();
		m.put(101,"Jiya");
		m.put(103,"Kevin");
		m.put(102,"Jiya");
		m.put(101,"Raghu");
		
		System.out.println(m);
	}

}
