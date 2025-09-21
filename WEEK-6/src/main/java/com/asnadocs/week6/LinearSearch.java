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
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + i + ": ");
            numbers[i] = sc.nextInt();
        }
        System.out.print("Enter the number to search: ");
        int target = sc.nextInt();
        int position = -1; 
        for (int i = 0; i < size; i++) {
            if (numbers[i] == target) {
                position = i; 
                break;
            }
        }
        if (position != -1) {
            System.out.println(target + " found at index " + position + ".");
        } else {
            System.out.println(target + " not found in the array.");
        }
    }
    
}
