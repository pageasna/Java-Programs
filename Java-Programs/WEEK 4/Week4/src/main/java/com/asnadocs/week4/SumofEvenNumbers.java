/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asnadocs.week4;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class SumofEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number N: ");
        int N = sc.nextInt();
        int sum = 0;
        for (int i = 2; i <= N; i += 2) { 
            sum += i;
        }
        System.out.println("Sum of all even numbers from 1 to " + N + " is: " + sum);
    }
    
}
