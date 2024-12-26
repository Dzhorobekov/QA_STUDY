package Project4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InstrumentMain {
    public static void main(String[] args) {

        Instrument piano1 = new Piano("Kawai", true);
        piano1.play();
        piano1.tuneInstrument();

        Instrument guitar1 = new Guitar("Gibson");
        guitar1.play();
        guitar1.tuneInstrument();

        System.out.println("_______________________");

        Guitar guitar2 = new Guitar("haha");
        guitar2.play();
        guitar2.playWith("Strings");
        guitar2.tuneInstrument();

    }
}
