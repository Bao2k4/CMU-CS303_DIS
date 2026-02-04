/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec11_Encapsulation.FinalKeyword;

/**
 *
 * @author gamet
 */
public class FinalVariable {

    final int MAX = 100;

    void display() {
        System.out.println(MAX);
        // MAX = 200; // lỗi
    }
}
