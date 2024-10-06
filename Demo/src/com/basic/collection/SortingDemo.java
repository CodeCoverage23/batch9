package com.basic.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortByDesc implements Comparator<Integer> {
	@Override
	public int compare(Integer o1, Integer o2) {
		if (o1 < o2) {
			return 1;
		} else if (o1 > o2) {
			return -1;
		} else {
			return 0;
		}
	}
}


public class SortingDemo {

	public static void main(String[] args) {

		List<Integer> al = new ArrayList<Integer>();
		al.add(85);
		al.add(45);
		al.add(99);
		al.add(11);
		al.add(-46);
		al.add(5);
		al.add(1);

		Collections.sort(al, new SortByDesc());
		// We can achieve DESC sorting order by comparator as well as ASC sorting order
		// based on requirement
		System.out.println(al);

	}

}
