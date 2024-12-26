package _09_Methods;

public class Method1 {
    public static void main(String[] args) {
        Method1 obj = new Method1();
        System.out.println(obj.sayHi("Max"));
        System.out.println(obj.sayHi("Will"));
        System.out.println(obj.sayHi("Kanat"));
        System.out.println(obj.sayHi("Alihandro"));

        StringBuffer sb = new StringBuffer("Salam");
        sb.append(" Salam Aleqikem");

    }






    public String sayHi(String name){
        return "Hi " + name;

    }
}
