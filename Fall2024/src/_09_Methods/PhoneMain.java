package _09_Methods;

public class PhoneMain {
    public static void main(String[] args) {

        Phone object = new Phone();
        System.out.println(object.call(-4));

        System.out.println(object.sendMSG("Hello its me", 3));
    }

}
