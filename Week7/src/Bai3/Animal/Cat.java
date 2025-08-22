package Bai3.Animal;

public class Cat extends Animal {
    private String cute;

    public Cat(String name, int age, String gender, String cute) {
        super(name, age, gender);
        this.cute = cute;
    }

    public Cat(String cute) {
        this.cute = cute;
    }

    public String getCute() {
        return cute;
    }

    public void setCute(String cute) {
        this.cute = cute;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}
