public class Cat extends Animal {
    private String sound;

    public Cat(int age) {
        super(age);
    }

    public Cat() {
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }
}
