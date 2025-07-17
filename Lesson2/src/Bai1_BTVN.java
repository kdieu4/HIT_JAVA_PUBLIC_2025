import java.util.Scanner;

public class Bai1_BTVN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập bán kính: ");
        double r = sc.nextDouble();
        double pi = 3.14;

        double chuVi = r * pi * 2;
        System.out.println("Chu vi: " + chuVi + " (đvđd)\n");

        double dienTich = r * r * pi;
        System.out.println("Diện tích: " + dienTich + " (đvdt)\n");

        sc.close();
    }
}
