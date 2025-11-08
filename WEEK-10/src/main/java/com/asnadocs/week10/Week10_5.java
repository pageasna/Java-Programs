/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asnadocs.week10;

/**
 *
 * @author ASUS
 */
public class Week10_5 {
    public static void main(String[] args) {
        CPP cpp = new CPP();
        cpp.abstraction();
        cpp.polymorphism();
        cpp.inheritance();
        cpp.templateMethod();
        cpp.friendFunction();
    }
}

class ObjectOriented2 {
    void abstraction() {
        System.out.println("Abstraction method called");
    }
    void polymorphism() {
        System.out.println("Polymorphism method called");
    }
    void inheritance() {
        System.out.println("Inheritance method called");
    }
}

class CPP extends ObjectOriented2 {
    void templateMethod() {
        System.out.println("Template method called");
    }

    void friendFunction() {
        System.out.println("Friend function called");
    }
}
