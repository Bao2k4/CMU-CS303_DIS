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
public class Assigment_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s = sc.nextLine();
        System.out.print("Tu can thay: ");
        String oldWord = sc.nextLine();
        System.out.print("Tu thay the: ");
        String newWord = sc.nextLine();

        String result = s.replace(oldWord, newWord);
        System.out.println("Chuoi moi: " + result);
    }
}
