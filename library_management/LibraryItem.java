package encapsulation_and_polymorphism.library_management;

// Abstract Class LibraryItem
abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    private boolean isAvailable = true; // Availability status

    // Constructor
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Getter Methods
    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Setter Method
    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // Abstract Method to Get Loan Duration
    public abstract int getLoanDuration();

    // Concrete Method to Get Item Details
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }
}