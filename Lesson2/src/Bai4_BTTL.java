import java.util.Scanner;
/*
Bài tập: Nhập vào 5 số nguyên từ bàn phím, lưu vào mảng, rồi in ra:
Các phần tử vừa nhập
Tổng của các phần tử
Giá trị lớn nhất trong mảng
 */
public class Bai4_BTTL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < 5; i++){
            System.out.println("Nhap phan tu thu " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            sum += arr[i];
            if (arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("Cac phan tu vua nhap la: ");
        for(int v: arr){
            System.out.print(v + " ");
        }
        System.out.println("\n");
        System.out.println("Tong cua cac phan tu vua nhap la: " + sum);
        System.out.println("Gia tri lon nhat: " + max);
        sc.close();
    }
}
