package _15_OOP.polimorphism;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }
    public String voice(){
        return "Meow-Meow";
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
