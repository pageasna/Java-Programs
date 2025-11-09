/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asnadocs.week13;

/**
 *
 * @author ASUS
 */
 import java.io.File;
import java.io.IOException;
    public class Week13_1 {
        public static void main(String[] args) {
            try {
                File file = new File("example.txt");
                if (file.createNewFile()) {
                    System.out.println("File created: " + file.getName());
                } else {
                    System.out.println("File already exists.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }
