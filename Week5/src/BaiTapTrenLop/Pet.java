package BaiTapTrenLop;

public class Pet {
    private final double overWeight = 10;
    private String name;
    private double weight;
    private String species;


    public Pet(String name, double weight, String species) {
        this.name = name;
        this.weight = weight;
        this.species = species;
    }

    public void printInformation() {
        System.out.println("Pet name: " + this.name);
        System.out.println("Pet weight: " + this.weight);
        System.out.println("Pet species: " + this.species);
    }

    public String toString() {
        return "Pet name: " + this.name
                + ", weight: " + this.weight
                + ", species: " + this.species;
    }

    public boolean isOverWeight() {
        return this.weight > this.overWeight;
    }

    public String getBasicInformation() {
        return this.name + " belongs to the cat species " + this.species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
