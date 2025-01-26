package single_inheritnce.library_management;


class Book {
    private String title;
    private int publicationYear;

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("PublicationYear: " + publicationYear);
    }

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
}
