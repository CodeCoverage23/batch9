package com.Assignment20;
//4. Suppose I have arraylist which contain elements as [mumbai, pune, Bangalore, Hyderabad, mumbai],
//now I want to remove the mumbai from list and print that data.

import java.util.ArrayList;

public class Que4 {

	public static void main(String[] args) {
		
		ArrayList<String> l=new ArrayList<String>();
		l.add("mumbai");
		l.add("pune");
		l.add("bangalore");
		l.add("hyderabad");
		l.add("mumbai");
		
		
		
		for(int i=0;i<l.size();i++) {
			l.remove("mumbai");
		}
		
		for(String s : l) {
			System.out.println(s);
		}

	}

}
