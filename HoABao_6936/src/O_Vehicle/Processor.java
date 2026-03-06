package O_Vehicle;

import O_Room.RoomList;
import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        VehicleList vehicleList = new VehicleList();
        Scanner scanner = new Scanner(System.in);
        int next = 1;
        do {
            System.out.println("0. Exit \n"
                    + "1. Add a car . \n"
                    + "2. Update vehicle by ID \n"
                    + "3. Delete vehicle by ID \n"
                    + "4. Find vehicle by ID \n"
                    + "5. Display all vehicles. \n"
                    + "6. Count number of truck, number of car. \n");
            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Exit program. ");
                    break;
                case 1:
                    System.out.println("Enter a Car(1) / a Truck(2)");
                    switch (scanner.nextInt()) {
                        case 1:
                            Car c = new Car();
                            c.addVehicle();
                            vehicleList.addVehicle(c);
                            break;
                        case 2:
                            Truck t = new Truck();
                            t.addVehicle();
                            vehicleList.addVehicle(t);
                            break;
                    }
                    System.out.println("Success");
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.println("Enter a Update: ");
                    vehicleList.updateVehicleById(scanner.nextLine());
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.println("Enter a delete: ");
                    vehicleList.deleteVehicleById(scanner.nextLine());
                    System.out.println("Success ");
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.println("Enter a find: ");
                    vehicleList.findVehicleById(scanner.nextLine());
                    break;
                case 5:
                    System.out.println("All vehicle: ");
                    vehicleList.displayAllVehicles();
                    break;
                case 6:
                    vehicleList.countTrucksAndCountCars();
                    break;
                default:               
            }
            if(choice == 0){
                break;
            }
            System.out.println("Continue ? Yes(1) / No(0): ");
            scanner.nextInt();
        } while (next != 0);
    }
}
