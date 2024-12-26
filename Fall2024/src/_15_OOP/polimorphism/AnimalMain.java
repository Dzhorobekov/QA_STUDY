package _15_OOP.polimorphism;

public class AnimalMain {
    public static void main(String[] args) {

        Animal animal = new Animal("Limpopo");
        System.out.println(animal);
        System.out.println(animal.voice());
        Cat cat = new Cat("Kate");
        System.out.println(cat);
        System.out.println(cat.voice());
        Dog dog = new Dog("Rex");
        System.out.println(dog);
        System.out.println(dog.voice());

    }
}
