package com.assignment_20.basics;

/*
 * Suppose I have arraylist which contain elements as [mumbai, pune, Bangalore, Hyderabad, mumbai], 
 * now I want to remove the mumbai from list and print that data.
 */

import java.util.ArrayList;

public class Assignment20_4 {

	public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Mumbai");
        cities.add("Pune");
        cities.add("Bangalore");
        cities.add("Hyderabad");
        cities.add("Mumbai");

        // Removing all occurrences of "Mumbai"
        cities.removeIf(city -> city.equalsIgnoreCase("mumbai"));

        // Printing the remaining cities
        System.out.println("Cities after removal: ");
        for (String city : cities) {
            System.out.println(city);
        }
	}

}
