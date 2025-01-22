import java.util.ArrayList;
import java.util.List;

// Course Class
class Course{
    private String name;
    private List<Student> students;  // A course can have many students
    private List<Professor> professors;  // A course can have many professors

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.professors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollStudent(Student student) {
        students.add(student);
    }

    public void assignProfessor(Professor professor) {
        professors.add(professor);
    }

    public void showCourseDetails() {
        System.out.println("Course: " + name);
        System.out.println("Enrolled Students:");
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
        System.out.println("Professors teaching this course:");
        for (Professor professor : professors) {
            System.out.println("- " + professor.getName());
        }
    }
}

// Student Class
class Student {
    private String name;
    private List<Course> courses;  // A student can enroll in many courses

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(Course course) {
        courses.add(course);
        course.enrollStudent(this);  // Enroll this student into the course
    }

    public void showCourses() {
        System.out.println(name + " is enrolled in the following courses:");
        for (Course course : courses) {
            System.out.println("- " + course.getName());
        }
    }
}

// Professor Class
class Professor {
    private String name;
    private List<Course> courses;  // A professor can teach many courses

    public Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void assignCourse(Course course) {
        courses.add(course);
        course.assignProfessor(this);  // Assign this professor to the course
    }

    public void showCourses() {
        System.out.println(name + " is teaching the following courses:");
        for (Course course : courses) {
            System.out.println("- " + course.getName());
        }
    }
}

// Main Class to test the system
public class Main {
    public static void main(String[] args) {
        // Create some courses
        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Computer Science");
        Course course3 = new Course("Physics");

        // Create students
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // Create professors
        Professor professor1 = new Professor("Dr. Smith");
        Professor professor2 = new Professor("Dr. Johnson");

        // Students enroll in courses
        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course2);
        student2.enrollCourse(course3);

        // Professors teach courses
        professor1.assignCourse(course1);
        professor1.assignCourse(course2);
        professor2.assignCourse(course3);

        // Show details of courses, students, and professors
        course1.showCourseDetails();
        course2.showCourseDetails();
        course3.showCourseDetails();

        // Show student enrollments and professor assignments
        student1.showCourses();
        student2.showCourses();
        professor1.showCourses();
        professor2.showCourses();
    }
}
