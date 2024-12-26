package _13_Collections.List.Arraylst1;

import java.util.ArrayList;

public class AL2 {
    public static void main(String[] args) {


        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Peach");
        fruits.add(1,"Pineapple");

        System.out.println(fruits);

        String red = "Cherry";
        ArrayList<String> berries = new ArrayList<>();
        berries.add("Strawberry");
        berries.add("blueberry");
        berries.add(red);
        berries.addAll(1,fruits);
        System.out.println(berries);
        System.out.println(berries.get(2));



        ArrayList<String> coffeeShop = new ArrayList<>();
        coffeeShop.add("Adriano");
        coffeeShop.add("Sierra");
        coffeeShop.add("Booblik");
        System.out.println(coffeeShop);

        ArrayList<String> coffeeShop2 = new ArrayList<>(coffeeShop);
        coffeeShop2.addAll(coffeeShop);
        System.out.println(coffeeShop2);




    }
}
