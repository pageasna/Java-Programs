/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asnadocs.week7;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class Factorial {
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; 
        }
        return n * factorial(n - 1);  
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long result = factorial(number);
            System.out.println("Factorial of " + number + " is " + result);
        }
        scanner.close();
    }
}

