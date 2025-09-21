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
public class DivideUntilLessThan10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = sc.nextDouble(); 

        while (number >= 10) {
            number = number / 2;
            System.out.println("Result: " + number);
        }
    }
    
}
