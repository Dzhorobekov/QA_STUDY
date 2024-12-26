package _15_OOP;

public class Actress {

    public String name;
    public int age;
    public boolean oscar;
    public String movie;


    public Actress(String herName, int herAge, boolean herOscar){
        name =  herName;
        age = herAge;
        oscar = herOscar;
    }

    public Actress (String herName, int herAge ){
        name = herName;
        age = herAge;
    }

    public Actress(int herAge, String herName){
        age = herAge;
        name = herName;
    }
    public Actress (String herName ) {
        name = herName;
    }

    public Actress(String herName, String herMovie, boolean herOscar) {
    name = herName;
    movie = herMovie;
    oscar = herOscar;
    }
     public Actress(String herName, String herMovie){
        name = herName;
        movie = herMovie;
     }



    public String hasOscar(){
        if (oscar){
            return  "Has oscar";
        }
        else {
            return " has nor Oscar";
        }
    }

    @Override
    public String toString() {
        return "Actress{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", oscar=" + oscar +
                '}';
    }



}

// Class:
//1.fields  -> 1.variable,        2.object
//2.methods -> 1.custom methods,  2.constructor/special methods

