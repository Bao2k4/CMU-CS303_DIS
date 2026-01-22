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
public class Assignment {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        //bai tap 1
//        int random1 = rand.nextInt(101);
//        System.out.println(random1);

//        bai tap 2
//        double random2 = rand.nextDouble() * 6.2 + 1.8;
//        System.out.println(random2);
//        bai tap 3
//        int random3 = rand.nextInt(80 - 3 + 1) + 3;
//        if (random3 % 2 == 0) {
//            System.out.println(random3 + " la so chan!");
//        } else {
//            System.out.println(random3 + " la so le!");
//        }
//        
        ////         bai tap 4
//        double n;
//        double random4 = rand.nextDouble() * 99.0 + 1.0;
//        do {
//            System.out.println("Nhap so tu (1-100) :");
//            n = scanner.nextDouble();
//        } while (n > 100 || n < 1);
//        if (n > random4) {
//            System.out.println("so thuc lon hon so thuc ngau nhien la " + random4);
//        } else if (Math.abs(n - random4) < 0.0001) {
//            System.out.println("so thuc bang so thuc ngau nhien la " + random4);
//        } else {
//            System.out.println("so thuc be hon so ngau nhien la " + random4);
//        }
//        
////        bai tap 5
//        int random5 = rand.nextInt(10) + 1;
//        int count = 0;
//        int guess;
//
//        do {
//            System.out.print("Nhap so (1-10): ");
//            guess = scanner.nextInt();
//            count++;
//        } while (guess != random5);
//
//        System.out.println("Dung roi!");
//        System.out.println("So lan doan: " + count);
        
//        bai tap 6
//        int random6 = rand.nextInt(100) + 1;
//        int guess6;
//
//        while (true) {
//            System.out.print("Nhap so du doan (1-100): ");
//            guess6 = scanner.nextInt();
//
//            if (guess6 == random6) {
//                System.out.println("Chuc mung!");
//                break;
//            } else if (guess6 < random6) {
//                System.out.println("Lon hon");
//            } else {
//                System.out.println("Nho hon");
//            }
//        }
        
        //bai tap  6
//        System.out.print("Nhap so  :");
//        int b = scanner.nextInt();
//        int tong = 0;
//        for(int i=1;i<= n;i++){
//            tong += i;
//        }
//        System.out.println("Tong cáco tu 1 - n la :"+tong);
        
        //bai tap 7 
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
