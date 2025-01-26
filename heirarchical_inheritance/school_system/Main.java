package heirarchical_inheritance.school_system;

public class Main {
    public static void main(String[] args) {
        // Create objects for each role
        Teacher teacher = new Teacher("Alice", 35, "Mathematics");
        Student student = new Student("Bob", 16, "10th Grade");
        Staff staff = new Staff("Charlie", 40, "Administration");

        // Display information for each role
        System.out.println("\nTeacher Details:");
        teacher.displayInfo();

        System.out.println("\nStudent Details:");
        student.displayInfo();

        System.out.println("\nStaff Details:");
        staff.displayInfo();
    }

}
