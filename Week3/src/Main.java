import java.util.Scanner;

public class Main {
    final static int monthInYear = 12; // final: từ khóa cho biến không thay đổi

    // static: phương thức tĩnh, thuộc về class
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số năm: ");
        int a = sc.nextInt();
        System.out.println(a * monthInYear);
        */
        /*
        double rounded = Math.round(7.45555 * 100.0) / 100.0;
        double ceil = Math.ceil(7.2); // làm tròn theo trần
        double floor = Math.floor(7.2); // làm tròn theo sàn
        System.out.println(ceil);
        System.out.println(floor);
        */
        /*
        double randomValue = (int)(Math.random() * 100); // random 1 số từ 0 đến dưới 1
        System.out.println(randomValue);
         */
        /*
        String a = "hello";
        String b = "good";
        int c = 10;
        System.out.println(a + " " + b + " " + c);
        //System.out.println(a.concat(" ").concat(b));
         */

        String sentences = "Java HIT";
        String sub = sentences.substring(0, 2);
        int index = sentences.indexOf("HI");
       // System.out.println(sub);

        String name = "   Dieu Hoang  ";
        String trimmedName = name.trim();
        //System.out.println(trimmedName);

        String username = "Hoang Dieu";
        username = username.trim();
        String[] fullName = username.split(" ");
        String firstName = fullName[1];
        String lastName = fullName[0];
        //System.out.println("firstname: " + firstName);
        //System.out.println("lastname: " + lastName);

        int number = 123;
        String str = String.valueOf(number); // chuyển từ số sang chuỗi
        //System.out.println(str);

        String a = "123456";
        System.out.println(a.charAt(a.length() - 1)); // lấy ra phần tử cuối

    }
}