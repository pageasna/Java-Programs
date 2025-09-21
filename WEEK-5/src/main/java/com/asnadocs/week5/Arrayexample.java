/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asnadocs.week5;

/**
 *
 * @author ASUS
 */
public class Arrayexample {
    public static void main(String[] args) {
        int[] numbers = new int[10]; 
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (i + 1) * 10;
        }
        System.out.println("Array elements are:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
    
}
