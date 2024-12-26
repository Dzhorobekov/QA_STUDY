package Projects._3_;

public class ParkingSpot  {
    private int spotNumber;
    private boolean isOccupied;
    private Vehicle vehicle;

    public int getSpotNumber() {
        return spotNumber;
    }

    public ParkingSpot(int spotNumber) {
        this.spotNumber = spotNumber;
        this.isOccupied = false;


    }
    public boolean ParkingSpotIsOccupied(){
        return isOccupied;
    }

    public void assignVehicle(Vehicle vehicle){
        if (!isOccupied){
            this.vehicle = vehicle;
            isOccupied = true;
            vehicle.enterParking();
            System.out.println("Assigned spot # " + spotNumber + " to " + vehicle.type);
        }else {
            System.out.println("Spot number # " + spotNumber + " is already occupied. ");
        }
    }
    public void  removeVehicle(){
        if (isOccupied){
            vehicle.exitParking();
            vehicle = null;
            isOccupied = false;
            System.out.println("Spot number # " + spotNumber + " is now free! ");
        } else {
            System.out.println("Spot number # " + spotNumber + " is already free! ");
        }
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
