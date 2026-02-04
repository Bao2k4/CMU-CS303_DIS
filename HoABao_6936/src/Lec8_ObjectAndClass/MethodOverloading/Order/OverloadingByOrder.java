/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec8_ObjectAndClass.MethodOverloading.Order;

/**
 *
 * @author gamet
 */
public class OverloadingByOrder {

    public static void printInfo(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void printInfo(int age, String name) {
        System.out.println("Age: " + age + ", Name: " + name);
    }
}
