package _08_StringBuilfer;

public class SB3 {
    public static void main(String[] args) {
        //                                   01234567890  11
       StringBuilder sb = new StringBuilder("Hello World");
       //                                    12345678901
       sb.replace(6,sb.length() - 1,"Sasha");
        System.out.println(sb); // Hello Sashad

        //                         012345. 6
        sb.delete(0,6);         // Sashad
        System.out.println(sb);
        sb.deleteCharAt(sb.length());
        System.out.println(sb);



    }
}
