import java.util.Scanner;

public class Bai4 {
    public static int fibonacci(int n){
        if(n <= 2) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen n: ");
        int n = sc.nextInt();
        System.out.println("Số fibonacci thứ n là: " + fibonacci(n));
    }
}
