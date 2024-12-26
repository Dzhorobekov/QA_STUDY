package Project4;

public class Plane implements Transport, Passenger, Cargo{

    public String model;
    public double fuelEfficiency;
    private int passengersCapacity;
    private int passengersOnBoard;
    private double cargoCapacity;
    private double cargoLoad;

    public Plane(String model, double fuelEfficiency, int passengersCapacity, int passengersOnBoard, double cargoCapacity, double cargoLoad) {
        this.model = model;
        this.fuelEfficiency = fuelEfficiency;
        this.passengersCapacity = passengersCapacity;
        this.passengersOnBoard = passengersOnBoard;
        this.cargoCapacity = cargoCapacity;
        this.cargoLoad = cargoLoad;
    }

    @Override
    public void start() {
        System.out.println(model + " takes off ");
    }

    @Override
    public void stop() {
        System.out.println(model + " lands ");
    }

    @Override
    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    @Override
    public void loadCargo(double weight) {
//        if ()
//        System.out.println("the aircraft " + model + " load " + weight + " kg of cargo");
        passengersOnBoard = 0;

    }

    @Override
    public void unloadCargo() {

    }

    @Override
    public void setBoardPassengers(int count){
        if (passengersOnBoard + count >= passengersOnBoard){
            passengersOnBoard += count;
                System.out.println(count + " passengers got in to the " + model );
            }
            else {
                System.out.println("there is bot enough place in the " + model + " for " + count + " passengers!");
            }
        }

    @Override
    public void setDisembarkPassengers(){
        System.out.println("the aircraft " + model + );
        passengersOnBoard = 0;
    }
}
