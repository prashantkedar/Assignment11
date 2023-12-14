/* Implement a class "Student" with instance variables (name, rollNumber)
and a parameterized constructor. Inside the constructor, use the "this"
keyword to differentiate between instance variables and constructor
parameters. Write a java program to print the instance variable values.*/

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

class Student {
    String name;
    int rollNumber;


 public Student (String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
 public String getName() {
    return this.name;
    }
public int getRollNumber() {
    return this.rollNumber;
    }

}

public class Question2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Name of Student: ");
        String name = sc.next();
        System.out.print("Enter the rollNumber of Student: ");
        int rollNumber = sc.nextInt();

        Student s = new Student(name, rollNumber);

        System.out.println(s.getName());
        System.out.println(s.getRollNumber());

    }
}