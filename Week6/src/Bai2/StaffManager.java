package Bai2;

import java.util.ArrayList;
import java.util.List;

public class StaffManager {
    List<Staff> staffList = new ArrayList<>();

    public StaffManager(List<Staff> staffList) {
        this.staffList = staffList;
    }

    public StaffManager() {}

    public void addStaff(Staff staff) {
        staffList.add(staff);
    }

    public List<Staff> getStaffList() {
        return staffList;
    }

    public void setStaffList(List<Staff> staffList) {
        this.staffList = staffList;
    }

    public void printStaffList() {
        for (Staff staff : staffList) {
            System.out.println(staff);
        }
    }

    public double calculateTotalSalary() {
        double salary = 0;
        for (Staff staff : staffList) {
            salary += staff.calculateSalary();
        }
        return salary;
    }
}
