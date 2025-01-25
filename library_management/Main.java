package encapsulation_and_polymorphism.library_management;

public class Main {
    public static void main(String[] args) {
        // Create Library Items
        LibraryItem book = new Book("B001", "1984", "George Orwell");
        LibraryItem magazine = new Magazine("M001", "National Geographic", "Various");
        LibraryItem dvd = new DVD("D001", "Inception", "Christopher Nolan");

        // Display Item Details and Reserve
        System.out.println("Book Details:");
        book.getItemDetails();
        ((Reservable) book).reserveItem("Alice");
        System.out.println("Loan Duration: " + book.getLoanDuration() + " days\n");

        System.out.println("Magazine Details:");
        magazine.getItemDetails();
        ((Reservable) magazine).reserveItem("Bob");
        System.out.println("Loan Duration: " + magazine.getLoanDuration() + " days\n");

        System.out.println("DVD Details:");
        dvd.getItemDetails();
        ((Reservable) dvd).reserveItem("Charlie");
        System.out.println("Loan Duration: " + dvd.getLoanDuration() + " days\n");

        // Polymorphism Demonstration
        LibraryItem[] libraryItems = {book, magazine, dvd};
        System.out.println("\nProcessing Library Items:");
        for (LibraryItem item : libraryItems) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days\n");
        }
    }
}
