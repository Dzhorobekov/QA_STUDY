package _08_StringBuilfer;

public class SB_Methods {
    public static void main(String[] args) {

        String str1 = "Lenovo";
        int num = 24;

        StringBuilder sb1 = new StringBuilder("Mac");
        sb1.append(" Book");
        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder();
        sb2.append("Lab top");
        sb2.append(" ");
        sb2.append(':');
        sb2.append(" ");
        sb2.append(sb1);
        sb2.append(num);
        System.out.println(sb2);

       final StringBuilder sb3 = new StringBuilder("AriUri");
        sb3.append(" my na IK");
        sb3.append("MP4");
        System.out.println(sb3); // object

        System.out.println(sb3.toString()); // Value as a string

        //                                     01234     5
        StringBuilder sb6 = new StringBuilder("Yllow");
        sb6.insert(1, 'e');
        System.out.println(sb6);
        sb6.insert(3, "GREEN");
        sb6.insert(5,sb1);
        System.out.println(sb6);


    }
}
