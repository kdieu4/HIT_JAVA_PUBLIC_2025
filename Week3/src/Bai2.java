import java.util.Scanner;

public class Bai2 {
    public static final double PI = 3.14159265;

    public static double tinhChuVi(double r) {
        return 2 * PI * r;
    }

    public static double tinhDienTich(double r) {
        return PI * r * r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập bán kính: ");
        double r = sc.nextDouble();
        System.out.println("Nhập số mũ: ");
        int k = sc.nextInt();

        System.out.println("Chu vi: " + tinhChuVi(r));
        System.out.println("Diện tích: " + tinhDienTich(r));
        System.out.println("Lũy thừa: " + Math.pow(r, k));
        System.out.println("Can bac hai cua (r + k): " + Math.round(Math.sqrt(r + k) * 100.0) / 100.0);
        System.out.println("Gia tri tuyet doi (r - k): " + Math.round(Math.abs(r - k) * 100.0) / 100.0);
    }
}
