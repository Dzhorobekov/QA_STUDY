package If_Else;

public class TernaryOperators {
    public static void main(String[] args) {

        int age = 18;
        int kateAge = 9;
//        if (kateAge >= age){
//            System.out.println("Adult");
//        }
//        else {
//            System.out.println("Teenager");
//        }

        System.out.println( (kateAge >=18) ? "Adult" : "Teenager" );

        int num1 = 1;
        int num2 = 4;
        int result = (num1 > num2) ? num1-num2 : num1+num2;
        System.out.println(result);

        // синтактический сахар 
    }
}
