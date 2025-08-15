package BTVN;

public class Book {
    private static int nextID = 0;
    private int bookId;
    private String title;
    private String author;
    private double price;
    private Publisher publisher = new Publisher();

    public Book(String title, String author, double price, Publisher publisher) {
        this.bookId = nextID++;
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher.setName("Unknown");
        this.publisher.setAddress("Unknown");
    }

    @Override
    public String toString() {
        return "Book{" +
                "price=" + price +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    public void displayInformation() {
        System.out.println("Id sách: " + this.bookId +
                "\nTiêu đề: " + this.title +
                "\nTác giả: " + this.author +
                "\nGiá cả: " + this.price);
    }

    public void displayInformation(boolean showPublisher) {
        if (showPublisher) {
            displayInformation();
            System.out.println("Nhà xuất bản: " + this.publisher.getName() +
                    "\nĐịa chỉ: " + this.publisher.getAddress());
        } else {
            displayInformation();
            System.out.println("\nNhà xuất bản: Unknown");
        }
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
}
