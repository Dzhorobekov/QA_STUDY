package _15_OOP.abstraction;

public class Vehicle extends Transport{

    public String fuel;

    public Vehicle(String brand, String model, String color, double speed, String capacity, String fuel) {
        super(brand, model, color, speed, Double.parseDouble(capacity));
        this.fuel = fuel;
    }


    @Override
    public String move() {
        return "The vehicle" + model + "is moving with the speed of " + speed + "KM/H";
    }


}
