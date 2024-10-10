package com.assignment_23.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Design the below example by using HashMap<String, ArrayList<String>>

 *                         India
          /                  |                 \                
    Maharashtra          Karnataka          Madhya Pradesh
/      \      \           /      \              /    \            
Mumbaie Pune Nagpur    Bangalor Mysore     Bhopal    Indore  
 */

public class Assignment23_1 {

	public static void main(String[] args) {
		Map<String, List<String>> india = new HashMap<>();
		
		ArrayList<String> maharastraCities = new ArrayList<>();
		maharastraCities.add("Mumbai");
		maharastraCities.add("Pune");
		maharastraCities.add("Nagpur");
		india.put("Maharashtra", maharastraCities);
		
		ArrayList<String> karnatakaCities = new ArrayList<>();
		karnatakaCities.add("Bangalore");
		karnatakaCities.add("Mysore");
		india.put("Karnataka", karnatakaCities);
		
		ArrayList<String> madhyaPradeshCities = new ArrayList<>();
		madhyaPradeshCities.add("Bhopal");
		madhyaPradeshCities.add("Indore");
	    india.put("Madhya Pradesh", madhyaPradeshCities);
	    
	    System.out.println("Country : India");
	    for(Map.Entry<String, List<String>> stateEntry : india.entrySet()) {
	      System.out.println("  State : " + stateEntry.getKey());
	      System.out.println("  Cities : " + stateEntry.getValue());
		
		
	    }
		
		
	}

}
