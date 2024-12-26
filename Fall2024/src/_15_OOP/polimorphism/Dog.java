package _15_OOP.polimorphism;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public String voice() {
        return "Bark-Bark, Nigga!";
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
