/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asnadocs.week12;

/**
 *
 * @author ASUS
 */
import java.io.*;  // For File handling

public class Week12_2 {
    // Third function: throws Checked Exception
    public static void thirdFunction() throws IOException {
        FileReader file = new FileReader("file.txt"); // May not exist
        BufferedReader br = new BufferedReader(file);
        System.out.println("First line: " + br.readLine());
        br.close();
    }

    // Second function: just calls third function
    public static void secondFunction() throws IOException {
        thirdFunction(); // propagate exception
    }

    // First function: handles exception
    public static void firstFunction() {
        try {
            secondFunction(); // calling secondFunction
        } catch (IOException e) {
            System.out.println("Exception handled in firstFunction: File not found!");
        }
    }

    public static void main(String[] args) {
        firstFunction(); // run program
    }
}
