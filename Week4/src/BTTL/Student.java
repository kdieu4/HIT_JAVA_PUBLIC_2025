package BTTL;
public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void sayHello(){
        System.out.println("Xin chào, tôi tên là " + name + ", năm nay " + age + " tuổi\n");
    }
}
