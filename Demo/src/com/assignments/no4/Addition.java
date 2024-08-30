package com.assignments.no4;

public class Addition {
	
    public int addNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
       
     Addition addition = new Addition();
        
     int result = addition.addNumbers(40, 50);
        
     System.out.println("The result of addition is: " + result);
    }

}
