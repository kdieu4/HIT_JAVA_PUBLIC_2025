package Bai6;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng sinh viên: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];
        double totalGpa = 0;
        double maxGpa = -1;
        int indexMax = 0;

        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            System.out.println("Sinh viên thứ " + (i + 1) + ": ");
            System.out.println("Nhập tên: ");
            students[i].name = sc.nextLine();
            System.out.println("Nhập tuổi: ");
            students[i].age = sc.nextInt();
            System.out.println("Nhập điểm trung bình: ");
            students[i].gpa = sc.nextDouble();
            sc.nextLine();

            totalGpa += students[i].gpa;

            if(students[i].gpa > maxGpa) {
                maxGpa = students[i].gpa;
                indexMax = i;
            }
        }

        System.out.println("\n--- DANH SÁCH SINH VIÊN ---");
        for(Student s : students) {
            System.out.println("Tên: " + s.name + " | Tuổi: " + s.age + " | GPA: " + s.gpa);
        }

        System.out.println("\nĐiểm trung bình cả lớp: " + (totalGpa / n));
        System.out.println("Sinh viên có điểm cao nhất: " + students[indexMax].name + " - " + students[indexMax].gpa);

        sc.close();
    }
}
