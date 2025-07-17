import java.util.Scanner;
/*
Bài tập: Viết chương trình yêu cầu người dùng nhập tên, tuổi và chiều cao.
Sau đó in ra thông tin theo định dạng:
Xin chào [Tên], bạn [tuổi] tuổi và cao [chiều cao] mét.
 */
public class Bai1_BTTL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên của bạn: ");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi của bạn: ");
        int age = sc.nextInt();
        System.out.println("Nhập chiều cao của bạn: ");
        double height = sc.nextDouble();

        System.out.println("Xin chào " + name + ", bạn " + age + " tuổi và cao " + height + " mét.");

    }
}
