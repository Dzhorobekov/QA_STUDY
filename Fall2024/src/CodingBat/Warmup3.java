package CodingBat;

public class Warmup3 {
    public static void main(String[] args) {
        System.out.println(nearHundred(92)); //true
        System.out.println(nearHundred(90)); //true
        System.out.println(nearHundred(89)); //false
        System.out.println(nearHundred(209)); //true
        System.out.println(nearHundred(189));//false

    }
    public static boolean nearHundred(int n){
        return (Math.abs(100 - n) <= 10)|| (Math.abs(200 - n) <= 10);
    }
}
