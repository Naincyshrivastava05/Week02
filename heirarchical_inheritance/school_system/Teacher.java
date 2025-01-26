package heirarchical_inheritance.school_system;

class Teacher extends Person {
    private String subject;

    // Constructor for the Teacher class
    public Teacher(String name, int age, String subject) {
        super(name, age); // Call the superclass constructor
        this.subject = subject;
    }

    // Overriding displayInfo to include subject
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }
}
