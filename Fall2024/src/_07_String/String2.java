package _07_String;

import java.util.Locale;

public class String2 {
    public static void main(String[] args) {
       String str1 = "photo";
            String str2 = "Phot";
            // boolean result1 = str1.equals(str2);
            // boolean result2 = str1.equalsIgnoreCase(str2);
            System.out.println(str1.equals(str2));
           // System.out.println(result1);
           // System.out.println(result2);

            System.out.println(str1 + "   " + str2);
            System.out.println(str1.toUpperCase() + "   " + str1.toLowerCase(Locale.ROOT));


            String str3 = "Kyrgyzstan";
            System.out.println(str3.startsWith("Kyrgyz"));
            System.out.println(str3.startsWith("Kyrgyz"));
            System.out.println(str3.endsWith("stan"));
            System.out.println(str3.endsWith("iya"));

            String str4 = "samsung Galaxy";
            System.out.println(str4.contains("Galaxy"));
            System.out.println(str4.contains("sung"));
            System.out.println(str4.contains("nokia"));

            if (str4.contains("sung")) {
                ;
                System.out.println(str4);
            } else {
                System.out.println("no");
        }


        String str5 = "Hello!World";
        System.out.println(str5);
//        System.out.println(str5.replace('');
//        System.out.println(str5.replace(str5);



       // String name = "Iphone 13 Pro max";
       // System.out.println(name);
       // int result = name.toUpperCase()
         //       .replace("APPLE" , "rose")
          //              .concat("Metro")
          //                      .substring(4)
             //                           .indexOf('M');
      //  System.out.println(result);
//        123124345656


        String name = "Red apple";
        System.out.println(name);
        //         "Red apple"."RED APPLE"
        int result1 = name.toUpperCase()
                .replace("APPLE", "rose") // RED rose
                .concat("Metro")// RED roseMetro
                .substring(4)
                .indexOf('M');
        System.out.println(result1);



    }
}
