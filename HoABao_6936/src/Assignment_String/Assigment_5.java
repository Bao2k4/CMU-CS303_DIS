/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_String;

import java.util.Scanner;

/**
 *
 * @author gamet
 */
public class Assigment_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s = sc.nextLine();
        System.out.print("Nhap ky tu: ");
        char c = sc.next().charAt(0);

        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == c) {
                count++;
            }
        }
        System.out.println("So lan xuat hien: " + count);
    }
}
