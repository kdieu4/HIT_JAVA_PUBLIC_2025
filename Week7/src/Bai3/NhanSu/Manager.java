package Bai3.NhanSu;

public class Manager extends Employee{
    private double bonus;

    public Manager(double basicSalary, double bonus) {
        super(basicSalary);
        this.bonus = bonus;
    }

    public Manager(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getBasicSalary(){
        return super.getBasicSalary() + this.bonus;
    }
}
