import java.util.ArrayList;

public class Book {
    private String title; // Title of the book
    private String author; // Author of the book

    // Constructor to initialize book details
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}
