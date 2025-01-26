package multilevel_inheritance.education_heirarchy;

// Base class Course
class Course {
    protected String courseName;
    protected int duration; // in weeks

    // Constructor for the base class
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Method to display course information
    public void displayInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
    }
}
