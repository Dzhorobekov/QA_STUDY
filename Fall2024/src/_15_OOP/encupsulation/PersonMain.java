package _15_OOP.encupsulation;

public class PersonMain {
    public static void main(String[] args) {

        Person obj = new Person("Bems", "LadyBems", 18,78990035);
        System.out.println(obj.name);
        System.out.println(obj.fullName);
        System.out.println(obj.age);
        obj.age = 25;
        System.out.println(obj.age);
//        System.out.println(obj.id);


        System.out.println(obj);

        System.out.println(obj.getId());
        obj.setId(98540);
        System.out.println(obj.getId());



        //private переменная не доступна в другом классе, она доступна только там где она была создана


    }
}
