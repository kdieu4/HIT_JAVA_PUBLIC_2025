package BTVN.Bai1;

import java.util.Scanner;

public class School {
    private String name;
    private String date;

    public School(String date, String name) {
        this.date = date;
        this.name = name;
    }

    public School() {
    }

    @Override
    public String toString() {
        return "School{" +
                "name = " + name +
                ", date = " + date +
                '}';
    }

    public void output() {
        System.out.println("Tên trường: " + name + "    Ngày vào trường: " + date);
    }

    public void input(Scanner sc) {
        System.out.print("Nhập tên trường: ");
        this.name = sc.nextLine();
        System.out.print("Nhập ngày vào trường: ");
        this.date = sc.nextLine();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
