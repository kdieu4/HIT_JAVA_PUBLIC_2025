package Bai3.Animal;

public class Dog extends Animal{
    private String royal;

    public Dog(String name, int age, String gender, String royal) {
        super(name, age, gender);
        this.royal = royal;
    }

    public Dog(String royal) {
        this.royal = royal;
    }

    public String getRoyal() {
        return royal;
    }

    public void setRoyal(String royal) {
        this.royal = royal;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof woof");
    }
}
