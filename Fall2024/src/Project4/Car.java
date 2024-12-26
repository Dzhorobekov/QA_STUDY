package Project4;

public class Car implements Transport, Passenger{
    public String brand;
    public String model;
    public double fuelEfficiency;
    private int passengerCapacity;
    private int passengerOnBoard;

    public Car(String brand, String model, double fuelEfficiency, int passengerCapacity) {
        this.brand = brand;
        this.model = model;
        this.fuelEfficiency = fuelEfficiency;
        this.passengerCapacity = passengerCapacity;
        this.passengerOnBoard = 0;
    }

    @Override
    public void start() {
        System.out.println("the " + model + " is started");
    }

    @Override
    public void stop() {
        System.out.println("the " + model + " is stopped");

    }

    @Override
    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public void setBoardPassengers(int count){
        if (passengerOnBoard + count >= passengerCapacity){
            passengerOnBoard += count;
            System.out.println(count + " passengers got in to the " + model );
        }
        else {
            System.out.println("there is bot enough place in the " + model + " for " + count + " passengers!");
        }
    }


    public void setDisembarkPassengers(){
        System.out.println("there are " + passengerOnBoard + " passengers got out " + model);
        passengerOnBoard = 0;
    }
}
