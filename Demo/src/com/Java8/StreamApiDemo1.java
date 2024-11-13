package com.Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiDemo1 {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("samiksha","neha","riya","sonali","akshada","diya");
		
		List<String> collect = list.stream().collect(Collectors.toList());
		System.out.println(collect);
		
		List<String> collect2 = list.stream().filter(s->s.equals("neha")).collect(Collectors.toList());
		System.out.println(collect2);
		
		List<String> collect3 = list.stream().filter(s->s.contains("n")).collect(Collectors.toList());
		System.out.println(collect3);
		
		List<Integer> collect4 = list.stream().map(s->s.length()).collect(Collectors.toList());
		System.out.println(collect4);
		
		
	}

}
