/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec6_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gamet
 */
public class Assigment_4 {

    // A. Hiển thị tất cả giá trị
    static void hienThi(ArrayList<Integer> a) {
        System.out.println("Danh sách: " + a);
    }

    // B. Hiển thị số chẵn và index, đếm số lượng
    static void soChanVaIndex(ArrayList<Integer> a) {
        int dem = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) % 2 == 0) {
                System.out.println("Giá trị: " + a.get(i) + " tại index: " + i);
                dem++;
            }
        }
        System.out.println("Tổng số chẵn: " + dem);
    }

    // C. Tính tổng các phần tử
    static int tinhTong(ArrayList<Integer> a) {
        int sum = 0;
        for (int x : a) {
            sum += x;
        }
        return sum;
    }

    // D. Xóa giá trị nhập từ bàn phím
    static void xoaGiaTri(ArrayList<Integer> a, int x) {
        if (a.remove(Integer.valueOf(x))) {
            System.out.println("Danh sách sau khi xóa: " + a);
        } else {
            System.out.println("Không tìm thấy giá trị cần xóa.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        // Nhập mảng động
        System.out.print("Nhập số phần tử: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử " + i + ": ");
            arr.add(sc.nextInt());
        }

        // Gọi hàm
        System.out.println("\nA.");
        hienThi(arr);

        System.out.println("\nB.");
        soChanVaIndex(arr);

        System.out.println("\nC. Tổng = " + tinhTong(arr));

        System.out.print("\nD. Nhập giá trị cần xóa: ");
        int x = sc.nextInt();
        xoaGiaTri(arr, x);
    }
}
