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
public class Lec5_GiaiPhuongTrinhBac2 {

    // Ham giai phuong trinh bac hai
    public static void giaiPhuongTrinhBacHai(float a, float b, float c) {
        float delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem.");
        } else if (delta == 0) {
            float x = -b / (2 * a);
            System.out.println("Phuong trinh co nghiem kep x = " + x);
        } else {
            // Trong Java, Math.sqrt tra ve kieu double nen ta ep kieu ve float
            float x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            float x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.println("Phuong trinh co hai nghiem phan biet:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, b, c;

        System.out.print("Nhap he so a: ");
        a = sc.nextFloat();
        System.out.print("Nhap he so b: ");
        b = sc.nextFloat();
        System.out.print("Nhap he so c: ");
        c = sc.nextFloat();

        if (a == 0) {
            System.out.println("Day khong phai la phuong trinh bac hai.");
        } else {
            giaiPhuongTrinhBacHai(a, b, c);
        }
        sc.close(); // Dong scanner sau khi dung xong
    }
}
