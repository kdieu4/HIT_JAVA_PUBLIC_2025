package Bai1;

public class Bike implements Movable {
    private String brand;

    public Bike(String brand) {
        this.brand = brand;
    }

    public Bike() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void move() {
        System.out.println("Bike is moving");
    }
}
