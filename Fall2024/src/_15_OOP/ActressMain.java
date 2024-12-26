package _15_OOP;

public class ActressMain {
    public static void main(String[] args) {

        Actress ann = new Actress("Ann Hathaway", 45, false);
        Actress angy = new Actress("Angelina Jolie", 49, true);
        System.out.println(ann);
        System.out.println(angy);

        Actress sandra = new Actress("Sandra", 58);
        System.out.println(sandra);

        Actress jLo = new Actress("Jenifer Lopes");
        System.out.println(jLo);

        Actress margo = new Actress("Celine Dion","Jcker", false );
        System.out.println("-> " + margo);
        margo.name = "Margo Robi";
        System.out.println("-> " + margo);

        Actress jessica = new Actress(43, "Jessica Alba");

        Actress cameron = new Actress("Cameron Dias", "Charlies Angels");

        String color = "black";
        color = " green";
        System.out.println(color);






    }
}
