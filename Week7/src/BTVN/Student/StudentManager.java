package BTVN.Student;

import java.util.ArrayList;

public class StudentManager implements StudentManagerInterface {
    private ArrayList<Student> students;

    public StudentManager(ArrayList<Student> students) {
        this.students = students;
    }

    public StudentManager() {
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public void sortByScoreDesc() {
        students.sort((s1, s2) -> Double.compare(s2.getScore(), s1.getScore()));
        printStudents();
    }

    @Override
    public void sortByScoreAsc() {
        students.sort((s1, s2) -> Double.compare(s1.getScore(), s2.getScore()));
        printStudents();
    }

    @Override
    public Student findByName(String name) {
        for (Student s : students) {
            if (s.getName().equals(name)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public void printStudents() {
        System.out.printf("%-6s | %-20s | %-3s | %-25s | %-8s | %-15s | %-5s | %-5s\n",
                "ID", "Name", "Age", "Email", "Class", "Address", "Score", "Grade");
        System.out.println("----------------------------------------------------------------------------------------------------------");
        for (Student s : students) {
            System.out.printf("%-6s | %-20s | %-3d | %-25s | %-8s | %-15s | %-5.2f | %-5s\n",
                    s.getId(), s.getName(), s.getAge(), s.getEmail(), s.getClassName(), s.getAddress(), s.getScore(), s.getGrade());
        }
    }
}
