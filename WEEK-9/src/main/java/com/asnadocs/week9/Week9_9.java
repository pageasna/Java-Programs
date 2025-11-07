/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asnadocs.week9;

/**
 *
 * @author ASUS
 */
public class Week9_9 {
    public static void main(String[] args) {
        int a = 12, b = 18;

        System.out.println("GCD: " + MathOperations.findGCD(a, b));
        System.out.println("LCM: " + MathOperations.findLCM(a, b));
    }
}

class MathOperations {
    static int findGCD(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }
}

