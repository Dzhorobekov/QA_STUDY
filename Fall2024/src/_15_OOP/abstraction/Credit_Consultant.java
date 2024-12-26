package _15_OOP.abstraction;

public class Credit_Consultant extends Consultant{

    public Credit_Consultant(String fullName, int dateOfBirth, int id, String position) {
        super(fullName, dateOfBirth, id, position);
    }

    @Override
    public String responsibility() {
        return "Do consultation....";
    }

    @Override
    public String departmentOfConsultation() {
        return "Credit department";
    }
}
