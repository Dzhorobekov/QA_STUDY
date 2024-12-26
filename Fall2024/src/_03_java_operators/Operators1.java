package _03_java_operators;

import java.sql.SQLOutput;

public class Operators1 {
    public static void main(String[] args) {
        int a = 123;
        byte b = -32;
        short c = 15943;
        long d = -34343434343443L;
        double e = -343.654;
        float f = 123123.131313f;
        char g = 123;
        String h = "qwert";

        System.out.println("\t" + g * f + "\n" + d+c + "\n" + "\"" + h + "\"");

        System.out.println("34" + "89");

        int num1 = 65;
        int num2 = 10;
        int result = num1 + num2;
        System.out.println(num1 + num2);
        System.out.println(65 + 10);
        System.out.println(result);

        String dob = "12.04.1996";

        int yob = 1996;
        int thisYear = 2024;
        int age = thisYear - yob;
        System.out.println(age);

        int result2 = b * num2;
        System.out.println(result2);

        System.out.println( 12/6);
        System.out.println(24/2);




        System.out.println(9/2);
        System.out.println(9%2);

        System.out.println(9.0f / 2.0f);
        System.out.println(9.0f % 2.0f);

        System.out.println(10 / 3);
        System.out.println(10 % 3);
        System.out.println(10.0f  / 3.0f);


        char ch1 = 'A';
        char ch2 = 'B';
        System.out.println(ch1 + ch2);

        System.out.println('L' + 'b');
        System.out.println('L' * 'b'); //76 + 98 = 174 (данные из аски тейбла)

        System.out.println(12.34 / 6);
        System.out.println(12.34 % 6);
        System.out.println("______________________________________________________");
        // ++
        int n = 1;
        System.out.println(n);    // 1
        System.out.println(++n);  // 2
        System.out.println(++n);  // 3
        System.out.println(++n);  //4
        System.out.println(n);  //-->4
        System.out.println(++n);

        System.out.println(n++); //5 + 1 = 6
        System.out.println(n++); //6 + 1 = (ответ держит в уме и дает результат в последующем)
        System.out.println(n++); //7 +1 =


        //ДЗ практика с "n--"
        System.out.println(1 + 2 + "salam" + 1 + (5 +7));








    }
}
