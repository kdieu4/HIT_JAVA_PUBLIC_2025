package Bai2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StaffManager staffManager = new StaffManager(new ArrayList<>());
        staffManager.addStaff(new FullTimeStaff("NV001", "Nguyễn Văn An", 28, "an.nguyen@company.com", "0901234567", 12000000, 2000000));
        staffManager.addStaff(new FullTimeStaff("NV002", "Lê Văn Cường", 30, "cuong.le@company.com", "0987654321", 15000000, 3500000));
        staffManager.addStaff(new PartTimeStaff ("NV003", "Phạm Thị Dung", 22, "dung.pham@company.com", "0971122334", 60, 75000));
        staffManager.addStaff(new PartTimeStaff ("NV004", "Trần Thị Bình", 25, "binh.tran@company.com", "0912345678", 80, 80000));

        System.out.println("=== DANH SÁCH NHÂN VIÊN ===");
        staffManager.printStaffList();

        System.out.println("Tổng quỹ lương: " + staffManager.calculateTotalSalary());
    }
}
