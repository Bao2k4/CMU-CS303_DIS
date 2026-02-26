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
public class Processor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RoomList roomList = new RoomList();
        int next = 1;
        do {
            System.out.println("0. Exit program. "
                    + "\n1. Add a room "
                    + "\n2. Update a room. "
                    + "\n3. Find room by id. "
                    + "\n4. Delete a room."
                    + "\n5. Display all rooms."
                    + "\n6. Count each room individually.");
            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Exit program");
                    break;
                case 1:
                    System.out.print("Enter a MeetingRoom(1) /BedRoom(2): ");
                    switch (scanner.nextInt()) {
                        case 1:
                            MeetingRoom m = new MeetingRoom();
                            m.addRoom();
                            roomList.addRoom(m);
                            break;
                        case 2:
                            BedRoom b = new BedRoom();
                            b.addRoom();
                            roomList.addRoom(b);
                            break;
                    }
                    System.out.println("Success");
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.print("Enter id to update: ");
                    roomList.updateRoom(scanner.nextLine());
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.print("Enter a id to find: ");
                    roomList.findRoomById(scanner.nextLine());
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.print("Enter id to delete: ");
                    roomList.deleteRoom(scanner.nextLine());
                    System.out.println("Success");
                    break;
                case 5:
                    System.out.println("All rooms: ");
                    roomList.displayAllRooms();
                    break;
                case 6:
                    roomList.countRooms();
                    break;
                default:
            }
            if (choice == 0) {
                break;
            }
            System.out.println("Continue ? 1 yes / 0 no: ");
            next = scanner.nextInt();
        } while (next != 0);
    }
}
