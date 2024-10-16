package com.Assignment21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Design the method which return the list that contain the element as Ram, Sohan, Ashok, Ajay, Prasanna 
//now I want to sort that element based on descending order.

public class Que1 {
	
	public ArrayList<String> getList(){
		
		ArrayList<String> list=new ArrayList<>();
		list.add("Ram");
		list.add("Sohan");
		list.add("Ashok");
		list.add("Ajay");
		list.add("Prasanna");
		
		return list;
	}

	public static void main(String[] args) {
		Que1 p=new Que1();
		ArrayList<String> al = p.getList();
		
		System.out.println("List Of Names Before sorting : ");
		for(String s : al) {
			System.out.println(s);
		}
		
		System.out.println();
		
		Collections.sort(al, Collections.reverseOrder());
		
		System.out.println("Names in Descending order : ");
		 
		for(String s : al) {
			System.out.println(s);
		}

	}

}
