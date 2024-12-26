package _15_OOP.polimorphism;

public class StudentMain {
    public static void main(String[] args) {


        Student student = new Student(128952,"James");
        System.out.println(student);
        System.out.println(student.passTheExam("History"));
        System.out.println(student.passTheExam("History", 87));
        Lawyer lawyer = new Lawyer("John", 25,"Lawyer", 4);
        System.out.println(lawyer);
        System.out.println(lawyer.passTheExam("Constitution"));
        System.out.println(lawyer.passTheExam("Constitution", 59));



    }
}
