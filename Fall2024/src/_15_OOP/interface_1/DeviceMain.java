package _15_OOP.interface_1;

import _15_OOP.inheritance.Son;

public class DeviceMain {
    public static void main(String[] args) {

        TV tv1 = new TV("LG");
        tv1.turnOn();
        tv1.turnOff();

        SmartPhone phone1 = new SmartPhone("Samsung");
        phone1.turnOn();
        phone1.turnOff();

        Device tv2 = new TV("Sony");
        System.out.println(tv2);
        tv2.turnOn();
        tv2.turnOff();

        Device phone2 = new SmartPhone("6300");
        System.out.println(phone2);
        phone2.turnOn();
        phone2.turnOff();

        System.out.println(Device.SOCKET);
    }
}
