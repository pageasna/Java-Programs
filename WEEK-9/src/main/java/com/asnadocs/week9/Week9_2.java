/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asnadocs.week9;

/**
 *
 * @author ASUS
 */
public class Week9_2 {
    public static void main(String[] args) {
        Department dept = new Department("Aligarh Muslim University", 5, "Science", "Computer Science", "Arman Rasool Faridi");
        dept.Display();
    }
}

// University, Faculty, Department classes
class University {
    String name;
    int ranking;

    University(String name, int ranking) {
        this.name = name;
        this.ranking = ranking;
    }
}

class Faculty extends University {
    String name;

    Faculty(String uniName, int ranking, String name) {
        super(uniName, ranking);
        this.name = name;
    }

    void Details() {
        System.out.println("Faculty Name: " + name);
    }
}

class Department extends Faculty {
    String name;
    String chairman;

    Department(String uniName, int ranking, String facultyName, String deptName, String chairman) {
        super(uniName, ranking, facultyName);
        this.name = deptName;
        this.chairman = chairman;
    }

    void Details() {
        System.out.println("Department Name: " + name);
        System.out.println("Chairman: " + chairman);
    }

    void Display() {
        super.Details();  // Faculty Details
        this.Details();   // Department Details
        System.out.println("University Ranking: " + ranking);
    }
}

