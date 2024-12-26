package _15_OOP.abstraction;

public class Ship extends Transport{
    public double tonnage;

    public Ship(String brand, String model, String color, double speed, double capacity, double tonnage) {
        super(brand, model, color, speed, capacity);
        this.tonnage = tonnage;
    }

    @Override
    public String move() {
        return "The ship " + model + "is going with " + speed + " knots ";
    }
}
