package Bai1;

public class Class {
    private String classId;
    private String className;

    public Class(String className, String classId) {
        this.className = className;
        this.classId = classId;
    }
    public Class () {}

    public void printInformation(){
        System.out.println("Mã lớp: " + classId);
        System.out.println("Tên lớp: " + className);
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
