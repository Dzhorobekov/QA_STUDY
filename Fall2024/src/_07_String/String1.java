package _07_String;

public class String1 {
    public static void main(String[] args) {

//        String name = "Alex";

//        String color = "White";
//
//        int num = 89;
//        num = 67;
//        num = 90;
//        num = 12;
//        System.out.println(num);
        // Scanner: next(). nextLine(). nextInt().
        // optional(не обязательный): else, break, default
        // redundant - ненужный


//        Методы String

        String name = "Alex";
        //             01234567 (индекс)
        String color = "greheen";
        //              1234567(длина)
        System.out.println(color.length()); //5
        System.out.println(color.indexOf('e')); //
        System.out.println(color.lastIndexOf('e')); // последний индекс, если два одинаковые буквы рядоиъм
        System.out.println(color.indexOf('e',3));

        //             0123456789012 . 10
        String city = "Rome melan me";
       //              1234567890123

        System.out.println(city.length()); //10
        System.out.println(city.indexOf('m')); //7
        System.out.println(city.indexOf('m',3)); //5

        System.out.println(city.indexOf("me"));
        System.out.println(city.indexOf("me",7));

        System.out.println(city.charAt(5)); //m
        System.out.println(city.charAt(0)); // R

        // .concat() метод соединения |+

        String name1 = "Aman";
        String name2 = "Esen";
        String resul1 = name1 + name2;
        String result2 = name1.concat(name2);
        System.out.println(resul1);
        System.out.println(result2);

        System.out.println("_________________");


        //               012345678901. 12
        String laptop = "Mac Book Pro";
        //               123456789012
        System.out.println(laptop);
        System.out.println(laptop.length());
        System.out.println(laptop.indexOf('B'));
        System.out.println(laptop.indexOf('o',6));
        System.out.println(laptop.lastIndexOf('o'));


        // subString();
        //              012345678901234567  .18
        String actor = "Leonardo Di Caprio";
        System.out.println(actor.substring(6));
        System.out.println(actor.substring(0,7));
        System.out.println(actor.substring(9,11));
        System.out.println(actor.substring(12,18));

        // .trim()
        //               01234567890  .1
        String juice = "   orange   ";
        System.out.println(juice.length());
        System.out.println(juice);
        System.out.println(juice.trim());


        // equals()
        //equalsIgnoreCase()
        //toLoverCase()
        //toUpperCase()









    }
}
