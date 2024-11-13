package com.Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterMethodDemo {

	public static void main(String[] args) {
	
		List<Integer> list = Arrays.asList(45,2,13,43,43,53,52,12,24,36,32,43,23,13,2);
		
		System.out.println(list.size());
		
		System.out.println(list);
		
		//Traditional way
		
		List<Integer> evenList = new ArrayList<Integer>();
		for(Integer i : list) {
			if(i%2==0) {
				evenList.add(i);
			}
		}
		System.out.println(evenList);
		System.out.println(evenList.size());
		
		//filter method
		
		List<Integer> evenList2 = list.stream().filter(entry -> entry%2==0).collect(Collectors.toList());

		System.out.println(evenList2);
		
		//filter method 2nd way
		
	    list.stream().filter(entry -> entry%2==0).collect(Collectors.toList()).forEach(entry ->System.out.println(entry));
	    
	    System.out.println("-----------------------------------------------");
		
	    // filter method 3rd way
	    
	    list.stream().filter(entry -> entry%2==0).collect(Collectors.toList()).forEach(System.out::println);
	    
	    System.out.println("-----------------------------------------------");
	    
	    //remove duplicates
	    
	    Set<Integer> collect = list.stream().collect(Collectors.toSet());
	    System.out.println(collect);
	    
	    System.out.println("-----------------------------------------------");
		
	    list.stream().collect(Collectors.toSet()).forEach(e->System.out.println(e));
	    
	    System.out.println("-----------------------------------------------");
	    
	    //remove duplicate 2nd way
	    
	    Set<Integer> collect2 = list.stream().distinct().collect(Collectors.toSet());
	    System.out.println(collect2);
	}

}
