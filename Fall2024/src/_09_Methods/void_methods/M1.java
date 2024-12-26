package _09_Methods.void_methods;

public class M1 {
    public static void main(String[] args) {
        M1 obj = new M1();
        obj.sum1(12,87);
        System.out.println(obj.sum2(12.45, 68.1f));


    }


    public void sum1(int num1, double num2){
        System.out.println(num1 + num2);
    }

    public double sum2(double n1, float n2){
        return n1 + n2;
    }
}
