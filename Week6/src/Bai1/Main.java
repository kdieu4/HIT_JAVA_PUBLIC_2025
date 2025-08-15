package Bai1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Class oop = new Class("Hướng đối tượng", "IT001");
        students.add(new Student("sv001", "Đặng Phương Anh", 3.6, oop));
        students.add(new Student("sv002", "Hoàng Thanh Diệu", 3.2, oop));
        students.add(new Student("sv003", "Nguyễn Ngọc Hà", 3.9, new Class("Toán rời rạc","IT002" )));
        double maxGPA = 0;
        System.out.println("Danh sách sinh viên đã tạo");
        for (Student student : students) {
            if (student.getGPA() > maxGPA) maxGPA = student.getGPA();
            student.printInformation();
            System.out.println("------------");
        }
        System.out.println("Điểm trung bình cao nhất: " + maxGPA);
    }
}
