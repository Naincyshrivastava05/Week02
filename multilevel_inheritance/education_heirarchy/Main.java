package multilevel_inheritance.education_heirarchy;

public class Main {
    public static void main(String[] args) {
        // Create a Course object
        Course generalCourse = new Course("Java Basics", 6);
        generalCourse.displayInfo();

        System.out.println();

        // Create an OnlineCourse object
        OnlineCourse onlineCourse = new OnlineCourse("Python for Beginners", 8, "Coursera", true);
        onlineCourse.displayInfo();

        System.out.println();

        // Create a PaidOnlineCourse object
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Advanced Machine Learning", 12, "Udemy", false, 199.99, 20);
        paidCourse.displayInfo();
    }

}
