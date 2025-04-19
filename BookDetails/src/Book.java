// Create a class Book with attributes title, author, and price.
// Implement a method to display the book's details

public class Book {

    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Attributes
    String title;
    String author;
    double price;

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

}
