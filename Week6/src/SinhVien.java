public class SinhVien extends Person{
    private int studentCode;
    private String school;

    public SinhVien(String name, int age, String school, int studentCode) {
        super(name, age);
        this.school = school;
        this.studentCode = studentCode;
    }

    public SinhVien(String school, int studentCode) {
        this.school = school;
        this.studentCode = studentCode;
    }
    public SinhVien() {}

    public void graduate(boolean isGraduate) {
        if (isGraduate) {
            System.out.println("Đã tốt nghiệp...!");
        }
        else {
            System.out.println("Chưa tốt nghiệp");
        }
    }
    @Override
    public void eat() {
        System.out.println("Tôi đang uống.");
    }

    public int getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
