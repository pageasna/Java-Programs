/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asnadocs.week11;

/**
 *
 * @author ASUS
 */
public class Week11_3 {
    public static void main(String[] args) {
        BuySomething3 buy = new BuySomething3();
        buy.offer();
        buy.details();
    }
}

interface Bike3 {
    void offer();
    default void details() {
        System.out.println("Bike details: Brand, Model, Price");
    }
}

interface Scooty3 {
    void offer();
    default void details() {
        System.out.println("Scooty details: Brand, Model, Price");
    }
}

class BuySomething3 implements Bike3, Scooty3 {
    public void offer() {
        System.out.println("Special Offers available!");
    }

    // Resolving ambiguity
    public void details() {
        Bike3.super.details();
        Scooty3.super.details();
        System.out.println("BuySomething3: Combined vehicle details");
    }
}

