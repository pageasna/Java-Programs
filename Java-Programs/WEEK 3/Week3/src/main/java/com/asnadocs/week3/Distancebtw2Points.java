/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asnadocs.week3;

/**
 *
 * @author ASUS
 */
public class Distancebtw2Points {
    public static void main(String[] args) {
        int x1=2, y1=3;
        int x2=7, y2=8;
        double distance= Math.sqrt((x2-x1) * (x2-x1) + (y2-y1) * (y2-y1));
        System.out.println("Distance between points:" + distance);
    }
    
}
