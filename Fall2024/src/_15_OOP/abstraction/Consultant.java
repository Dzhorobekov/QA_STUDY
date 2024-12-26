package _15_OOP.abstraction;

public abstract class Consultant extends Employee{
    public Consultant(String fullName, int dateOfBirth, int id, String position) {
        super(fullName, dateOfBirth, id, position);
    }

    public abstract String departmentOfConsultation();
}
