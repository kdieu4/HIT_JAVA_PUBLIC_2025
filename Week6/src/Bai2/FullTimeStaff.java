package Bai2;

public class FullTimeStaff extends Staff {
    private double basicSalary;
    private double bonusSalary;

    public FullTimeStaff(double basicSalary, double bonusSalary) {
        this.basicSalary = basicSalary;
        this.bonusSalary = bonusSalary;
    }

    public FullTimeStaff(String staffId, String staffName,int staffAge, String staffEmail, String staffPhoneNumber, double basicSalary, double bonusSalary) {
        super(staffPhoneNumber, staffEmail, staffAge, staffName, staffId);
        this.basicSalary = basicSalary;
        this.bonusSalary = bonusSalary;
    }

    @Override
    public double calculateSalary() {
        return this.basicSalary + this.bonusSalary;
    }

    @Override
    public String toString() {
        return "---Nhân viên Full Time---" + '\n' +
                super.toString() +
                " Lương cơ bản: " + basicSalary + '\n' +
                " Lương thưởng: " + bonusSalary + '\n';
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(double bonusSalary) {
        this.bonusSalary = bonusSalary;
    }
}
