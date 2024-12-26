package _09_Methods.Static_Methods;

public class Example {

    // return метод

    public String sayHi(String name){
        return "Hi" + name;
    }
    // void
    public void saySalam(String FullName){
        System.out.println("Salam " + FullName);

    }
    // static return
    public static int sum(int num1, int num2){
        return num1 + num2;
    }

    // static void
    public static void division(int num1, int num2){
        System.out.println(num1 / num2);
    }



}
