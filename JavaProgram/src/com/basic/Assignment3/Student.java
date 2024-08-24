package com.basic.Assignment3;

public class Student {
    
    public String getStudentName(String name) {
        return name;
    }

    public static void main(String[] args) {
        
        Student student = new Student();

       
        String studentName = student.getStudentName("Kalyani");
        System.out.println("Student Name: " + studentName);
    }
}