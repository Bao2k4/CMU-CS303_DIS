/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec5_Assignment;

import java.util.Scanner;

/**
 *
 * @author gamet
 */
public class Assignment_8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dem = 0;
        System.out.println("Nhap so :");
        int n = scanner.nextInt();

        System.out.println("Cac so chia het cho 3 và 5 la: ");
        for (int i = 1; i <= n; i++) {
            // Kiểm tra điều kiện chia hết cho cả 3 và 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " ");
                dem++;
            }
        }
        System.out.println("tong cong co :" + dem + " so ");
    }
}
