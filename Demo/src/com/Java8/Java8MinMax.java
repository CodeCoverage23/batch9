package com.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Java8MinMax {

	public static void main(String[] args) {
		List<Integer> num=Arrays.asList(12,32,14,43,53,53,123,7,3,56,25);
		System.out.println(num);
		System.out.println();
	
		List<Integer> collect = num.stream().sorted((I1,I2)->I2-I1).collect(Collectors.toList());
		System.out.println(collect);
		
		Optional<Integer> max = num.stream().max((I1,I2)->I2-I1);
		
		//Integer integer=max.get(
		System.out.println(max.get());
		
		Optional<Integer> max2 = collect.stream().max((I1,I2)->I2-I1);
		System.out.println(max2.get());
		
		 Integer integer = collect.stream().min((I1,I2)->I2-I1).get();
		 System.out.println(integer);
		 
		 System.out.println("******************************");
		 
		 List<Integer> collect2 = num.stream().distinct().collect(Collectors.toList());
		 System.out.println(collect2);
		 
		 long count = num.stream().distinct().count();
		 System.out.println("Count >> "+ count);
		 Optional<Integer> any = num.stream().findAny();
		 if(any.isPresent()) {
			 System.out.println(any.get());
		 }
		 else {
			 System.out.println("No Value");
		 }

		 System.out.println("******************");
		 
		 boolean anyMatch = num.stream().anyMatch(n->(n+1)/4==5);
		 System.out.println(anyMatch);
		 
		 boolean anyMatch2 = num.stream().anyMatch(n->n%5==0);
		 System.out.println(anyMatch2);
		 
		 boolean allMatch = num.stream().allMatch(n->n%5==0);
		 System.out.println(allMatch);
	}

}
