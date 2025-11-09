/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asnadocs.week12;

/**
 *
 * @author ASUS
 */
// Custom exception
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// Bank account class
class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String name, double balance) {
        this.accountHolder = name;
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds! Available balance: " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. Current balance: " + balance);
    }
}

// Main class
public class Week12_3 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Asna", 5000);

        try {
            account.withdraw(6000); // Will trigger exception
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Optional: successful withdrawal
        try {
            account.withdraw(3000); // Will succeed
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

