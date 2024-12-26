package _09_Methods.Static_Methods;

public class MainExample {
    public static void main(String[] args) {
        Example obj = new Example();
        //return
        System.out.println(obj.sayHi("Lora"));
        //void
        obj.saySalam("Kairat uulu Kanat");

        // static return
        System.out.println(Example.sum(12,45));

        // static void
        Example.division(34,5);

        final int num = 90;

        System.out.println(Math.max(23,15));

        String city = "Nursultan";
        city = city.replaceAll("Nursultan","Astana");
        System.out.println(city);

        String num5 = String.valueOf(30).concat(".50");
        System.out.println(num5);



        // Java methods
        // User methods

        // methods
        //1.return
        //2.non-return

        //1. static methods
        //2. non-static methods

        //access modifiers
        //1.public
        //2.protected
        //3.default
        //4.private

        //optional modifiers
        //1.final
        //2.static
    }
}
