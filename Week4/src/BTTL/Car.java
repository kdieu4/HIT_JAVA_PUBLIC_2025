package BTTL;

public class Car {
    private String brand;
    private int maxSpeed;
    private static final int MAX_SPEED = 90;

    public Car(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return this.brand;
    }

    public void checkMaxSpeed() {
        if (this.maxSpeed > MAX_SPEED) {
            System.out.println("Bạn đã đi quá tốc độ cho phép!");
        }
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void run() {
        System.out.println("Xe " + brand + " đang chạy với tốc độ tối đa " + maxSpeed + " km/h");
    }
}
