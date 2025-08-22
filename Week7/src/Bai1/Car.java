package Bai1;

public class Car implements Movable {
    private String brand;
    private double speed;
    private String color;

    public Car(String brand, double speed, String color) {
        this.brand = brand;
        this.speed = speed;
        this.color = color;
    }

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}
