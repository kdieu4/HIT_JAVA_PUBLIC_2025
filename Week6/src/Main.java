import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person personA = new Person("Tam", 20);
        SinhVien svA = new SinhVien("nam", 21, "HaUI", 2023600666);
        Staff staffA = new Staff("Trung", 22, 5000);
        Person personB = new Staff("Toan", 29, 1000);
        Person personC = new SinhVien("Tam", 20);

        svA.graduate(true);
        svA.eat();

        for(Season s: Season.values()){
            System.out.println(s);
        }

        List<Double> list = new ArrayList<>();
    }
}