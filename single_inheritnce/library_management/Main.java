package single_inheritnce.library_management;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Joy of life", 2002);
        Author author = new Author("Think like a monk", 2010, "JayShetty", "abc");
        book.displayInfo();
        author.displayInfo();
    }

}
