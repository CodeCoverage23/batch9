package com.Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemoOfStrings {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Java","Python","Ruby","kotlin","cpp","Scala","pascal","golang");
		
		//Traditional way
		
		List<String> l = new ArrayList();
		
		for(String s:list) {
			if(s.length()>=5) {
				l.add(s);
			}
		}
		System.out.println(l);
		
		//filter method
		
		List<String> stringwith5Chars = list.stream().filter(s->s.length()>=5).collect(Collectors.toList());
	
		System.out.println(stringwith5Chars);
		
		System.out.println("-----------------------------------");
		
		List<String> list2 = Arrays.asList("Html","CSS","Javascript","TypeScript",null,"bootstrap");
		
		
//		will give null pointer exception
//		List<String> collect = list2.stream().filter(s->s.length()<=5).collect(Collectors.toList());
//		System.out.println();
		
		//to avoid null pointer exception
		List<String> collect = list2.stream().filter(s->s !=null &&s.length()<=5).collect(Collectors.toList());
		System.out.println(collect);
		
		
		list.stream().filter(s->s.length() >=5).collect(Collectors.toList()).forEach(System.out::println);
	}

}
