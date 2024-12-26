package _06_switch_;

public class Condition3 {
    public static void main(String[] args) {
        // byte short intchar String только с этими переменными работает
        switch (7){
            case 78:
                System.out.println("qwerty");
                break;
            case 7:
                System.out.println("43567");
                break;
            default:
                System.out.println("00000");
        }
    }
}
