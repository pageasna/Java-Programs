/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.asnadocs.harmonicseriessum;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class HarmonicSeriesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i; // Add 1/i to sum
        }
        System.out.println("Sum of the series is: " + sum);
    }
}


