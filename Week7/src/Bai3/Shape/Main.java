package Bai3.Shape;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5.4);
        Shape rectangle = new Rectangle(5.4, 5.4);
        System.out.println("Diện tích hình tròn: " + Math.round(circle.area() * 100) / 100.0);
        System.out.println("Diệnt tích hình chữ nhật: " + Math.round(rectangle.area() * 100) / 100.0);
    }
}
