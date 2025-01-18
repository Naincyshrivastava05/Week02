public class Book {
    // Private member variables to store book details
    private String title;
    private String author;
    private int price;
	
			public Book(){
				System.out.println("Initializing book");
			}

    // Constructor to initialize the book details
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display the details of the book
    public void display() {
        // Print the title of the book
        System.out.println("The title of the Book is " + title);
        // Print the author of the book
        System.out.println("The author of the Book is " + author);
        // Print the price of the book
        System.out.println("The price of the Book is " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Book object with title, author, and price
        Book book = new Book("Think like a monk", "Jay Shetty", 200);
        
        // Display the details of the book
        book.display();
    }
}
