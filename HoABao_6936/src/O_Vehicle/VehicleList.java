package O_Vehicle;

import java.util.ArrayList;

public class VehicleList {

    ArrayList<Vehicle> vehicleList = new ArrayList<>();

    public void addVehicle(Vehicle Vehicle) {
        vehicleList.add(Vehicle);
    }

    public void updateVehicleById(String id) {
        for (int i = 0; i < vehicleList.size(); i++) {
            if (vehicleList.get(i).getId().equals(id)) {
                vehicleList.get(i).addVehicle();
                return;
            }
        }
        System.out.println("Id not found: " + id);
    }

    public void deleteVehicleById(String id) {
        if (vehicleList.isEmpty()) {
            System.out.println("0 vehicle ");
            return;
        }
        for (int i = 0; i < vehicleList.size(); i++) {
            if (vehicleList.get(i).getId().equals(id)) {
                vehicleList.remove(i);
                return;
            }
        }
        System.out.println("Id not found: " + id);
    }

    public void findVehicleById(String id) {
        for (int i = 0; i < vehicleList.size(); i++) {
            if (vehicleList.get(i).getId().equals(id)) {
                vehicleList.get(i).displayDetails();
                return;
            }
        }
        System.out.println("Id not found: " + id);
    }

    public void displayAllVehicles() {
        for (Vehicle vehicle : vehicleList) {
            vehicle.displayDetails();
        }
    }
    
    public void countTrucksAndCountCars(){
        int numberOfTruck = 0;
        int numberOfCar = 0;
         for (Vehicle vehicle : vehicleList) {
             if(vehicle instanceof Truck){
                 numberOfTruck++;
             }else if(vehicle instanceof Car){
                 numberOfCar++;
             }
        }
        System.out.println("numberOfTruck: " + numberOfTruck +", numberOfCar: "+ numberOfCar);
    }
}
