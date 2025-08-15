package Bai1;

public class Student {
    private String studentId;
    private String studentName;
    private double GPA;
    private Class class1 = new Class();

    public Student(String studentId, String studentName, double GPA, Class class1) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.GPA = GPA;
        this.class1 = class1;
    }

    public Student() {
    }

    public void printInformation() {
        System.out.println("Mã sinh viên: " + studentId);
        System.out.println("Họ và tên: " + studentName);
        class1.printInformation();
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    public Class getClass1() {
        return class1;
    }

    public void setClass1(Class class1) {
        this.class1 = class1;
    }
}
