package _15_OOP.polimorphism;

public class Mather extends Family{

    public Mather(String bloodGroup, int age, String name) {
        super(bloodGroup, age, name);
    }

    @Override
    public void cookPlov(String ingridient1, String ingridient2, String ingridient3) {
        if (ingridient1.equals("meat") && ingridient2.equals("onion")){
            System.out.println("fried " + ingridient1 + " " + ingridient2);
        }else {
            System.out.println("These are not ingredients plov");
        }
    }

    @Override
    public void cookPlov(String ingridient1, String ingridient2, String ingridient3, String ingridient4) {
        if (ingridient1.equals("meat") && ingridient2.equals("onion")){
            System.out.println("fried " + ingridient1 + " " + ingridient2 + "then add: " + ingridient3 + " " + ingridient4);
        }else {
            System.out.println("These are not ingredients plov");
        }
    }
    }

