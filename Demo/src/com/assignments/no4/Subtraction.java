package com.assignments.no4;

public class Subtraction {
	
    public int subtractNumbers(int num1, int num2) {
        return num1 - num2;
    }

    public static void main(String[] args) {
      
        Subtraction subtraction = new Subtraction();
        
        int result = subtraction.subtractNumbers(60, 10);
        
        System.out.println("The result of subtraction is: " + result);
    }
}


