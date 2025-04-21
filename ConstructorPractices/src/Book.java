
public class Book {

    String title;
    double price;

    // Parameterized constructor
    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    // Copy constructor
    public Book createCopy(Book book) {
        return new Book(book.title, book.price);
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }

}
