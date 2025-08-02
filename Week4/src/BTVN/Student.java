package BTVN;

import java.time.Year;

public class Student {
    final int id;
    private String name;
    private int yearOfBirth;
    private String address;
    private double tx1;
    private double tx2;
    private double semesterGrade;
    private int offPeriods;

    static int genId = 0;

    static private String format = "%-20s %-7s %-15s %-10s %-10s %-10s %-10s %-10s";

    static public String getHeader() {
        String[] headers = {"Tên", "Tuổi", "Địa chỉ", "Điểm TX1", "Điểm TX2", "Điểm KTHP", "Điểm GPA", "Số tiết nghỉ"};
        return String.format(format, headers[0], headers[1], headers[2], headers[3], headers[4], headers[5], headers[6], headers[7]);
    }

    public Student(String name, int yearOfBirth, String address, double tx1, double tx2, double semesterGrade, int offPeriods) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
        this.tx1 = tx1;
        this.tx2 = tx2;
        this.semesterGrade = semesterGrade;
        this.offPeriods = offPeriods;

        id = ++genId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return this.yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int countAge() {
        Year thisYear = Year.now();
        return thisYear.getValue() - this.yearOfBirth;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getTx1() {
        return this.tx1;
    }

    public void setTx1(double tx1) {
        this.tx1 = tx1;
    }

    public double getTx2() {
        return this.tx2;
    }

    public void setTx2(double tx2) {
        this.tx2 = tx2;
    }

    public double getSemesterGrade() {
        return this.semesterGrade;
    }

    public void setSemesterGrade(double semesterGrade) {
        this.semesterGrade = semesterGrade;
    }

    public double calculateGPA() {
        return (this.tx1 * 0.2 + this.tx2 * 0.3 + this.semesterGrade * 0.5);
    }

    public int getOffPeriods() {
        return this.offPeriods;
    }

    public void setOffPeriods(int offPeriods) {
        this.offPeriods = offPeriods;
    }

    String displayAll() {
        return String.format(format, getName(), countAge(), getAddress(), getTx1(), getTx2(), getSemesterGrade(), calculateGPA(), getOffPeriods());
    }
}
