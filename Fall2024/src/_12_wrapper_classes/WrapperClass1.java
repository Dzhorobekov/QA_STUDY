package _12_wrapper_classes;

public class WrapperClass1 {
    public static void main(String[] args) {
        //primitive        non-primitive
        //key-wrods        class
        // byte,            Byte
        //short,            Short
        //int,              Integer
        //long,             Long
        //float,            Float
        //double,           Double
        //char,             Character
        //boolean,          Boolean

        //                  Scanner
        //                  String
        //                  StrinBuilder
        //                  StringBuffer




        Character.isLetter('r');

        int num = 90;
        System.out.println(num);

        Integer num2 = 12;//           "12"
        System.out.println(num2.toString().charAt(0));


        char symbol1 = 't';
        System.out.println(Character.isUpperCase('R'));

        int n1 = 12;
        Integer n2 = n1;
        System.out.println(n1);
        System.out.println(n2);

        Integer n3 = 34;
        int n4 = n3;
        System.out.println(n3);
        System.out.println(n4);

        Integer n5 = 123;
        byte n6 = n5.byteValue();
    }
}
