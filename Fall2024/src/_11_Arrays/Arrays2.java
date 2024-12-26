package _11_Arrays;

import java.util.Arrays;

public class Arrays2 {
    public static void main(String[] args) {

        System.out.println(90);

        StringBuilder [] sb = {new StringBuilder("James"),
                               new StringBuilder("Clark"),
                               new StringBuilder("John")   };
        System.out.println(Arrays.toString(sb));
        System.out.println(sb[1]);
        System.out.println(sb.length);


        System.out.println(sb[0] = new StringBuilder("Kate"));
        System.out.println(Arrays.toString(sb));

        sb[2].append(" Doe");
        System.out.println(Arrays.toString(sb));




    }
}
