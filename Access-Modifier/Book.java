class Book {
    // Fields
    public String ISBN;
    protected String title;
    private String author;

    // Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass to demonstrate access modifiers
class EBook extends Book {
    private double fileSize; // in MB

    // Constructor
    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    // Method to display eBook details
    public void displayEBookDetails() {
        System.out.println("ISBN: " + ISBN); // Accessing public member
        System.out.println("Title: " + title); // Accessing protected member
        System.out.println("File Size: " + fileSize + " MB");
    }
}

// Main class for testing
public class BookLibrarySystem {
    public static void main(String[] args) {
        // Create a Book object
        Book book = new Book("978-3-16-148410-0", "Java Programming", "John Doe");
        book.displayBookDetails();
        System.out.println();

        // Modify author
        book.setAuthor("Jane Smith");
        System.out.println("Updated Author: " + book.getAuthor());
        System.out.println();

        // Create an EBook object
        EBook ebook = new EBook("978-1-23-456789-0", "Advanced Java", "Alice Brown", 5.2);
        ebook.displayEBookDetails();
    }
}
