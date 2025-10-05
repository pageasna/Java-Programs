/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asnadocs.week8;

/**
 *
 * @author ASUS
 */
public class Car {
    private String model;
    private String color;
    private int price;

    // Default constructor
    public Car() {
        this("Unknown", "Unknown", 0);
    }

    // One-argument constructor
    public Car(String model) {
        this(model, "Unknown", 0);
    }

    // Two-argument constructor
    public Car(String model, String color) {
        this(model, color, 0);
    }

    // Three-argument constructor
    public Car(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    // Setter for price
    public void setPrice(int price) {
        this.price = price;
    }

    // Getter methods
    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    // Display method
    public void display() {
        System.out.println("Model: " + model + ", Color: " + color + ", Price: " + price);
    }

    // main method inside the same class
    public static void main(String[] args) {
        Car car1 = new Car(); // default constructor
        Car car2 = new Car("Honda"); // one-arg constructor
        Car car3 = new Car("Toyota", "Red"); // two-arg constructor

        car1.setPrice(500000);
        car2.setPrice(700000);
        car3.setPrice(900000);

        System.out.println("=== Car 1 ===");
        car1.display();
        System.out.println("=== Car 2 ===");
        car2.display();
        System.out.println("=== Car 3 ===");
        car3.display();
    }
}
