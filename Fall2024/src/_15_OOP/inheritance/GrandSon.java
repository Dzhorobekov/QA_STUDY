package _15_OOP.inheritance;

public class GrandSon extends Son{
    public GrandSon(String name, int age, String eyes, String talent){
        super(name, age, eyes, talent);
    }

    @Override
    public String toString() {
        return "GrandSon{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", eyes='" + eyes + '\'' +
                '}';
    }
}
