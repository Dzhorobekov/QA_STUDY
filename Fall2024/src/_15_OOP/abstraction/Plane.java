package _15_OOP.abstraction;

public class Plane extends Transport{

    private double rangeKM;

    public Plane(String brand, String model, String color, double speed, double capacity, String fuel, double rangeKM) {
        super(brand, model, color, speed, capacity);
        this.rangeKM = rangeKM;
    }


    @Override
    public String move() {
        return "The plane" + model + "is flying with " + speed + "KM";
    }
}
