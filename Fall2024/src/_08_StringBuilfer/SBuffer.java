package _08_StringBuilfer;

public class SBuffer {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Bishkek");
        sb1.append(312);
        sb1.reverse();
        System.out.println(sb1);


        StringBuffer sb2 = new StringBuffer("Astana");
        sb2.append(123);
        sb2.reverse();
        System.out.println(sb2);
    }
}
