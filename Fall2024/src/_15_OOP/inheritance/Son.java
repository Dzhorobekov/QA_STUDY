package _15_OOP.inheritance;

public class Son  extends Dad {


    public Son(String name, int age, String eyes, String talent) {
        super(name, age, eyes, talent);
    }

    @Override
    public String toString() {
        return "Son{" +
                "name='" + name + '\'' +
                ", age=" + age + '\'' +
                "eyes='" + eyes + '\'' +
                ", talent='" + getTalent() + '\'' +
                '}';
    }
}

//           Dad        Son
// parent class -> super class
// child class  -> sub class

