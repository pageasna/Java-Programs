/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asnadocs.week10;

/**
 *
 * @author ASUS
 */
public class Week10_9 {
    public static void main(String[] args) {
        VehicleDyn v;

        v = new BikeDyn();
        v.run();

        v = new CarDyn();
        v.run();
    }
}

class VehicleDyn {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class BikeDyn extends VehicleDyn {
    void run() {
        System.out.println("Bike is running");
    }
}

class CarDyn extends VehicleDyn {
    void run() {
        System.out.println("Car is running");
    }
}
