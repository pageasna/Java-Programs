/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asnadocs.week9;

/**
 *
 * @author ASUS
 * 
 */
public class Week9_10 {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Kim", 90);
        Student s2 = new Student(2, "Parker", 85);

        s1.showDetails();
        s2.showDetails();

        // Change school name
        Student.changeSchoolName("St George's School");
        s1.showDetails();
        s2.showDetails();
    }
}

class Student {
    int rollNo;
    String name;
    int marks;
    static String schoolName = "St Francis School";

    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    static void changeSchoolName(String newName) {
        schoolName = newName;
    }

    void showDetails() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks + ", School: " + schoolName);
    }
}

