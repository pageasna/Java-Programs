/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asnadocs.week10;

/**
 *
 * @author ASUS
 */
public class Week10_7 {
    public static void main(String[] args) {
        EmployeeDetails e = new EmployeeDetails("Arham", 101);
        e.displayEmployee();
    }
}

class EmployeeDetails {
    String empName;
    int empId;

    EmployeeDetails(String empName, int empId) {
        this.empName = empName;
        this.empId = empId;
    }

    class Salary {
        double basic, hra, pf;

        Salary(double basic, double hra, double pf) {
            this.basic = basic;
            this.hra = hra;
            this.pf = pf;
        }

        void displaySalary() {
            System.out.println("Salary - Basic: " + basic + ", HRA: " + hra + ", PF: " + pf);
        }
    }

    class JoiningDate {
        int day, month, year;

        JoiningDate(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        void displayJoiningDate() {
            System.out.println("Joining Date: " + day + "/" + month + "/" + year);
        }
    }

    void displayEmployee() {
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee ID: " + empId);

        Salary s = new Salary(50000, 10000, 5000);
        s.displaySalary();

        JoiningDate jd = new JoiningDate(1, 1, 2020);
        jd.displayJoiningDate();
    }
}

