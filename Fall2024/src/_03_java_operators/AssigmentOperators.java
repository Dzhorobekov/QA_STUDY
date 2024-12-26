package _03_java_operators;

public class AssigmentOperators {
    public static void main(String[] args) {

        // ++
        int n = 1;

        ++n;
        ++n;
        n++;
        System.out.println(++n); // prifix
        System.out.println(n++); // postfix
        System.out.println("____________________________________________");


        // =
        int nam1 = 36;

        // +=
        System.out.println(2 + 2);
        int d1 = 2;
        int d2 = 6;
        int result1 = d1 + d2;
        System.out.println(result1);

    //    int number = 10;
     //   number += 3;
        // короткий вид написания
     //   System.out.println(number);

        int num2 = 12;
        num2 = 45;
        System.out.println(num2);



        // assign
        int num = 90;

        // reassing
        num = 78;
        num = 7;
        num = 55;
        System.out.println(num); // 55

        int num1 = 8;
        num1 += 2;
        num1 = num1 + 2;
        System.out.println(num1);


        int num7 = 5;
        num7 -= 2;
        System.out.println(num7);

        int num3 = 6;
        num3 *= 10;
        System.out.println(num3);

        int num4 = 5;
        num4 /= 2;
        System.out.println(num4); //2

        int num8 = 5;
        num8 %= 2;
        System.out.println(num8); // 1 (процентное деление показывает остаток)





    }
}
