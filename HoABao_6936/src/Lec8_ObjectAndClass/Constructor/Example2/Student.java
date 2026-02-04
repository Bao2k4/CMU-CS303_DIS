/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec8_ObjectAndClass.Constructor.Example2;

/**
 *
 * @author gamet
 */
public class Student {

    int id;
    String name;
    int age;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    Student(int id, String name, int age) {
        this(id, name); // gọi constructor 2 tham số
        this.age = age;
    }

    void display() {
        System.out.println(id + " " + name + " " + age);
    }
}
