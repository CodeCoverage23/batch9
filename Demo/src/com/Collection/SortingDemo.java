package com.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortByDesc implements Comparator<Integer>{
	
	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1<o2) {
			return 1;
		}else if(o1>o2){
			return -1;
		}else {
			return 0;
		}
		
	}
}

public class SortingDemo {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(23);
		al.add(-2);
		al.add(34);
		al.add(5);
		al.add(42);
		al.add(11);
		al.add(4);
		al.add(32);
		
		Collections.sort(al,new SortByDesc());
		System.out.println(al);
	}

	

}
