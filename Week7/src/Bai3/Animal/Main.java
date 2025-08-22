package Bai3.Animal;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0] = new Dog("Puppy", 5, "Male", "Best");
        animals[1] = new Dog("Baby", 3, "Female", "Normal");
        animals[2] = new Cat("Kitty", 2, "Female", "Best");
        animals[3] = new Cat("Jack", 1, "Male", "Best");
        animals[4] = new Bird("Jack", 1, "Male", "Lark");

        for (Animal a : animals) {
            a.makeSound();
        }
    }
}
