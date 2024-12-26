package _15_OOP;

public class PhoneMain {
    public static void main(String[] args) {
        Phone Iphone = new Phone();
        Iphone.mark = "iPhone";
        Iphone.model = "13 Pro Max";
        Iphone.color = "Silver";
        Iphone.memory = 512.01;
        System.out.println(Iphone);
        System.out.println(Iphone.toCall("Aiperi"));
        System.out.println(Iphone.toSandMessage("Love you"));

        Phone Samsung = new Phone();
        Samsung.mark = "Sumsung";
        Samsung.model = "Galaxy";
        Samsung.color = "Black";
        Samsung.memory = 1.01;
        System.out.println(Samsung);
        System.out.println(Samsung.toCall("Abaz"));
        System.out.println(Samsung.toSandMessage("Hi Jenny! Whats up?"));
    }


}
