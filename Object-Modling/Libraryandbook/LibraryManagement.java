public class LibraryManagement {
  
  public static void main(String[] args) {
      // Create books
      Book book1 = new Book("1984", "George Orwell");
      Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
      Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald");

      // Create libraries
      Library library1 = new Library("City Library");
      Library library2 = new Library("University Library");

      // Add books to libraries (demonstrating aggregation)
      library1.addBook(book1);
      library1.addBook(book2);

      library2.addBook(book2); // A book can exist in multiple libraries
      library2.addBook(book3);

      // Display details of each library
      System.out.println("Details of Library 1:");
      library1.displayLibraryDetails();

      System.out.println("Details of Library 2:");
      library2.displayLibraryDetails();
  }
}
