package _15_OOP.abstraction;

public class TransportMain {
    public static void main(String[] args) {

        Vehicle bmw = new Vehicle("BMW", "X7", "White", 120, "4.5", "gazoline");
        Plane boeing = new Plane("Boeing", "747", "White", 900, 20000, "kerosine", 5000);
        Ship boat = new Ship("Andromeda", "X777", "Black", 20, 50000, 70000);

        System.out.println(bmw.move());
        System.out.println(boeing.move());
        System.out.println(boat.move());

    }
}
