package _15_OOP;

public class ActorMain {
    public static void main(String[] args) {

        Actor Leonardo = new Actor();
        Leonardo.name = "Leonardo Di Caprio";
        Leonardo.age = 50;
        Leonardo.country = "Hollywood";
        Leonardo.oscar = true;
        System.out.println(Leonardo);

        Leonardo.toPlayPositiveRole();
        Leonardo.toPlayNegativeRole();
        Leonardo.hasOscar(Leonardo.oscar);
        System.out.println(Leonardo.hasOscar(Leonardo.oscar));






    }
}
