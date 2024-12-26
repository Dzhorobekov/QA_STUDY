package _03_java_operators;

public class ComparisonOperators {
    public static void main(String[] args) {

        // 90 = 90
        int num = 56;

        //==
        int n1 = 23;
        int n2 = 45;
        boolean result1 = n1 == n2; //
        System.out.println(result1);
        boolean result2 = 78 == 78;
        System.out.println(result2);

        // !=
        // ! -> (означает нет, частичка не)
        // = -> equals - равно
        // != -> not equals - не равны
        int n3 = 34;
        int n4 = 34;
        System.out.println(n3 == n4); // true
        //                 34 != 34
        System.out.println(n3 != n4); // false

        System.out.println(68 == 80); // false
        System.out.println(68 != 80); // true , тоесть показывает обратный ответ, результат наоборот, переворачивает резульатат.

        // >

        System.out.println(55 > 23); // true
        System.out.println(1 > 59); // false

        //>
        System.out.println(44 < 120); // true
        System.out.println(200 < 20); // false

        // >=
        System.out.println(23 >= 10); //true
        System.out.println(23 >= 23); //true

        System.out.println("_______________________________________________");
        int a1 = 27;
        int a2 = 33;
        int a3 = 127;
        int a4 = 227;
        System.out.println(a1 > a3 && a4 > a2);
        /* false, так как первое значение не верно,
        поэтому второй вариант java даже не расмматривает
        */

        int age = 16;
        boolean haveApassport = true; // true имеет паспрт если он старше 16
        boolean result5 = 16 < 20;
        System.out.println(result5);


        int q = 27;
        int w = 29;
        int e = 31;
        int r = 33;
        int t = 37;
        int y = 41;
                          //  68>1073 false  31<33 true
        System.out.println(q + y > w * t && e < r);
        System.out.println((q + y ) > w * t && e < r);
        System.out.println(y < t && q == e);

        //                      true     true
        System.out.println(33 >= 20 && !(5 * 5 == 25)); // true

                          //  true         !(false)=true
        System.out.println(33 >= 20 && !(5 * 5 != 25)); // true








    }

}

