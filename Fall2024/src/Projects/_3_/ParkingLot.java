package Projects._3_;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<ParkingSpot> spots;

    public ParkingLot(int totalSpots) {
        this.spots = new ArrayList<>();
        for (int i = 1; i <= totalSpots; i++){
            spots.add(new ParkingSpot(i));
        }
    }

    public void parkVehicle(Vehicle vehicle){
        for (ParkingSpot spot : spots){
            if (!spot.ParkingSpotIsOccupied()){
                spot.assignVehicle(vehicle);
                return;
            }
        }
        System.out.println("No available spots for " + vehicle.type);
    }

    public void exitVehicle(String CarLicencePlate){
        for (ParkingSpot spot:spots){
            Vehicle vehicle = spot.getVehicle();
            if (vehicle != null && vehicle.licencePlate.equals(CarLicencePlate)){
                spot.removeVehicle();
                return;
            }
        }
        System.out.println("Vehicle with licence plate " + CarLicencePlate + " not found.");
    }

    public void displayStatus(){
        for (ParkingSpot spot : spots){
            System.out.println("Spot number # " + spot.getSpotNumber() + (spot.ParkingSpotIsOccupied() ? " occupied by "
                    +spot.getVehicle().type : " FREE"));
        }
    }
}


