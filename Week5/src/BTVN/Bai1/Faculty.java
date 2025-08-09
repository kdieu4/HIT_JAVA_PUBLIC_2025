package BTVN.Bai1;

import java.util.Scanner;

public class Faculty {
    private String name;
    private String date;
    private School school = new School();

    public Faculty(String name, String date, School school) {
        this.name = name;
        this.date = date;
        this.school = school;
    }

    public Faculty() {
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "name = " + name +
                ", date = " + date +
                ", school = " + school +
                '}';
    }

    public void input(Scanner sc) {
        System.out.print("Nhập tên khoa: ");
        this.name = sc.nextLine();
        System.out.print("Nhập ngày vào khoa: ");
        this.date = sc.nextLine();
        school.input(sc);
    }

    public void output() {
        System.out.println("Tên khoa: " + name + "    Ngày vào khoa: " + date);
        school.output();
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

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
