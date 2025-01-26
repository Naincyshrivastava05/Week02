package single_inheritnce.library_management;

class Author extends Book {
    private String name;
    private String bio;

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Name: " + name);
        System.out.println("bio: " + bio);
    }

    public Author(String title, int year, String name, String bio) {
        super(title, year);
        this.name = name;
        this.bio = bio;
    }
}
