package com.assignment_21.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Suppose I have one container that contain  different colors of ballons such 
 * as Red, Blue, Green, Red,Blue,Red, Blue, Green in this order, 
 * now sort that baloon in such manner so Red baloon will be added first then Blue baloon and last is Green balloons. 
 * Use the proper collection
 */


public class Assignment21_2 {

	public static void main(String[] args) {
		 List<String> balloons = new ArrayList<>();
	        Collections.addAll(balloons, "Red", "Blue", "Green", "Red", "Blue", "Red", "Blue", "Green");

	        // Sorting the balloons
	        sortBalloons(balloons);

	        // Printing sorted balloons
	        System.out.println("Sorted Balloons:");
	        for (String balloon : balloons) {
	            System.out.println(balloon);
	        }
	    }

	    public static void sortBalloons(List<String> balloons) {
	        // Define the order of colors
	        List<String> order = new ArrayList<>();
	        Collections.addAll(order, "Red", "Blue", "Green");

	        // Sort balloons based on the defined order
	        balloons.sort(Comparator.comparingInt(order::indexOf));

	}

}
