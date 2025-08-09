package BTVN.Bai2;

import java.util.Scanner;

public class Manager {
    private String managerID;
    private String fullName;

    public Manager(String managerID, String fullName) {
        this.managerID = managerID;
        this.fullName = fullName;
    }

    public Manager() {}

    public void input(Scanner sc) {
        System.out.print("Nhập mã quản lý: ");
        this.managerID = sc.nextLine();
        System.out.println("Nhập họ và tên: ");
        this.fullName = sc.nextLine();
    }

    public void output(){
        System.out.println("Mã quản lý: " + this.managerID);
        System.out.println("Họ và tên: " + this.fullName);
    }

    public String getManagerID() {
        return managerID;
    }

    public void setManagerID(String managerID) {
        this.managerID = managerID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
