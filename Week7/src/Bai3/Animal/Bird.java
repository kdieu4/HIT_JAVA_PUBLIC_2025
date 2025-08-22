package Bai3.Animal;

public class Bird extends Animal{
    private String species;

    public Bird(String species) {
        this.species = species;
    }

    public Bird(String name, int age, String gender, String species) {
        super(name, age, gender);
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public void makeSound() {
        System.out.println("Tweet tweet");
    }
}
