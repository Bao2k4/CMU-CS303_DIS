/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec11_Encapsulation.FinalKeyword;

/**
 *
 * @author gamet
 */
class Parent {

    final void display() {
        System.out.println("This is final method");
    }
}

class Child extends Parent {
    // void display() { } // lỗi
}
