package BTVN;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library(new ArrayList<>());
        while (true) {
            System.out.println("===MENU===\n" +
                    "1. Thêm sách vào thư viện\n" +
                    "2. Hiển thị danh sách\n" +
                    "3. Tìm sách theo tác giả\n" +
                    "4. Xóa sách theo mã sách và hiển thị kết quả\n" +
                    "5. Thoát chương trình");
            System.out.print("Chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Nhập tiêu đề: ");
                    String title = scanner.next();
                    scanner.nextLine();
                    System.out.print("Tác giả: ");
                    String author = scanner.next();
                    System.out.print("Giá: ");
                    double price = scanner.nextDouble();
                    System.out.print("Tên nhà xuất bản: ");
                    String publisherName = scanner.next();
                    scanner.nextLine();
                    System.out.print("Địa chỉ: ");
                    String publisherAddress = scanner.next();
                    System.out.println();
                    library.addBook(new Book(title, author, price, new Publisher(publisherName, publisherAddress)));
//                    library.addBook(new Book(title, author, price));
                    break;
                case 2:
                    System.out.println("Bạn có muốn hiển thị nhà xuất bản không (y/n): ");
                    char isShowPublisher = scanner.next().charAt(0);
                    library.displayAllBooks(isShowPublisher == 'y' || isShowPublisher == 'Y');
                    break;
                case 3:
                    System.out.println("Nhập tên tác giả: ");
                    String authorToFind = scanner.next();
                    library.searchByAuthor(authorToFind);
                    break;
                case 4:
                    System.out.println("Nhập id sách muốn xóa: ");
                    int id = scanner.nextInt();
                    if (library.removeBookById(id)) {
                        System.out.println("Xóa sách thành công...!");
                    }
                    break;
                default:
                    System.exit(0);
                    break;
            }
        }
    }
}
