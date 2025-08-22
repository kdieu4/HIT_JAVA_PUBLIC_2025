package BTVN.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("SV001", "Nguyễn Văn Anh", 8.5, 20, "annguyen01@gmail.com", "CNTT01", "Hà Nội"));
        students.add(new Student("SV002", "Trần Thị Bình", 7.2, 21, "binhtran@gmail.com", "CNTT02", "TP. Hồ Chí Minh"));
        students.add(new Student("SV003", "Lê Hoàng Nam", 9.1, 19, "namle01@gmail.com", "CNTT01", "Hải Phòng"));
        students.add(new Student("SV004", "Phạm Thùy Dung", 6.8, 22, "dungpham01@gmail.com", "CNTT03", "Đà Nẵng"));
        students.add(new Student("SV005", "Vu Minh Quan", 8.0, 20, "quanvu01@gmail.com", "CNTT02", "Cần Thơ"));

        StudentManager studentManager = new StudentManager(students);

        Scanner sc = new Scanner(System.in);
        char choose;

        do {
            System.out.println("===QUẢN LÝ HỌC SINH===");
            System.out.println("1. In danh sách học sinh");
            System.out.println("2. Sắp xếp theo điểm giảm dần");
            System.out.println("3. Sắp xếp theo điểm tăng dần");
            System.out.println("4. Tìm học sinh theo tên");
            System.out.println("5. Thoát");
            choose = sc.next().charAt(0);

            switch(choose){
                case '1':
                    studentManager.printStudents();
                    break;
                case '2':
                    studentManager.sortByScoreDesc();
//                    studentManager.printStudents();
                    break;
                case '3':
                    studentManager.sortByScoreAsc();
//                    studentManager.printStudents();
                    break;
                case '4':
                    sc.nextLine();
                    System.out.println("Nhập tên muốn tìm: ");
                    String name = sc.nextLine();
                    Student found = studentManager.findByName(name);
                    System.out.println(found);
                    break;
                case '5':
                    System.exit(0);
                    break;
            }
        } while (choose != 5);



    }
}
