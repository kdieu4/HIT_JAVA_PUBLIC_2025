package BTTL;


//import entity.model1.Student;
/*
Mỗi class cần:
- Thuộc tính
- Constructor, Destructor ???
- Phương thức
- Setter, Getter cho mỗi thuộc tính (Mặc định có)
 */
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Dieu", 19);
        student.sayHello();

        student.setName("Jennie");
        student.setAge(29);

        System.out.println("Tên mới: " + student.getName());
        System.out.println("Tuổi mới: " + student.getAge());

        Car car = new Car("Toyota", 100);
        car.checkMaxSpeed();
        car.run();
    }
}