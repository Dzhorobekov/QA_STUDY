package _15_OOP.polimorphism;

public class Student {
    private int id;
    public String name;
    protected int age;
    public String faculty;
    public int course;

    public Student(String name, int age, String faculty, int course) {
        this.name = name;
        this.age = age;
        this.faculty = faculty;
        this.course = course;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(int id, String faculty, int course) {
        this.id = id;
        this.faculty = faculty;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public char getMark(int point){
        char mark;
        if (point <= 100 && point >= 85){
            mark = 'A';
        }else if (point <= 84 && point >= 60){
            mark = 'B';
        }else if (point <= 59 && point >= 45) {
            mark = 'C';
        }else if (point <= 44 && point >= 10) {
            mark = 'D';
        }
        else {
            mark = '0';
        }
        return mark;
    }

    public String passTheExam(String lesson){
        return "The exam of " + lesson + " passed ";
    }
    public String passTheExam(String lesson, int point){
        return "Exam of " + lesson + " passed\n "
                + "ExamPoint: " + point + "\n"
                + "Exam mark: " + getMark(point);
    }



    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                '}';
    }
}







