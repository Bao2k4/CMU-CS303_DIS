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
public class Assignment_6 {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int random6 = rand.nextInt(100) + 1;
        int guess6;

        while (true) {
            System.out.print("Nhap so du doan (1-100): ");
            guess6 = scanner.nextInt();

            if (guess6 == random6) {
                System.out.println("Chuc mung!");
                break;
            } else if (guess6 < random6) {
                System.out.println("Lon hon");
            } else {
                System.out.println("Nho hon");
            }
        }
    }
}
