abstract public class Animal {
    private int age;

    public abstract void eat();

    public void sleep() {
        System.out.println("Animal is sleeping");
    }

    public Animal(int age) {
        this.age = age;
    }

    public Animal() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
