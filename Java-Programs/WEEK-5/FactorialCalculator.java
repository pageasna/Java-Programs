/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.asnadocs.factorialcalculator;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        long factorial = 1; 
        for (int i = 1; i <= number; i++) {
            factorial *= i; 
        }
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
