package com.Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapMethodDemo2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i=1;i<=50;i++) {
			list.add(i);
		}
		System.out.println(list);
		
		// add 100 in each number
		
		List<Integer> add = list.stream().map(num-> num+100).toList();
		System.out.println(add);
		
		// get the square of even number
		List<Integer> collect = list.stream().filter(num -> num%2==0)
				.map(num -> num*num).collect(Collectors.toList());
		System.out.println(collect);
	
	}

}
