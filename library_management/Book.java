package encapsulation_and_polymorphism.library_management;

// Book Class
class Book extends LibraryItem implements Reservable {
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // Loan duration for books is 14 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable()) {
            setAvailable(false);
            System.out.println("Book reserved for: " + borrowerName);
        } else {
            System.out.println("Book is currently unavailable.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}

