package com.assignment_20.basics;

/*Design the generics arraylist for string 
 * and add five cities into it and iterate that using for each loop.
 */


import java.util.ArrayList;

public class Assignment20_2 {

	public static void main(String[] args) {
		 ArrayList<String> cities = new ArrayList<>();
		 
		    cities.add("Mumbai");
	        cities.add("Pune");
	        cities.add("Solapur");
	        cities.add("Bangalore");
	        cities.add("Chennai");
	        

	        System.out.println("Cities:>> ");
	        for (String city : cities) {
	            System.out.println(city);
	        }
	}

}
