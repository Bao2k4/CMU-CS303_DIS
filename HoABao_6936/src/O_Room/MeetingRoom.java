/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package O_Room;

import java.util.Scanner;

/**
 *
 * @author gamet
 */
public class MeetingRoom extends Room {

    private int capacity;

    public MeetingRoom() {
    }

    public MeetingRoom(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void addRoom() {
        super.addRoom();
        System.out.print("capacity: ");
        setCapacity(scanner.nextInt());
    }

    @Override
    public void updateRoom() {
        super.updateRoom();
        System.out.print("capacity: ");
        setCapacity(scanner.nextInt());
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(", capacity: " + getCapacity());
    }

}
