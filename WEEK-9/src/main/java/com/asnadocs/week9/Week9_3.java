/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asnadocs.week9;

/**
 *
 * @author ASUS
 */
public class Week9_3 {
    public static void main(String[] args) {
        AccountStatic acc = new AccountStatic(); // renamed class
        acc.deposit();
        acc.withdraw();

        System.out.println("Simple Interest: " + AccountStatic.calculateSimpleInterest(10000, 5, 2));
        System.out.println("Compound Interest: " + AccountStatic.calculateCompoundInterest(10000, 5, 2));
    }
}

class AccountStatic { // renamed from _Account
    int Id;
    String Account_holder_name;
    String Address;

    void deposit() {
        System.out.println("Deposit method called.");
    }

    void withdraw() {
        System.out.println("Withdraw method called.");
    }

    static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    static double calculateCompoundInterest(double principal, double rate, double time) {
        return principal * Math.pow((1 + rate / 100), time) - principal;
    }
}

