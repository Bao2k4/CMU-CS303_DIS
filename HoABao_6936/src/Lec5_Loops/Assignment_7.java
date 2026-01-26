/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec5_Loops;

import java.util.Scanner;

/**
 *
 * @author gamet
 */
public class Assignment_7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so  :");
        int n = scanner.nextInt();
        int tong = 0;
        for (int i = 1; i <= n; i++) {
            tong += i;
        }
        System.out.println("Tong cáco tu 1 - n la :" + tong);
    }
}
