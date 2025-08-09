package BTVN.Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class ComputerRoom {
    private String roomID;
    private String roomName;
    private double area;

    private Manager manager = new Manager();
    private ArrayList<Computer> computers = new ArrayList<>();

    private int numComputer;

    public ComputerRoom(String roomID, String roomName, double area, Manager manager, ArrayList<Computer> computers, int numComputer) {
        this.roomID = roomID;
        this.roomName = roomName;
        this.area = area;
        this.manager = manager;
        this.computers = computers;
        this.numComputer = numComputer;
    }

    public ComputerRoom() {
    }

    public void input(Scanner sc) {
        System.out.print("Nhập mã phòng: ");
        this.roomID = sc.nextLine();
        System.out.print("Nhập tên phòng: ");
        this.roomName = sc.nextLine();
        System.out.print("Nhập diện tích phòng: ");
        this.area = sc.nextDouble();
        sc.nextLine();
        manager.input(sc);
        System.out.print("Nhập số máy trong phòng: ");
        this.numComputer = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < numComputer; i++) {
            System.out.println("Nhập thông tin máy thứ " + (i + 1));
            Computer computer = new Computer();
            computer.input(sc);
            computers.add(computer);
        }
    }

    public void output() {
        System.out.println("Mã phòng: " + this.roomID);
        System.out.println("Tên phòng: " + this.roomName);
        System.out.println("Diện tích phòng: " + this.area);
        manager.output();
        for(int i = 0; i < numComputer; i++) {
            System.out.println("Máy " + (i + 1));
            computers.get(i).output();
        }
    }

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public ArrayList<Computer> getComputers() {
        return computers;
    }

    public void setComputers(ArrayList<Computer> computers) {
        this.computers = computers;
    }

    public int getNumComputer() {
        return numComputer;
    }

    public void setNumComputer(int numComputer) {
        this.numComputer = numComputer;
    }
}


