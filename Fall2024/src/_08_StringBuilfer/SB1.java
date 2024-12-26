package _08_StringBuilfer;

public class SB1 {
    public static void main(String[] args) {
                                                // Heap
                                                // Poll
                                                // Hello


//        String str1 = "Hello";
//        String str2 = "Hello";
//        System.out.println(str1.hashCode());
//        System.out.println(str2.hashCode());
//        System.out.println(str1.hashCode() == str2.hashCode());
//        System.out.println(str1 == str2);
//        System.out.println(str1.equals(str2));
//
//        // == --> link(hashcode)
//        // .equals --> value
//
//        // String --> immutable (не изменяемый)
//        String str3 = "Salam";
//
//        String res1 = str3.concat(" Aleikum");
//        System.out.println(str3); // salam
//        System.out.println(res1); // salam aleikum
//        System.out.println("__________________");
//
//        String color1 = "green";
//        String color2 = "Green";
//        System.out.println(color1 == color2);               // true
//        System.out.println(color1.equals(color2));          //true
//        System.out.println("________________________________________________");
//        StringBuilder sb1 = new StringBuilder("Aloha");
//        StringBuilder sb2 = new StringBuilder("Aloha");
//        System.out.println(sb1 == sb2);                     //false
//        System.out.println(sb1.equals(sb2));                //false
//
//
//
//
//        String name = "Bred";
//        name.concat("Pitt");
//        System.out.println(name);
//
//        StringBuilder name1 = new StringBuilder("John");
//        name1.append(" "); // append озночает добавить и рботает лучше чем concat(добавлет любой тип данных)
//        name1.append("Doe");
//        name1.append(2);
//        name1.append('!');
//        System.out.println(name1);
//        System.out.println(name.hashCode());


        String city1 = "London";
        String city2 = "London";
        String city3 = "London";
        String city4 = "Paris";
        String city5 = "Paris";
        String city6v = "Madrid";

        city1.concat(" is a capital of GB!");
        city3.concat(" UK");
        System.out.println(city1);
        System.out.println(city3);
        System.out.println(city1 == city3);       // true
        System.out.println(city1.equals(city3));  // true

        StringBuilder country1 = new StringBuilder("USA");
        StringBuilder country2 = new StringBuilder("UAE");
        StringBuilder country3 = new StringBuilder("USA");


        System.out.println(country1.hashCode());  //245257410
        System.out.println(country2.hashCode());  //1705736037
        System.out.println(country1 == country3);
        System.out.println(country1.equals(country3));

        country3.append(" - United States of America");
        System.out.println(country1 + " : " + country3);
        country1.append(" - AMERICA");
        System.out.println("1) " + country1 + "\n2)" + country3);

        //                  Sbuilder. String
        System.out.println(country1.toString()
                                    .equals
                //                  Sbuilder. String
                                            (country3.toString()));

    }
}
