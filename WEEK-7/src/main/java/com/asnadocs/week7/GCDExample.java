/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asnadocs.week7;

/**
 *
 * @author ASUS
 */
public class GCDExample {
    public static int gcdRecursive(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcdRecursive(b, a % b);
    }
    public static int gcdIterative(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
    public static void main(String[] args) {
        int num1 = 36;
        int num2 = 60;
        System.out.println("Recursive GCD of " + num1 + " and " + num2 + " is: " + gcdRecursive(num1, num2));
        System.out.println("Iterative GCD of " + num1 + " and " + num2 + " is: " + gcdIterative(num1, num2));
    }
}

