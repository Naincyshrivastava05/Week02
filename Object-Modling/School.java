
import java.util.ArrayList;
import java.util.List;

// Student Class
class Student {
    private String name;
    private List<Course> courses;  // A student can enroll in multiple courses

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollInCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this);  // Add this student to the course
        }
    }

    public void viewCourses() {
        System.out.println(name + " is enrolled in the following courses:");
        for (Course course : courses) {
            System.out.println("- " + course.getCourseName());
        }
    }
}

// Course Class
class Course {
    private String courseName;
    private List<Student> students;  // A course can have multiple students

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public void viewEnrolledStudents() {
        System.out.println("The following students are enrolled in " + courseName + ":");
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }
}

// School Class
class School {
    private String name;
    private List<Student> students;  // A school can have multiple students

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public void showStudents() {
        System.out.println("Students in " + name + " school:");
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }
}

public class Main{
    public static void main(String[] args) {
        // Create the school
        School school = new School("Greenwood High");

        // Create students
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // Add students to the school
        school.addStudent(student1);
        school.addStudent(student2);

        // Create courses
        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Science");

        // Enroll students in courses
        student1.enrollInCourse(course1);
        student1.enrollInCourse(course2);
        student2.enrollInCourse(course1);

        // View enrolled students in each course
        course1.viewEnrolledStudents();
        course2.viewEnrolledStudents();

        // View courses a student is enrolled in
        student1.viewCourses();
        student2.viewCourses();

        // Show all students in the school
        school.showStudents();
    }
}

