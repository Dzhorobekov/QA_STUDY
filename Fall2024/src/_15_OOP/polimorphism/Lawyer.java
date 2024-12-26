package _15_OOP.polimorphism;

public class Lawyer extends Student {


    public Lawyer(String name, int age, String faculty, int course) {
        super(name, age, faculty, course);
    }

    public Lawyer(int id, String name) {
        super(id, name);
    }

    @Override
    public String toString() {
        return "Lawyer{" +
                "id='" + getId() +  '\'' +
                "course=" + course +
                ", faculty='" + faculty + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
