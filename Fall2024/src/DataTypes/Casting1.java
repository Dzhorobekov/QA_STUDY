package DataTypes;

public class Casting1 {
    public static void main(String[] args) {

        //byte, short, int, long целочисленные типы данных

        byte b1 = 23;
        int i1 = b1;

        System.out.println(b1);
        System.out.println(i1);

        int i2 = 57;
        byte b2 = (byte)  i2;
        System.out.println(i2);
        System.out.println(b2);
        System.out.println("_____________________");

        int i3 = 168;
        byte b3 = (byte) i3;
        System.out.println(i3);
        System.out.println(b3);


        // float, double не цулочисленные типы данных

        short sh1 = 48;
        byte b4 = (byte) sh1;
        System.out.println(sh1);
        System.out.println(b4);

        byte b5 = 89;
        long l1 = b5;

        // small --> big
        // big --> small если мы пытаемся большое вместить маленькое, то мы должны скастить соответствующее значение через (byte)


        float f1 = 89.87f;
        double d1 = f1;

        double d2 = 64.23;
        float f2 = (float) d2;
        System.out.println(d2);
        System.out.println(f2);

        int i6 = 15; // 15.0
        float f3 = i6; // 15.0f

        System.out.println(i6);
        System.out.println(f3);

        double d3 = 19.4;
        int i7 = (int) d3;
        System.out.println(d3);
        System.out.println(i7);

    }
}
