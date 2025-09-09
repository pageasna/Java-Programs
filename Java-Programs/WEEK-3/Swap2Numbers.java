/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.asnadocs.swap2numbers;

public class Swap2Numbers {

    public static void main(String[] args) {
        int a=5;
        int b=10;
        System.out.println("Before swapping:");
        System.out.println("a=" +a+ ",b=" +b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After Swapping:");
        System.out.println("a=" +a+ ",b=" +b);
    }
}
