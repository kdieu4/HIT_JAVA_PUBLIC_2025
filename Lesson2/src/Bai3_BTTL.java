import java.util.Scanner;

/*
Bài tập: Viết chương trình nhập 2 số nguyên và thực hiện các phép toán:
cộng, trừ, nhân, chia, chia lấy dư.
Sau đó kiểm tra xem 2 số đó có bằng nhau không sau đó in ra màn hình.
(kiểm tra tối thiểu là 5 cặp)
 */

public class Bai3_BTTL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("----Cap so thu " + (i + 1) + ":");
            System.out.println("Nhap so thu nhat: ");
            int a = sc.nextInt();
            System.out.println("Nhap so thu hai: ");
            int b = sc.nextInt();

            System.out.println("Cong: a + b = " + (a + b));
            System.out.println("Tru: a - b = " + (a - b));
            System.out.println("Nhan: a * b = " + (a * b));

            if (b != 0) {
                System.out.println("Chia: a / b = " + (a / b));
                System.out.println("Chia lay du: a % b = " + (a % b));
            }
            else {
                System.out.println("Khong the thuc hien phep chia vi b = 0");
            }

            if(a == b) System.out.println("Hai so bang nhau!");
            else System.out.println("Hai so khong bang nhau!");
        }
    }
}
