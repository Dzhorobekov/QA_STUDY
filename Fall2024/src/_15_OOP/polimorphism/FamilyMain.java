package _15_OOP.polimorphism;

public class FamilyMain {
    public static void main(String[] args) {

        Mather mather = new Mather("Mommy", 60, "A-positive");
        mather.cookPlov("meat", "onion", "rise");
        mather.cookPlov("meat", "onion","carrot","rice");

        Family fam = new Family("My fam", 19,"B positive");
        fam.cookPlov("meat", "onion","carrot","rice");
    }
}
