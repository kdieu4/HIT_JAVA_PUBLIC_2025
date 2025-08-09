package BTVN.Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số sinh viên cần nhập: ");
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Student> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ": ");
            Student student = new Student();
            student.input(sc);
            list.add(student);
        }

        System.out.println("---THÔNG TIN SINH VIÊN---");
        for (Student student : list) {
            student.output();
        }
    }
}
