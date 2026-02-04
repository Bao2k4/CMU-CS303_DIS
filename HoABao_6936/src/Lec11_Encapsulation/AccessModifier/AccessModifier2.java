/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec11_Encapsulation.AccessModifier;

/**
 *
 * @author gamet
 */
public class AccessModifier2 extends AccessModifier1 {

    @Override
    public void display() {
        // System.out.println(pvt); // lỗi
        System.out.println(df);
        System.out.println(pro);
        System.out.println(pbl);
    }
}
