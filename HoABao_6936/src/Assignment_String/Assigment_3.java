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
public class Assigment_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        System.out.println("Chuoi dao nguoc: " + sb.reverse());
    }
}
