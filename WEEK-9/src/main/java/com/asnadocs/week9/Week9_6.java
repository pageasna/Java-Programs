/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asnadocs.week9;

/**
 *
 * @author ASUS
 */
public class Week9_6 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 10);
        Circle c = new Circle(7);

        r.area();
        c.area();
    }
}

class Shape {
    void area() {
        System.out.println("Area of shape");
    }
}

class Rectangle extends Shape {
    int length, width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    void area() {
        System.out.println("Area of Rectangle: " + (length * width));
    }
}

class Circle extends Shape {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    void area() {
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }
}

