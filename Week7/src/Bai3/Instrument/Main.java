package Bai3.Instrument;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Playable> instruments = new ArrayList<>();
        instruments.add(new Guitar(5));
        instruments.add(new Guitar(6));
        instruments.add(new Piano(32));
        instruments.add(new Piano(40));

        for (Playable instrument : instruments) {
            instrument.play();
        }
    }
}
