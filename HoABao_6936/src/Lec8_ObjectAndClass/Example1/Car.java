/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec8_ObjectAndClass.Example1;

/**
 *
 * @author gamet
 */
// Class declaration
public class Car {

    // Data fields (instance variables)
    private String model;
    private int year;
    // Constructor to initialize the Car object

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
    // Method to display car details

    public void displayDetails() {
        System.out.println("Car Model: " + model + ", Year: " + year);
    }
}
