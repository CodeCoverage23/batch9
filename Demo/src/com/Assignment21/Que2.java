package com.Assignment21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//.Suppose I have one container that contain  different colors of ballons such as
//Red, Blue, Green, Red,Blue,Red, Blue, Green in this order, now sort that baloon in such
//manner so Red baloon will be added first then Blue baloon and last is Green balloons. Use the proper collection.


public class Que2 {

	public static void main(String[] args) {
		List<String> ballons=Arrays.asList("Red","Blue","Green", "Red","Blue","Red", "Blue", "Green");
		
		System.out.println("List before Ordering : ");
		System.out.println(ballons);
		System.out.println();
		
		
		Map<String,Integer> bal=new HashMap<>();
		bal.put("Red",0);
		bal.put("Blue",0);
		bal.put("Green",0);
		
		for(String s : ballons) {
			bal.put(s, bal.get(s)+1);
		}
		
		List<String> sortedList = new ArrayList<String>();
		
		for(int i=0;i<bal.get("Red");i++) {
			sortedList.add("Red");
		}
		
		for(int i=0;i<bal.get("Blue");i++) {
			sortedList.add("Blue");
		}
		for(int i=0;i<bal.get("Green");i++) {
			sortedList.add("Green");
		}
		
		System.out.println("List After Ordering");
		
		System.out.println(sortedList);
		
		
	}

}
