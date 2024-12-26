package _15_OOP.constructor;

public class Car {


    public String brand;
    public String model;
    private String color;

    public Car(String color) {
        this.color = color;
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String toDrive(){
        return "Vroom vroom....";
    }
    public String noActions(){
        return  null;
    }

    public Car(){

    }
    //default constructor (empty) -> java
    //default constructor (empty) -> user
}
