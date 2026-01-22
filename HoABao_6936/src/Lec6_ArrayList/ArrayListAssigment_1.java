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
public class ArrayListAssigment_1 {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Ban muon nhap bao nhieu ten? ");
        int n = sc.nextInt();
        sc.nextLine(); // Đọc bỏ dòng thừa

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap ho va ten thu " + (i + 1) + ": ");
            String input = sc.nextLine();
            names.add(input); // Sử dụng phương thức .add() để lưu vào danh sách 
        }
        System.out.println("--- Danh sach vua nhap ---");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
