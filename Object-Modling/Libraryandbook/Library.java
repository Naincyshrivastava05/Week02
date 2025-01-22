import java.util.ArrayList;

public class Library {
    private String libraryName; // Name of the library
    private ArrayList<Book> books; // List of books in the library

    // Constructor to initialize library name and book list
    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added to " + libraryName + ": " + book);
    }

    // Method to display library details and the books it contains
    public void displayLibraryDetails() {
        System.out.println("Library Name: " + libraryName);
        System.out.println("Books in the Library:");
        for (Book book : books) {
            book.displayDetails();
        }
    }
}
