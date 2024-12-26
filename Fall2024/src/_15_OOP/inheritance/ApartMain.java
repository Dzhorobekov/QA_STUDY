package _15_OOP.inheritance;

public class ApartMain {
    public static void main(String[] args) {


        Apartment apartment = new Apartment(79, 27, 34);
        System.out.println(apartment);
        System.out.println(apartment.renovation("Kitchen", apartment.kitchen));

        PentHouse pentHouse = new PentHouse(99, 47, 56, 74, 50);
        System.out.println(pentHouse.renovation("Bedroom", pentHouse.bedroom));

    }
}
