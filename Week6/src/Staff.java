public class Staff extends Person {
    private int salary;

    public Staff(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    public Staff(int salary) {
        this.salary = salary;
    }

    public Staff() {}

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
