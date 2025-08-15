package Bai2;

public class PartTimeStaff extends Staff {
    private int hoursWorked;
    private double salaryPerHour;

    public PartTimeStaff(int hoursWorked, double salaryPerHour) {
        this.hoursWorked = hoursWorked;
        this.salaryPerHour = salaryPerHour;
    }

    public PartTimeStaff(String staffId, String staffName,int staffAge, String staffEmail, String staffPhoneNumber, int hoursWorked, double salaryPerHour) {
        super(staffPhoneNumber, staffEmail, staffAge, staffName, staffId);
        this.hoursWorked = hoursWorked;
        this.salaryPerHour = salaryPerHour;
    }

    @Override
    public double calculateSalary() {
        return this.salaryPerHour * this.hoursWorked;
    }

    @Override
    public String toString() {
        return "---Nhân viên Part Time---" + '\n' +
                super.toString() +
                " Giờ làm: " + hoursWorked + '\n' +
                " Lương theo giờ: " + salaryPerHour + '\n';
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(double salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }
}
