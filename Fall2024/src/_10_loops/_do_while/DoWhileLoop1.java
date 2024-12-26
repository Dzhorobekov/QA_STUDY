package _10_loops._do_while;

public class DoWhileLoop1 {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++){
            System.out.println(i + "Hello");
        }
        System.out.println("________________________");

        int f = 0;
        while (f < 3){
            System.out.println(f + "Salam");
            f++;
        }
        System.out.println("_________________");

//        int k = 0;

//        while (k < 5){
//            System.out.println(k + "Adios");
//            k--;
//        }
        int k = 5;
        do {
            System.out.println(k + " Whats up?");
            k--;
        }while (k < 0);

        System.out.println("________________");

        int d = 0;
        do {
            System.out.println(d + " Vroom Vroom");
            d++;
        }while (d < 3);
        System.out.println("________________");
        int x = 0;
        for ( ; x < 3 ;){
            System.out.println(x + " privet");
            x++;
        }
    }
}
