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
public class ArrayListAssigment_3 {

    public static void main(String[] args) {
        ArrayList<Integer> So = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Ban muon nhap bao nhieu so nguyen? ");
        int n = sc.nextInt();
        sc.nextLine(); // Đọc bỏ dòng thừa

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap so nguyen thu " + (i + 1) + ": ");
            int input = sc.nextInt();
            So.add(input); // Sử dụng phương thức .add() để lưu vào danh sách 
        }
        System.out.println("--- Danh sach vua nhap ---");
        for (int so : So) {
            if (so % 2 != 0) {
                System.out.println(so);
            }
        }
    }
}
