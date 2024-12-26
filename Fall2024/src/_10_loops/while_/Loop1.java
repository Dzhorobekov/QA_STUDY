package _10_loops.while_;

public class Loop1 {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++){
            System.out.println(i + "salam");
        }
        System.out.println("_______________________");

        int num = 4;
        while (num < 4) {
            System.out.println(num + " Adios");
            num--;
        }

        System.out.println("__________________");

        int count = 1;
        while (count < 9){
            System.out.println(count + " * 2 = " + count *2);
            count++;
        }
        System.out.println("_______________");
        int d = 2;
        int v = 3;
        while (d <= 5){
            System.out.println("***************");
            while (v <= 5){
                System.out.println("!!!!!!!!!!!!!!!!");
                v++;
            }
            System.out.println("______________");
            int number = 1;
            while (number <= 2){
                System.out.println(number + "Privet");
                number++;
            }
            while (number <= 5){
                System.out.println(number + "Bishkek");
                number++;
            }
        }
    }
}
