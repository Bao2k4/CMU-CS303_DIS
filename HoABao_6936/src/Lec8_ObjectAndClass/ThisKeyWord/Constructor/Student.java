/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec8_ObjectAndClass.ThisKeyWord.Constructor;

/**
 *
 * @author gamet
 */
public class Student {

    int id;
    String name;

    Student() {
        System.out.println("default constructor is invoked");
    }

    public Student(int id, String name) {
        this(); // it is used to invoked current class constructor 
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student e1 = new Student(111, "karan");
        Student e2 = new Student(222, "Aryan");
        e1.display();
        e2.display();

    }
}
