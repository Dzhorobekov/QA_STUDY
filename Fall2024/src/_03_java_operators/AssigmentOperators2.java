package _03_java_operators;

public class AssigmentOperators2 {
    public static void main(String[] args) {
        int  num = 90;
        System.out.println(num);
        num = 89;
        num = 56;

        int num1 = 12;
        int num2 = 5;
        int result = num1 + num2;
        System.out.println(result);
        // =, +=, -=, *=, /= ......

        int num3 = 45;
        num3 += 5; // num3 = num3 + 5 -> num3 = 50;
        System.out.println(num3); // 50
        // сначала надо сделать арифметическое действие, тоесть не могу знак + ставить после знака =;


    }
}
