/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asnadocs.week9;

/**
 *
 * @author ASUS
 */
public class Week9_7 {
    public static void main(String[] args) {
        Manager m = new Manager("Arham", 50000, "Game Development");
        m.showDetails();
    }
}

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    void showDetails() {
        super.showDetails();
        System.out.println("Department: " + department);
    }
}

