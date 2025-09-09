/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.asnadocs.sumofseries;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class SumofSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= N; i++) {
            sum += i; 
        }

        System.out.println("The sum of the series is: " + sum);
    }
}


