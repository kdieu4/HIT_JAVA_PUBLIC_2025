package BaiTapTrenLop;

import java.util.ArrayList;

public class Cage {
    private String cageCode;

    private ArrayList<Pet> pets = new ArrayList<>();

    private int currentPetCount;

    private static int totalCages = 0; // Tổng số lồng đã tạo
    private final int MAX_CAPACITY = 3;

    public Cage(String cageCode, ArrayList<Pet> pets, int currentPetCount) {
        this.cageCode = cageCode;
        this.pets = pets;
        this.currentPetCount = currentPetCount;
        Cage.totalCages += 1;
    }

    public Cage() {
    }

    public void addPet(Pet pet) {
        if (this.currentPetCount < MAX_CAPACITY) {
            pets.add(pet);
            currentPetCount++;
        } else {
            System.out.println(this.cageCode + " is full");
            return;
        }
    }

    public void printAllPets() {
        for (Pet x : pets) {
            System.out.println(x);
        }
    }

    public void printOver10(String name) {
        int count = 0;
        for (Pet x : pets) {
            if (x.getWeight() > 10) {
                System.out.println("Cac con thu nang hon 10 trong long " + name);
                System.out.println(x);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Khong co con thu nang hon 10 trong long " + name);
        }
    }

    public String getCageCode() {
        return cageCode;
    }

    public void setCageCode(String cageCode) {
        this.cageCode = cageCode;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }

    public int getCurrentPetCount() {
        return currentPetCount;
    }

    public void setCurrentPetCount(int currentPetCount) {
        this.currentPetCount = currentPetCount;
    }

    public static int getTotalCages() {
        return totalCages;
    }

    public static void setTotalCages(int totalCages) {
        Cage.totalCages = totalCages;
    }
}
