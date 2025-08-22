package Bai1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Rectangle(5, 5));
        shapes.add(new Rectangle(3, 3));
        shapes.add(new Rectangle(4, 4));
        shapes.add(new Circle(5));
        shapes.add(new Circle(6));
//        for(Shape shape : shapes)
//            System.out.println("Diện tích: " + shape.area());

        ArrayList<Movable> movables = new ArrayList<>();
        movables.add(new Car("Toyota", 120, "Blue" ));
        movables.add(new Car("Toyota", 120, "Red" ));
        movables.add(new Bike("Yamaha"));
//        for(Movable movable : movables)
//            movable.move();

        Animal[] animals = new Animal[1];
        animals[0] = new Cat("White");

        for (Animal animal : animals) {
            animal.makeSound();
        }


    }
}
