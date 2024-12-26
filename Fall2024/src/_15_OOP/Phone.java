package _15_OOP;

public class Phone {

    public String mark;
    public String model;
    public String color;
    public double memory;

    public String toCall(String contact){
        return "Tuut tuut... " + contact;
    }
    public String toSandMessage(String message){
        return " Typing... -> Sending..." + "[" + message + "]" + " Sending...";
    }

    @Override
    public String toString() {
        return "Phone{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", memory=" + memory +
                '}';
    }
}
