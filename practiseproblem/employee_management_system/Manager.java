package practiseproblem.employee_management_system;

public class Manager extends Employee {
    private int teamSize;
    private String department;

    public Manager(String name, int id, int salary, String department, int teamSize) {
        super(name, id, salary); // Call to parent constructor
        this.department = department;
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); // Display common details
        System.out.println("Team Size: " + teamSize);
        System.out.println("Department: " + department);
    }
}
