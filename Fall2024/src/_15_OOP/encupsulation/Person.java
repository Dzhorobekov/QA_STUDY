package _15_OOP.encupsulation;

public class Person {

    public String name;
    protected String fullName;
    int age;
    private int id;

    public Person(String name, String fullName, int age, int id) {
        this.name = name;
        this.fullName = fullName;
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
//getter - должен быть return method
    public int getId(){
        return id;
    }
//setter - должен быть void method
    public void setId(int newId){
        this.id = newId;

    }
}
