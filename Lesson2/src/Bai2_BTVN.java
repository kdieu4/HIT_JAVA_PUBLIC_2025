import java.util.Scanner;

/*
Input: Mang so nguyen
Output: Mang sau khi bien doi
 */

public class Bai2_BTVN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử va cac phan tu của mảng: ");

        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                if (i == n - 1) {
                    a[i] += a[i - 1];
                    break;
                }
                a[i] += Math.abs(a[i - 1] - a[i + 1]);
            }
        }

        System.out.println("Mang a sau khi bien doi la: ");
        for (int v : a) {
            System.out.print(v + " ");
        }
    }
}
