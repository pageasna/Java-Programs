/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asnadocs.week5;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class SumofDigits {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        int sum = 0;
        int temp = number;
        while (temp != 0) {
            int digit = temp % 10; 
            sum += digit;        
            temp /= 10;            
        }
        System.out.println("Sum of digits of " + number + " is: " + sum);
    }   
}
