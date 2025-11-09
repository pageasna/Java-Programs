/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asnadocs.week13;

/**
 *
 * @author ASUS
 */
import java.io.*;

public class Week13_5 {
    public static void main(String[] args) {
        // Change this path to your file’s location
        String filePath = "example.txt";
        int lineCount = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            while (reader.readLine() != null) {
                lineCount++;
            }
            reader.close();

            System.out.println("Total number of lines in the file: " + lineCount);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}

