package _15_OOP.inheritance;

public class Dad {

    public String name;
    public int age;
    protected String eyes;
    private String talent;


    public Dad(String name, int age, String eyes, String talent) {
        this.name = name;
        this.age = age;
        this.eyes = eyes;
        this.talent = talent;
    }

    public String getTalent() {
        return talent;
    }

    public void setTalent(String talent) {
        this.talent = talent;
    }

    public String getEyes() {
        return eyes;
    }

    public void setEyes(String eyes) {
        this.eyes = eyes;
    }
    public String toFun(){
        return "Let's go.........., Давай пойдем туда лалалалал";
    }

    @Override
    public String toString() {
        return "Dad{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", eyes='" + eyes + '\'' +
                ", talent='" + talent + '\'' +
                '}';
    }
}

