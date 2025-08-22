package Exceptions;

//import java.util.Objects;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static int a;
    public static int b;

    public static int inputInteger() {
        int num = 0;
        boolean isValid;
        do {
            try {
//                System.out.println("Nhập số nguyên: ");
                num = Integer.parseInt(sc.nextLine());
                isValid = true;
            } catch (NumberFormatException e) {
                isValid = false;
                System.out.println("Vui lòng nhập số nguyên");
            }
        } while (!isValid);
        return num;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Nhập số nguyên a: ");
            a = inputInteger();
            System.out.println("Nhập số nguyên b: ");
            b = inputInteger();

            int c = a/b;
            System.out.println("a/b= " + c);
        } catch (ArithmeticException e) {
            System.out.println("Không thể chia cho 0!");
        }
    }
}
