package com.Assignment23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//Maharashtra Karnataka Madhya Pradesh
//Mumbai Pune Nagpur
//Bangalore Mysore
//Bhopal Indore
public class Que1 {

	public static void main(String[] args) {
		ArrayList<String> maharashtra=new ArrayList<>();
		maharashtra.add("Mumbai");
		maharashtra.add("Pune");
		maharashtra.add("Nagpur");
		
		
		ArrayList<String> karnataka=new ArrayList<>();
		karnataka.add("Bangalore");
		karnataka.add("Mysore");
		
		ArrayList<String> madhyaPradesh=new ArrayList<>();
		madhyaPradesh.add("Bhopal");
		madhyaPradesh.add("Indore");
		
		Map<String,ArrayList<String>> india=new HashMap<String,ArrayList<String>>();
		
		india.put("Maharashtra", maharashtra);
		india.put("Karnataka", karnataka);
		india.put("MadhyaPradesh", madhyaPradesh);
		
		for(Map.Entry<String, ArrayList<String>> entrySet : india.entrySet()) {
			System.out.println("State : "+entrySet.getKey());
			System.out.println("Cities : "+entrySet.getValue());
		}
		

	}

}
