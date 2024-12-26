package _10_loops.for_loop;

public class Example3 {
    public static void main(String[] args) {
        System.out.println(sayHI("James"));
        System.out.println(sayHI("Clark"));
        System.out.println(sayHI("John"));
        System.out.println(sayHI("Max"));
        System.out.println(sayHI("James"));
        System.out.println(sayHI("James"));
        System.out.println("_______________________");

        for (int i = 0; i < 4; i++) {
            System.out.println(i + sayHI("Will"));
        }
        System.out.println("_______________________");

        String car = "mercedes";
        for (int i = 0; i < car.length(); i++) {
            System.out.println(i + " " + car.charAt(i));
        }


        String car2 = "Range Rover";
        for (int i = 6; i < car2.length(); i++) {
            System.out.println(i + "-->" + car2.charAt(i));
        }


    }
    public static String sayHI(String name){
        return "Hi " + name;
    }

    StringBuilder laptop = new StringBuilder("Mac Book Pro");

}

