import java.util.ArrayList;
import java.util.List;

// Subject Class
class Subject {
    private String subjectName;
    private float score;

    public Subject(String subjectName, int score) {
        this.subjectName = subjectName;
        this.score = score;
    }

    public void setScore(float score){
        this.score = score;
    }

    public float getScore() {
        return score;
    }

    @Override
    public String toString() {
        return subjectName + ": " + score;
    }
}

// Student Class
class Student {
    private String name;
    private String studentID;
    private List<Subject> subjects;

    public Student(String name, String studentID) {
        this.name = name;
        this.studentID = studentID;
        this.subjects = new ArrayList<>();
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void displayResults() {
        System.out.println("Student: " + name);
        System.out.println("Student ID: " + studentID);
        System.out.println("Subjects and Marks:");
        for (Subject subject : subjects) {
            System.out.println(subject);
        }
    }
}

// GradeCalculator Class
class GradeCalculator {
    public static float calculateTotalMarks(Student student) {
        int total = 0;
        for (Subject subject : student.getSubjects()) {
            total += subject.getScore();
        }
        return total;
    }

    public static char calculateGrade(Student student) {
        int total = calculateTotalMarks(student);
        int average = total / student.getSubjects().size();

        if (average >= 90) {
            return 'A';
        } else if (average >= 75) {
            return 'B';
        } else if (average >= 50) {
            return 'C';
        } else {
            return 'D';
        }
    }
}

// Main Class
public class SchoolResultsApplication {
    public static void main(String[] args) {
        // Create Subjects
        Subject maths = new Subject("Maths", 90);
        Subject science = new Subject("Science", 85);

        // Create Student
        Student student = new Student("Naincy", "100");
        student.addSubject(maths);
        student.addSubject(science);

        // Display Results
        student.displayResults();

        // Calculate and Display Grade
        int totalMarks = GradeCalculator.calculateTotalMarks(student);
        char grade = GradeCalculator.calculateGrade(student);

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Grade: " + grade);
    }
}
