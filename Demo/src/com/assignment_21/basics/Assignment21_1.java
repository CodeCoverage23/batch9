package com.assignment_21.basics;

/*
 *Design the method which return the list that contain the element 
 *as Ram, Sohan, Ashok, Ajay, Prasanna now I want to sort that element based on descending order.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment21_1 {

	public static void main(String[] args) {
        List<String> names = getNames();
        
        // Sorting in descending order
        Collections.sort(names, Collections.reverseOrder());

        // Printing sorted names
        System.out.println("Sorted Names (Descending Order): ");
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static List<String> getNames() {
        List<String> names = new ArrayList<>();
        names.add("Ram");
        names.add("Sohan");
        names.add("Ashok");
        names.add("Ajay");
        names.add("Prasanna");
        return names;
    

	}

}
