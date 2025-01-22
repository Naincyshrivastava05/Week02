// Define the Book class
public class Book {
    // Instance variables for book title and author
    private String title, author;

    // Final instance variable for ISBN (unique identifier for the book)
    private final int isbn;

    // Static variable for the library name, common to all instances
    static String libraryName = "BookBank Library";

    // Static method to display the library name
    public static void displayLibraryName() {
        System.out.println("Name of library is " + libraryName);
    }

    // Constructor to initialize the book's title, author, and ISBN
    public Book(String title, String author, int isbn) {
        this.title = title; // Set the title
        this.author = author; // Set the author
        this.isbn = isbn; // Set the ISBN
    }

    // Method to display book details
    public void display() {
        System.out.println("Library: " + libraryName); // Display library name
        System.out.println("Title: " + title); // Display book title
        System.out.println("Author: " + author); // Display book author
        System.out.println("ISBN: " + isbn); // Display book ISBN
    }

    // Main method, entry point of the program
    public static void main(String[] args) {
        // Create a new Book object
        Book book = new Book("Think like a monk", "Jay Shetty", 1234);

        // Check if the object 'book' is an instance of the Book class
        if (book instanceof Book)
            System.out.println("Yes, it is an instance of that class.");
        else
            System.out.println("No");

        // Call the static method to display the library name
        book.displayLibraryName();

        // Call the instance method to display book details
        book.display();
    }
}
