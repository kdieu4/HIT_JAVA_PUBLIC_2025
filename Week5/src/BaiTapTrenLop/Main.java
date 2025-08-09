package BaiTapTrenLop;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cage cageA = new Cage("001", new ArrayList<>(), 0);
        Cage cageB = new Cage("002", new ArrayList<Pet>(), 0);
        System.out.println("Số lồng đã tạo: " + Cage.getTotalCages());
        cageB.addPet(new Pet("kitty", 5, "Cat"));
        cageA.addPet(new Pet("honey", 4, "Dog"));
        cageA.addPet(new Pet("snow", 2, "Cat"));
        cageA.addPet(new Pet("wolf", 11, "Cat"));
        cageA.addPet(new Pet("panda", 8, "Panda"));
        System.out.println("Danh sách thú lồng A: ");
        cageA.printAllPets();
        System.out.println("Danh sách thú lồng B: ");
        cageB.printAllPets();
        cageA.printOver10("A");
        cageB.printOver10("B");
    }
}