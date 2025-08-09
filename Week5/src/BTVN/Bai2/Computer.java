package BTVN.Bai2;

import java.util.Scanner;

public class Computer {
    private String computerID;
    private String computerName;
    private String status;

    public Computer(String computerID, String computerName, String status) {
        this.computerID = computerID;
        this.computerName = computerName;
        this.status = status;
    }
    public Computer(){}
    public void input (Scanner sc){
        System.out.print("Nhập mã máy: ");
        this.computerID = sc.nextLine();
        System.out.print("Nhập tên máy: ");
        this.computerName = sc.nextLine();
        System.out.print("Nhập trạng thái: ");
        this.status = sc.nextLine();
    }

    public void output(){
        System.out.println("Mã máy: " + this.computerID);
        System.out.println("Tên máy: " + this.computerName);
        System.out.println("Trạng thái: " + this.status);
    }
    public String getComputerID() {
        return computerID;
    }

    public void setComputerID(String computerID) {
        this.computerID = computerID;
    }

    public String getComputerName() {
        return computerName;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
