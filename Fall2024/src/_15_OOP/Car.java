package _15_OOP;

public class Car {

    public  String mark = "toyota";
    public String model = "High lander";
    public String color = "white";
    public int year = 2018;

    @Override
    public String toString() {
        return "Car : \n" +
                "\nmark: \t" + mark + '\'' +
                " \nmodel: \t" + model + '\'' +
                " \nyear: \t" + year +
                " \ncolor: \t" + color;

    }
}

