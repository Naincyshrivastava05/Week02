package encapsulation_and_polymorphism.library_management;

// Magazine Class
class Magazine extends LibraryItem implements Reservable {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // Loan duration for magazines is 7 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable()) {
            setAvailable(false);
            System.out.println("Magazine reserved for: " + borrowerName);
        } else {
            System.out.println("Magazine is currently unavailable.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}
