/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asnadocs.week10;

/**
 *
 * @author ASUS
 */
public class Week10_3 {
    public static void main(String[] args) {
        System.out.println("Min: " + minMaxAdd(10, 20, "min"));
        System.out.println("Max: " + minMaxAdd(5.5, 2.3, "max"));
        System.out.println("Addition: " + minMaxAdd('A', 'B', "add"));
    }

    // Integers
    static int minMaxAdd(int a, int b, String op) {
        if(op.equals("min")) return Math.min(a, b);
        else if(op.equals("max")) return Math.max(a, b);
        else return a + b;
    }

    // Doubles
    static double minMaxAdd(double a, double b, String op) {
        if(op.equals("min")) return Math.min(a, b);
        else if(op.equals("max")) return Math.max(a, b);
        else return a + b;
    }

    // Characters
    static int minMaxAdd(char a, char b, String op) {
        if(op.equals("min")) return Math.min(a, b);
        else if(op.equals("max")) return Math.max(a, b);
        else return a + b; // addition returns ASCII sum
    }
}

