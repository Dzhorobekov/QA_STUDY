package _15_OOP.abstraction;

public abstract class Transport {

    public String brand;
    public String model;
    public String color;
    protected double speed;
    protected double capacity;

    public Transport(String brand, String model, String color, double speed, double capacity) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.speed = speed;
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public abstract String move();
}
