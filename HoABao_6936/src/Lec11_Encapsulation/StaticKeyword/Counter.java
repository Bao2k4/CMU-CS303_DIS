/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec11_Encapsulation.StaticKeyword;

/**
 *
 * @author gamet
 */
public class Counter {

    static int count = 0;

    Counter() {
        count++;
        System.out.println(count);
    }
}
