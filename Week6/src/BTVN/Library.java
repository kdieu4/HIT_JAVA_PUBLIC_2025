package BTVN;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books = new ArrayList<>();

    public Library() {
    }

    public Library(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        books.add(book);
//        Book.bookId += 1;
    }

    public void displayAllBooks(boolean showPublisher) {
        if(showPublisher) {
            for (Book book : books) {
                book.displayInformation(true);
                System.out.println("---------");
            }
        }
        else {
            for (Book book : books) {
                book.displayInformation();
                System.out.println("---------");
            }
        }
    }

    public void searchByAuthor(String author) {
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                book.displayInformation(true);
            }
        }
    }

    public boolean removeBookById(int bookId) {
        int count = 0;
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                books.remove(book);
                count += 1;
            }
        }
        if (count == 0) {
            System.out.println("Không tìm thấy...!");
            return false;
        }
        return true;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
