package Bai1;

public class Bird extends Animal{
    private String color;

    public Bird(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void makeSound(){
        System.out.println("Bird makeSound");
    }
}
