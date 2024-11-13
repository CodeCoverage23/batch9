package com.Assignment24;

public class NameComparator implements Comparable<Employee>{

	@Override
	public int compareTo(Employee o) {
		
		return o.name.compareTo(o.name);
	}

}
