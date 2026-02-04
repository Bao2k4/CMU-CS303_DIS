/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec11_Encapsulation.StaticKeyword;

/**
 *
 * @author gamet
 */
public class Student {

    int id;
    String name;
    static String school = "DTU";

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    static void changeSchool() {
        school = "FPT";
    }

    void display() {
        System.out.println(id + " " + name + " " + school);
    }
}
