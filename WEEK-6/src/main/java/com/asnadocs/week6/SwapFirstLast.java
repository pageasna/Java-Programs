/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asnadocs.week6;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class SwapFirstLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + i + ": ");
            numbers[i] = sc.nextInt();
        }
        if (size > 1) { 
            int temp = numbers[0];
            numbers[0] = numbers[size - 1];
            numbers[size - 1] = temp;
        }
        System.out.println("Array after swapping first and last elements:");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
    
}
