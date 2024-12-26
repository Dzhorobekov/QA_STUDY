package _15_OOP.abstraction;

public class Manager extends Employee {
    public Manager(String fullName, int dateOfBirth, int id, String position) {
        super(fullName, dateOfBirth, id, position);
    }

    @Override
    public String responsibility() {
        return "to manage employees ";
    }
}
