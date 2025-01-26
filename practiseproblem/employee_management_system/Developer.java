package practiseproblem.employee_management_system;

// Developer Subclass
public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int id, int salary, String programmingLanguage) {
        super(name, id, salary); // Call to parent constructor
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); // Display common details
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

