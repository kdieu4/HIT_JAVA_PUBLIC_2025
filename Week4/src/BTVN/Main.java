package BTVN;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Student> students = new ArrayList<>();

    public static void addStudent() {
        System.out.println("Tên: ");
        String name = sc.nextLine();
        System.out.println("Năm sinh: ");
        int yearOfBirth = sc.nextInt();
        System.out.println("Địa chỉ: ");
        String address = sc.nextLine();
        sc.nextLine();
        System.out.println("TX1: ");
        double tx1 = sc.nextDouble();
        System.out.println("TX2: ");
        double tx2 = sc.nextDouble();
        System.out.println("KTHP: ");
        double kthp = sc.nextDouble();
        System.out.println("Số tiết nghỉ: ");
        int dayOff = sc.nextInt();
        sc.nextLine();
        students.add(new Student(name, yearOfBirth, address, tx1, tx2, kthp, dayOff));
    }

    public static void updateStudent() {
        System.out.println("Nhập tên cần sửa: ");
        String name = sc.nextLine();
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                System.out.println("Tên mới: ");
                s.setName(sc.nextLine());
                System.out.println("Năm sinh mới: ");
                s.setYearOfBirth(sc.nextInt());
                System.out.println("Địa chỉ mới: ");
                s.setAddress(sc.nextLine());
                sc.nextLine();
                System.out.println("TX1: ");
                s.setTx1(sc.nextDouble());
                System.out.println("TX2: ");
                s.setTx2(sc.nextDouble());
                System.out.println("KTHP: ");
                s.setSemesterGrade(sc.nextDouble());
                System.out.println("Số tiết nghỉ: ");
                s.setOffPeriods(sc.nextInt());
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên!");
    }

    public static void display() {
        String[] headers = {"Tên", "Tuổi", "Địa chỉ", "Điểm TX1", "Điểm TX2", "Điểm KTHP", "Điểm GPA", "Số tiết nghỉ"};
        String header = String.format("%-20s %-7s %-15s %-10s %-10s %-10s %-10s %-10s", headers[0], headers[1], headers[2], headers[3], headers[4], headers[5], headers[6], headers[7]);
        System.out.println(header);
        System.out.println("------------------------------------------------------------------------------------------------------");
        for (Student student : students) {
            System.out.printf("%-20s %-7s %-15s %-10s %-10s %-10s %-10s %-10s", student.getName(), student.countAge(), student.getAddress(), student.getTx1(), student.getTx2(), student.getSemesterGrade(), student.calculateGPA(), student.getOffPeriods());
            System.out.println();
        }
    }

    public static void deleteStudent() {
        System.out.println("Nhập tên sinh viên cần xóa: ");
        String name = sc.nextLine();
        boolean removed = students.removeIf(s -> s.getName().equalsIgnoreCase(name));
        if (!removed) {
            System.out.println("Không tìm thấy sinh viên!");
        }
    }

    public static void main(String[] args) {
        Student studentA = new Student("Đặng Phương Anh", 2006, "Hà Nội", 8.5, 8.5, 9, 2);
        Student studentB = new Student("Hoàng Anh Đức", 2006, "Tuyên Quang", 8, 9, 10, 0);
        Student studentC = new Student("Nguyễn Ngọc Hà", 2006, "Ninh Bình", 7.5, 8.5, 9.5, 4);
        Student studentD = new Student("Hà Đình Lâm", 2006, "Nghệ An", 10, 10, 10, 1);
        Student studentE = new Student("Phan Huyển Trang", 2006, "TP.HCN", 6.5, 8.5, 9, 2);

        students.add(studentA);
        students.add(studentB);
        students.add(studentC);
        students.add(studentD);
        students.add(studentE);

        do {
            System.out.println("\n---QUẢN LÝ SINH VIÊN---");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Sửa thông tin sinh viên");
            System.out.println("3. Sắp xếp sinh viên theo tuổi");
            System.out.println("4. Sắp xếp sinh viên theo GPA");
            System.out.println("5. Sắp xếp sinh viên theo số tiết nghỉ");
            System.out.println("6. Xóa sinh viên");
            System.out.println("7. Hiển thị danh sách sinh viên");
            System.out.println("0. Thoát");

            System.out.println("Chọn: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    updateStudent();
                    break;
                case 3:
                    students.sort(Comparator.comparing(Student::countAge));
                    display();
                    break;
                case 4:
                    students.sort(Comparator.comparing(Student::calculateGPA));
                    display();
                    break;
                case 5:
                    students.sort(Comparator.comparing(Student::getOffPeriods));
                    display();
                    break;
                case 6:
                    deleteStudent();
                    break;
                case 7:
                    display();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
                    break;
            }
        } while (true);
    }
}
