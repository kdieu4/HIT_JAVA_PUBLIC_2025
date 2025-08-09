package BTVN.Bai1;

import java.util.Scanner;

public class Student {
    private String name;
    private String className;
    private double score;
    private Faculty faculty = new Faculty();

    public Student(String name, String className, double score, Faculty falculty) {
        this.name = name;
        this.className = className;
        this.score = score;
        this.faculty = falculty;
    }

    public Student(){}

    public void input(Scanner sc) {
        System.out.print("Nhập tên sinh viên: ");
        this.name = sc.nextLine();
        System.out.print("Nhập tên lớp: ");
        this.className = sc.nextLine();
        System.out.print("Nhập điểm: ");
        this.score = sc.nextDouble();
        sc.nextLine();
        this.faculty.input(sc);
    }

    public void output(){
        System.out.println("Tên sinh viên: " + this.name);
        System.out.println("Lớp: " + this.className);
        System.out.println("Điểm: " + this.score);
        faculty.output();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
}
