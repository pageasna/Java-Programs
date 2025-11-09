/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asnadocs.week13;

/**
 *
 * @author ASUS
 */
import java.io.FileReader;
import java.io.IOException;
public class Week13_4 {
    public static void main(String[] args) {
        int count = 0;
        try {
            FileReader reader = new FileReader("example.txt");
            while (reader.read() != -1) {
                count++;
            }
            reader.close();
            System.out.println("Total number of characters: " + count);
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

