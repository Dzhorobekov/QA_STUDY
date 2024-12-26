package _15_OOP.abstraction;

public abstract class Employee {

    public String fullName;
    public int dateOfBirth;
    private int id;
    protected String position;

    public Employee(String fullName, int dateOfBirth, int id, String position) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public abstract String responsibility();

    public String doReport(){
        return fullName + " 's reports";
    }
}

// abstract class;
// 1.abstract methods
// 2.regular methods

// [abstract class]  extends [class] -> implement methods
// [abstract method] -------[body method]

// [abstract class]  extends [abstract class]  extends [class]
// [abstract method] ------- [abstract method] ------- [body method]
