/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec9_InheritanceAndPolymorphism.MethodOveridding;

/**
 *
 * @author gamet
 */
public class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Barks barks");
    }
}
