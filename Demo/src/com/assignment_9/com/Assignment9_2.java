package com.assignment_9.com;


/*Write the Java program in which create the multiple objects
*and display the count of number of
*objects created into class.
*/
import java.util.Scanner;

class StudentInfo {
    private String name;
    private String studentId;
    private String grade;
    private static int count = 0; // Static variable to keep track of the number of objects

    // Constructor
    public StudentInfo(String name, String studentId, String grade) {
        this.name = name;
        this.studentId = studentId;
        this.grade = grade;
        count++; // Increment the count whenever a new object is created
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getGrade() {
        return grade;
    }

    // Static method to get the count of objects
    public static int getCount() {
        return count;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("StudentId: " + getStudentId());
        System.out.println("Grade: " + getGrade());
        System.out.println();
    }
}

public class Assignment9_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();
        sc.nextLine(); // Consume newline

        StudentInfo[] students = new StudentInfo[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter the details of student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("StudentId: ");
            String studentId = sc.nextLine();
            System.out.print("Grade: ");
            String grade = sc.nextLine();

            students[i] = new StudentInfo(name, studentId, grade);
        }

        // Displaying the information of all students
        for (StudentInfo student : students) {
            student.displayInfo();
        }

        // Displaying the count of objects created
        System.out.println("Total number of student objects created: " + StudentInfo.getCount());

        sc.close();
    }
}

