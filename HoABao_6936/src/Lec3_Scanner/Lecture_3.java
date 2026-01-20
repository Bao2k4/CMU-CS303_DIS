/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec3_Scanner;
import java.util.Scanner;
/**
 *
 * @author gamet
 */
public class Lecture_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ho va ten : ");
        String hoVaTen = scanner.nextLine();
        System.out.print("Nhap  mssv :");
        int studentID = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap hometown : ");
        String Hometown = scanner.nextLine();
        System.out.print("Nhap gpa : ");
        double gpa = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Nhap mayjor : ");
        String mayjor = scanner.nextLine();
        System.out.print("Nhap Scholarship : ");
        boolean Scholarship = scanner.nextBoolean();
        System.out.println(hoVaTen);
        System.out.println(studentID);
        System.out.println(Hometown);
        System.out.println(gpa);
        System.out.println(mayjor);
        System.out.println(Scholarship);
    }
}
