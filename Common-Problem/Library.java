public class Library {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Default constructor
    public Library() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
        this.isAvailable = true;
    }

    // Parameterized constructor
    public Library(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Getter and Setter methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    // Method to borrow a book
    public boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("The book '" + title + "' has been borrowed.");
            return true;
        } else {
            System.out.println("The book '" + title + "' is currently unavailable.");
            return false;
        }
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }

    public static void main(String[] args) {
        // Creating a book using the parameterized constructor
        Library book1 = new Library("The Great Gatsby", "F. Scott Fitzgerald", 10.99, true);

        // Displaying book details
        System.out.println("Book Details:");
        book1.displayBookDetails();

        // Borrowing the book
        System.out.println("\nAttempting to borrow the book:");
        book1.borrowBook();

        // Attempting to borrow the book again
        System.out.println("\nAttempting to borrow the book again:");
        book1.borrowBook();

        // Displaying book details after borrowing
        System.out.println("\nUpdated Book Details:");
        book1.displayBookDetails();
    }
}
