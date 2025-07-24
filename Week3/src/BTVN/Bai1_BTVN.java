package BTVN;

import java.util.Scanner;

public class Bai1_BTVN {
    public static Scanner sc = new Scanner(System.in);
    public static final String SQUARE = "SQUARE";
    public static final String TRIANGLE = "TRIANGLE";
    public static final String CIRCLE = "CIRCLE";

    public static boolean isTriangle(double a, double b, double c) {
        return (a + b >= c && a + c >= b && b + c >= a);
    }
    public static double calculateAreaSquare (){
        System.out.print("Nhập cạnh của hình vuông: ");
        double x = sc.nextDouble();
        return x*x;
    }
    public static double calculateAreaTriangle () {
        double area = 0.0;
        System.out.println("Nhập kích thước của 3 cạnh hình tam giác: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if(isTriangle(a, b, c)){
            double p = (a + b + c) / 2;
            area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return area;
    }
    public static double calculateAreaCircle () {
        System.out.println("Nhập bán kính hình tròn: ");
        double r = sc.nextDouble();
        return Math.PI*r*r;
    }
    public static double calculateArea(String type){
        double area;
        if(type.equalsIgnoreCase(SQUARE)) {
            area = calculateAreaSquare();
        }
        else if (type.equalsIgnoreCase(TRIANGLE)){
            area = calculateAreaTriangle();
        }
        else{
            area = calculateAreaCircle();
        }
        return area;
    }

    public static void main(String[] args) {
        System.out.println("Nhập hình dạng viên gạch (Square, Triangle, Circle): ");
        String type = sc.nextLine();

        if (type.equalsIgnoreCase(SQUARE) || type.equalsIgnoreCase(TRIANGLE) || type.equalsIgnoreCase(CIRCLE)) {
            System.out.println("Diện tích viên gạch là: " + Math.round(calculateArea(type) * 100.0) / 100.0);
        }
        else{
            System.out.println("Hình dạng không hợp lệ!");
        }
    }
}
