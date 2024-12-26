package _15_OOP.polimorphism;

public class Animal {

    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public String voice(){
        return "AAAAAAAAAAAAAAAAAAAAAAAAA";
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
