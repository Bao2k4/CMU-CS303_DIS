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
public class ArrayListAssigment_2 {
    public static void main(String[] args) {
        ArrayList<Double> soThuc = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
       

        for (int i = 0; i < 7; i++) {
            System.out.print("Nhap so thuc thu " + (i + 1) + ": ");
            double input = sc.nextDouble();
            soThuc.add(input); // Sử dụng phương thức .add() để lưu vào danh sách 
        }
        System.out.println("--- Danh sach vua nhap ---");
        for ( double so : soThuc) {
            System.out.println(so);
        }
    }
}
