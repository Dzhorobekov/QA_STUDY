package Project4;

public class Guitar implements Instrument {

    public String brand;

    public Guitar(String brand) {
        this.brand = brand;
    }

    public void playWith(String element){
        if (element.equals("Strings")){
            System.out.println("Playing with strings");
        }else {
            tuneInstrument();
        }
    }

    @Override
    public void play() {
        System.out.println("Play on guitar " + brand);
    }

    @Override
    public void tuneInstrument() {
        System.out.println("Tighten the strings of " + brand);

    }
}
