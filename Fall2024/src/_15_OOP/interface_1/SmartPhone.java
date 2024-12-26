package _15_OOP.interface_1;

public class SmartPhone implements Device{

    private String model;

    public SmartPhone(String model) {
        this.model = model;
    }

    @Override
    public void turnOn() {
        System.out.println(model + "phone turnON");
    }

    @Override
    public void turnOff() {
        System.out.println(model + "phone turnOFF");
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "model='" + model + '\'' +
                '}';
    }
}
