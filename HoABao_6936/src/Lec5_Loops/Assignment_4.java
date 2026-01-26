/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec5_Assignment;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author gamet
 */
public class Assignment_4 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        double n;
        double random4 = rand.nextDouble() * 99.0 + 1.0;
        do {
            System.out.println("Nhap so tu (1-100) :");
            n = scanner.nextDouble();
        } while (n > 100 || n < 1);
        if (n > random4) {
            System.out.println("so thuc lon hon so thuc ngau nhien la " + random4);
        } else if (Math.abs(n - random4) < 0.0001) {
            System.out.println("so thuc bang so thuc ngau nhien la " + random4);
        } else {
            System.out.println("so thuc be hon so ngau nhien la " + random4);
        }
    }
}
