package BTVN;

import java.util.Scanner;

public class Bai3_BTVN {
    public static boolean isCorrect(String ans, int a, int b, int c) {
        return (ans.contains("dung") && a + b == c) || (ans.contains("sai") && a + b != c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //double randomNumber = Math.random(); // [0, 1)
        int a = (int) (Math.random() * 101);
        int b = (int) (Math.random() * 101);
        int c = (int) (Math.random() * 201);

        System.out.println(a + " + " + b + " = " + c);

        System.out.println("Dự đoán kết quả phép toán (dung/sai): ");
        String ans = sc.nextLine();

        if(isCorrect(ans, a, b, c)) {
            System.out.println("Bạn dự đoán đúng!");
        }
        else {
            System.out.println("Bạn dự đoán sai!");
        }

    }
}
