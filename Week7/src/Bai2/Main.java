package Bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book [] books = new Book[3];
//        books[0] = new Book("Chiếc thuyền ngoài xa", "Nguyễn Minh Châu");
//        books[1] = new Book("Tắt đèn", "Ngô Tất Tố");
//        books[2] = new Book("Chí phèo", "Nam Cao");
//        books[3] = new Book("Vội vàng", "Xuân Diệu");
//        for(int i = 0; i < books.length; i++)
//            System.out.println(books[i].toString());
//
//        Person person = new Person("Thế Lữ", 45, new Address ("Trần Hưng Đạo", "Hà Tĩnh"));
//        System.out.println(person.toString());
//
//        Calculator calculator = new Calculator();
//        System.out.println("Tổng a + b = " + calculator.sum(5, 4));
//        System.out.println("Tổng a + b = " + calculator.sum(5.4, 4.9));
//        System.out.println("Tổng a + b = " + calculator.sum(5, 4, 8));
//
//        System.out.println("Diện tích hình tròn: " + MathUtils.circleArea(5));
        Scanner sc = new Scanner(System.in);
        try {
            for(int i = 0; i < books.length; i++){
                System.out.println("Enter the name of the book " + (i + 1) + ": " );
                System.out.println("Enter the book title: ");
                String bookTitle = sc.nextLine();
                System.out.println("Enter the book author: ");
                String bookAuthor = sc.nextLine();

                books[i] = new Book(bookTitle, bookAuthor);
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        for (int i = 0; i < books.length; i++)
            System.out.println(books[i].toString());

    }
}
