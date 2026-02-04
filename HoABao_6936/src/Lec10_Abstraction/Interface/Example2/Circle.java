/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec10_Abstraction.Interface.Example2;

/**
 *
 * @author gamet
 */
public class Circle implements IShape, IColor {

    @Override
    public void drawShape() {
        System.out.println("Drawing a circle");
    }

    @Override
    public void fillColor() {
        System.out.println("Filling the circle with green");
    }
}
