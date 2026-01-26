/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec5_Assignment;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author gamet
 */
public class baiTap_1 {

    // a. Hiển thị mảng
    public static void hienThi(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    // b. Đảo ngược mảng
    public static void daoNguoc(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }
    }

    // c. Hiển thị số chẵn
    public static void hienThiChan(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
    }

    // d. Tổng các số chia hết cho 3 và 5
    public static int tongChiaHet3va5(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 3 == 0 && a[i] % 5 == 0) {
                sum += a[i];
            }
        }
        return sum;
    }

    // e. Sắp xếp tăng dần
    public static void sapXepTang(int[] a) {
        Arrays.sort(a);
    }

    // f. Sắp xếp giảm dần
    public static void sapXepGiam(int[] a) {
        Arrays.sort(a);
        for (int i = 0; i < a.length / 2; i++) {
            int t = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = t;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        System.out.print("\nMang ban dau: ");
        hienThi(a);

        daoNguoc(a);
        System.out.print("Mang sau khi dao: ");
        hienThi(a);

        System.out.print("Cac so chan: ");
        hienThiChan(a);

        System.out.println("Tong so chia het cho 3 va 5: " + tongChiaHet3va5(a));

        sapXepTang(a);
        System.out.print("Mang tang dan: ");
        hienThi(a);

        sapXepGiam(a);
        System.out.print("Mang giam dan: ");
        hienThi(a);
    }
}
