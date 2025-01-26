package heirarchical_inheritance.school_system;

class Student extends Person {
    private String grade;

    // Constructor for the Student class
    public Student(String name, int age, String grade) {
        super(name, age); // Call the superclass constructor
        this.grade = grade;
    }

    // Overriding displayInfo to include grade
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}

