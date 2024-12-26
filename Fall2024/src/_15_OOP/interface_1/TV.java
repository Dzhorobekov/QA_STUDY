package _15_OOP.interface_1;

public class TV implements Device {
    public String brand;


    public TV(String brand){
        this.brand = brand;
    }

    @Override
    public void turnOn() {
        System.out.println(brand + "TV turnOn with socket + (" + SOCKET + ")");
    }

    @Override
    public void turnOff() {
        System.out.println(brand + "TV turnOff");
    }

    @Override
    public String toString() {
        return "TV{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
