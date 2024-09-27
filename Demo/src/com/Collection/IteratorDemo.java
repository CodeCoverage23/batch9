package com.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		for(int i = 1;i<=10;i++) {
			list.add("Count "+i);
		}
//		for(String s : list){
//			System.out.println(s);
//		}
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()){
			String data=itr.next();
			System.out.println(data);
		}
		
		List<Integer> list2 = new ArrayList<>();
		
		list2.add(80);
		list2.add(10);
		list2.add(90);
		list2.add(40);
		list2.add(30);
		System.out.println(list2);
		Collections.sort(list2);
		System.out.println(list2);

	}

}
