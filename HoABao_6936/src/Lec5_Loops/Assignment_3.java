/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec5_Assignment;

import java.util.Random;

/**
 *
 * @author gamet
 */
public class Assignment_3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int random3 = rand.nextInt(80 - 3 + 1) + 3;
        if (random3 % 2 == 0) {
            System.out.println(random3 + " la so chan!");
        } else {
            System.out.println(random3 + " la so le!");
        }
    }
}
