public class Course {
    // Instance Variables
    private String courseName;
    private int duration; // in weeks
    private double fee;

    // Class Variable
    private static String instituteName = "Default Institute";

    // Constructor to initialize course details
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance Method: Display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: $" + fee);
        System.out.println("Institute: " + instituteName);
    }

    // Class Method: Update institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Update institute name
        Course.updateInstituteName("Tech Academy");

        // Create courses
        Course course1 = new Course("Java Programming", 6, 300.00);
        Course course2 = new Course("Web Development", 8, 400.00);
        Course course3 = new Course("Data Science", 10, 500.00);

        // Display details of each course
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
        System.out.println();
        course3.displayCourseDetails();
    }
}
