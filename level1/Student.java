public class Student {
  private static String universityName = "Global University"; // Shared across all students
  private static int totalStudents = 0; // Total number of students

  private final String rollNumber; // Unique, immutable roll number
  private String name; // Student's name
  private String grade; // Student's grade

  // Constructor to initialize student details
  public Student(String rollNumber, String name, String grade) {
      this.rollNumber = rollNumber;
      this.name = name;
      this.grade = grade;
      totalStudents++;
  }

  // Static method to display total students
  public static void displayTotalStudents() {
      System.out.println("Total Students Enrolled: " + totalStudents);
  }

  // Method to display student details
  public void displayDetails() {
      System.out.println("University Name: " + universityName);
      System.out.println("Roll Number: " + rollNumber);
      System.out.println("Name: " + name);
      System.out.println("Grade: " + grade);
  }

  // Main method
  public static void main(String[] args) {
      Student student = new Student("S101", "Alice", "A");

      // Check if the object is an instance of the Student class
      if (student instanceof Student) {
          System.out.println("Processing a student object.");
      }

      // Display student details and total students
      student.displayDetails();
      Student.displayTotalStudents();
  }
}
