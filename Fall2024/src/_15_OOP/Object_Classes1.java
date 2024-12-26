package _15_OOP;

import java.util.Arrays;

public class Object_Classes1 {
    public static void main(String[] args) {


        String str = new String("Hello");
        Fruits orange = new Fruits();
        Fruits apple = new Fruits();
        Fruits peach = new Fruits();


        int num = 90;
        System.out.println(num);


        Car toyota = new Car();
        System.out.println(toyota);
        System.out.println(toyota.color);

        toyota.color = "Green"; // тут мы переназначили
        System.out.println(toyota.color); // тут вызвали только цвет
        System.out.println(toyota); // тут мы вызвали все
        System.out.println(toyota.model);

        System.out.println(toyota.mark);

        Car camry = new Car();
        camry.model = "Camry";
        camry.year = 2020;
        Car windom = new Car();
        windom.model = "Windom";
        windom.year = 2019;
        Car prada = new Car();
        prada.model = "Prada";
        prada.year = 2023;

        System.out.println(camry);
        System.out.println("_________________");
        System.out.println(windom);
        System.out.println("_________________");
        System.out.println(prada);


    }
}
