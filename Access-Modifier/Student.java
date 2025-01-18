class Student {
    // Fields
    public int rollNumber;
    protected String name;
    private double CGPA;

    // Constructor
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Getter for CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Setter for CGPA
    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 10.0) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA value. Must be between 0.0 and 10.0.");
        }
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

// Subclass to demonstrate use of protected member
class PostgraduateStudent extends Student {
    private String specialization;

    // Constructor
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    // Method to display postgraduate student details
    public void displayPostgraduateDetails() {
        System.out.println("Roll Number: " + rollNumber); // Accessing public member
        System.out.println("Name: " + name); // Accessing protected member
        System.out.println("Specialization: " + specialization);
    }
}

// Main class for testing
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student(101, "Alice", 9.2);
        student.displayDetails();
        System.out.println();

        // Modify and access CGPA
        student.setCGPA(8.5);
        System.out.println("Updated CGPA: " + student.getCGPA());
        System.out.println();

        // Create a PostgraduateStudent object
        PostgraduateStudent pgStudent = new PostgraduateStudent(102, "Bob", 9.0, "Computer Science");
        pgStudent.displayPostgraduateDetails();
    }
}
