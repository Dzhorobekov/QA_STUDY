package _15_OOP.inheritance;

public class InheritMain {
    public static void main(String[] args) {

        Dad maksat = new Dad("Maksat", 58, "brown", "dance");
        System.out.println(maksat);
        System.out.println(maksat.getTalent());
        System.out.println(maksat.toFun());

        Son kalys = new Son("Kalys", 25, "green", "draw");
        System.out.println(kalys);
        System.out.println(kalys.getTalent());
        System.out.println(kalys.toFun());

        GrandSon azamat = new GrandSon("Azamat", 3, "green", "dance" );
        System.out.println(azamat);
        System.out.println(azamat.getTalent());
        System.out.println(azamat.toFun());

        Rano rano = new Rano("Rano",18, "brown","to Sing");
        System.out.println(rano.toFun());
    }
}
