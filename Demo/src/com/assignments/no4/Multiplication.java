package com.assignments.no4;

public class Multiplication {

    public int multiplyNumbers(int num1, int num2) {
        return num1 * num2;
    }

    public static void main(String[] args) {
        
        Multiplication multiplication = new Multiplication();
        
        int result = multiplication.multiplyNumbers(3, 9);
        
        System.out.println("The result of multiplication is: " + result);
    }
}


