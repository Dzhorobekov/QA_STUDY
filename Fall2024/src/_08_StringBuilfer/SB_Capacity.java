package _08_StringBuilfer;

public class SB_Capacity {
    public static void main(String[] args) {
        //1
        StringBuilder sb1 = new StringBuilder(); //16 лимит у стрингбилдера 16
        sb1.append(12);
        sb1.append('P');
        sb1.append("James");     //01234567  1         12
        System.out.println(sb1); // 12PJamesBond312!sdvsdbsdjkbsdkjs%
                                 // 123456789012345678123456789012345
        sb1.append("Bond");
        sb1.append(312);
        sb1.append("!");
        sb1.append("hi");
        sb1.append(" ,sdvsdbsdjkbsdkjs");  //34
        sb1.append('%');
        System.out.println(sb1.capacity());

        System.out.println((16 + 1) * 2);
        // (old capacity + 1) *2
       // System.out.println((34 + 1) *2);
        System.out.println("________________________");







        //2                                    12345 + 16 = 21
        StringBuilder sb2 = new StringBuilder("Hello"); //21
        //          678901
        sb2.append(" World");
        //          2345678901
        sb2.append("qwertyuiop");
        //         234 - 24
        sb2.append(312);
        System.out.println(sb2);
        System.out.println(sb2.capacity());
        System.out.println((21 + 1) *2);
        System.out.println("________________________");


        //3
        StringBuilder sb3 = new StringBuilder(5); //5
        //          12345
        sb3.append("Salam");
        //          67890123  -->13
        sb3.append(" Aleikum");
        //         4567 --> 17
        sb3.append(7194);
        System.out.println(sb3);
        System.out.println(sb3.capacity());

        System.out.println((13 + 1) * 2);



        StringBuilder sb4 = new StringBuilder("James");
        sb4.append("Bond");
        sb4.append(7);
        System.out.println(sb4);
        // "JamesBodn7"



    }
}
