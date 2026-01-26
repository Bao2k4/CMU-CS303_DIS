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
public class Assignment_5 {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int random5 = rand.nextInt(10) + 1;
        int count = 0;
        int guess;
        do {
            System.out.print("Nhap so (1-10): ");
            guess = scanner.nextInt();
            count++;
        } while (guess != random5);

        System.out.println("Dung roi!");
        System.out.println("So lan doan: " + count);
    }
}
