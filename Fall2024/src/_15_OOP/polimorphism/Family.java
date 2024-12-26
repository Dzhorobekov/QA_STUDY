package _15_OOP.polimorphism;

public class Family {
    private String name;
    private int age;
    private String bloodGroup;

    public void cookPlov(String ingridient1, String ingridient2, String ingridient3){
        System.out.println("Mix: " + ingridient1 + " " + ingridient2 + " " + ingridient3);
    }
    public void cookPlov(String ingridient1, String ingridient2, String ingridient3, String ingridient4){
        System.out.println("Mix: " + ingridient1 + " " + ingridient2 + " " + ingridient3 + " " + ingridient4);

    }

    public Family(String bloodGroup, int age, String name) {
        this.bloodGroup = bloodGroup;
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    @Override
    public String toString() {
        return "Family{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", bloodGroup='" + bloodGroup + '\'' +
                '}';
    }
}

