package heirarchical_inheritance.school_system;

class Staff extends Person {
    private String department;

    // Constructor for the Staff class
    public Staff(String name, int age, String department) {
        super(name, age); // Call the superclass constructor
        this.department = department;
    }

    // Overriding displayInfo to include department
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}
