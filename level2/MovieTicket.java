// Class to represent a Movie Ticket
class MovieTicket {
    private String movieName; // Name of the movie
    private int seatNumber;   // Seat number for the ticket
    private double price;     // Price of the ticket

    // Method to book a ticket
    public void bookTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket successfully booked!");
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: $" + price);
    }
}

// Main class to test the MovieTicket class
public class MovieTicketBookingSystem {
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();

        // Book a ticket with specific details
        ticket.bookTicket("Inception", 12, 15.99);

        // Display the ticket details
        ticket.displayTicketDetails();
    }
}
