package Bai3.Instrument;

public class Guitar implements Playable{

    private int strings;

    public Guitar(int strings) {
        this.strings = strings;
    }

    public Guitar() {
    }

    public int getStrings() {
        return strings;
    }

    public void setStrings(int strings) {
        this.strings = strings;
    }

    @Override
    public void play() {
        System.out.println("Guitar is played");
    }
}
