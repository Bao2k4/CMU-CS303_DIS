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
public class Truck extends Vehicle{
    private double loadCapacity;
    private double distance;

    public Truck() {
    }

    public Truck(double loadCapacity, double distance) {
        this.loadCapacity = loadCapacity;
        this.distance = distance;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
    
        Scanner scanner = new Scanner(System.in);

    
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println(" loadCapacity=" + getLoadCapacity()+ ", distance=" + getDistance());
    }
    
     @Override
    public void addVehicle(){
        super.addVehicle();
        System.out.println("loadCapacity: ");
        setLoadCapacity(scanner.nextDouble());
        System.out.println("distance: ");
        setDistance(scanner.nextDouble());
    }
    
    @Override
    public void updateVehicle(){
        super.updateVehicle();
        System.out.println("loadCapacity: ");
        setLoadCapacity(scanner.nextDouble());
        System.out.println("distance: ");
        setDistance(scanner.nextDouble());
    }
    
}
