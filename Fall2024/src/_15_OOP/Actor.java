package _15_OOP;

public class Actor {

    public String name;
    public int age;
    public String country;
    public boolean oscar;

    public String toPlayPositiveRole(){
        return "Positive playing...";

    }
    public String toPlayNegativeRole(){
        return "Negative playing...";

    }
    public String hasOscar(boolean result){
        if (oscar == true){
            return "Super star";
        }
        else {
            return "Regular hurd";
        }
    }
    public String toString(){
        return "_______________________\n"
                + "Name : \t\t " + name + "\n"
                + "Age: \t\t " + age + "\n"
                + "Country: \t " + country + "\n"
                + "Oscar: \t\t " + oscar + "\n";
    }

}
