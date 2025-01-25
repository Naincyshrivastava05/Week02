package encapsulation_and_polymorphism.library_management;

// DVD Class
class DVD extends LibraryItem implements Reservable {
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 5; // Loan duration for DVDs is 5 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable()) {
            setAvailable(false);
            System.out.println("DVD reserved for: " + borrowerName);
        } else {
            System.out.println("DVD is currently unavailable.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}