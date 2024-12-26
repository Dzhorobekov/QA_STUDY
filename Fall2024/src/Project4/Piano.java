package Project4;

public class Piano implements Instrument{

    public String brand;
    public boolean key;

    public Piano(String brand, boolean key) {
        this.brand = brand;
        this.key = key;
    }

    @Override
    public void play() {
        System.out.println("Playing on piano " + brand);

    }

    @Override
    public void tuneInstrument() {
        if (key){
            System.out.println("Set piano with key " + brand + "with key");
        }else {
            System.out.println("need to find key");
        }

    }
}
