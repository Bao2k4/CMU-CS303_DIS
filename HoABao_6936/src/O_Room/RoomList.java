/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package O_Room;

import java.util.ArrayList;

/**
 *
 * @author gamet
 */
public class RoomList {

    ArrayList<Room> roomList = new ArrayList<>();

    public void addRoom(Room room) {
        roomList.add(room);
    }

    public void updateRoom(String id) {
        for (int i = 0; i < roomList.size(); i++) {
            if (roomList.get(i).getId().equals(id)) {
                roomList.get(i).updateRoom();
                return;
            }
        }
        System.out.println("Not found id: " + id);
    }

    public void deleteRoom(String id) {
        if (roomList.isEmpty()) {
            System.out.println("0 room");
            return;
        }
        for (int i = 0; i < roomList.size(); i++) {
            if (roomList.get(i).getId().equals(id)) {
                roomList.remove(i);
                return;
            }
        }
        System.out.println("Not found id: " + id);
    }

    public void findRoomById(String id) {
        for (int i = 0; i < roomList.size(); i++) {
            if (roomList.get(i).getId().equals(id)) {
                roomList.get(i).displayDetails();
                return;
            }
        }
        System.out.println("Not found id: " + id);
    }

    public void displayAllRooms() {
        for (Room room : roomList) {
            room.displayDetails();
        }
    }

    public void countRooms() {
        int numberOfMeetingRoom = 0;
        int numberOfBedRoom = 0;
        for (Room room : roomList) {
            if (room instanceof MeetingRoom) {
                numberOfMeetingRoom++;
            } else if (room instanceof BedRoom) {
                numberOfBedRoom++;
            }
        }
        System.out.println("MeetingRoom: " + numberOfMeetingRoom + "\nBedRoom: " + numberOfBedRoom);
    }
}
