/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.asnadocs.divideuntillessthan10;

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