public class Car {

    String brand;
    String color;

    public void drive(){
        System.out.println("Я могу ехать");
    }

    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public static void main(String[] args) {

        Car car= new Car("BMW", "green");

    }
}
