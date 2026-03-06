/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package O_Vehicle;

import java.util.Scanner;

/**
 *
 * @author gamet
 */
public class Car extends Vehicle{
    private int numberOfSeats;
    private String fuelType;

    public Car() {
    }

    public Car(int numberOfSeats, String fuelType) {
        this.numberOfSeats = numberOfSeats;
        this.fuelType = fuelType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
    
    Scanner scanner = new Scanner(System.in);
    
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("numberOfSeats=" + getNumberOfSeats() + ", fuelType=" + getFuelType());
    }
    
    @Override
    public void addVehicle(){
        super.addVehicle();
        System.out.println("numberOfSeats: ");
        setNumberOfSeats(scanner.nextInt());
        System.out.println("fuelType: ");
        setFuelType(scanner.nextLine());
    }
    
    @Override
    public void updateVehicle(){
        super.updateVehicle();
        System.out.println("numberOfSeats: ");
        setNumberOfSeats(scanner.nextInt());
        System.out.println("fuelType: ");
        setFuelType(scanner.nextLine());
    }
}
