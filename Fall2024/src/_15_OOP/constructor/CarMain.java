package _15_OOP.constructor;

public class CarMain {
    public static void main(String[] args) {


        Car obj = new Car("Black");

        Car bmw = new Car("BMW", "M5");
        System.out.println(bmw.toDrive());

        Car noting = new Car();
        System.out.println(noting.noActions());


    }
}
