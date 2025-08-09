package BaiTapTrenLop;

public class Car {
    private final int speedMax = 70;

    private int speed;
    private String brand;

    public Car(int speed, String brand) {
        this.speed = speed;
        this.brand = brand;
    }

    public Car() {
    }

    public boolean checkSpeed() {
        return this.speed <= this.speedMax;
    }
    public int getSpeedMax() {
        return speedMax;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
