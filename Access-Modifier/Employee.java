class Employee {
    // Fields
    public int employeeID;
    protected String department;
    private double salary;

    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary value. Salary must be positive.");
        }
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}

// Subclass to demonstrate access modifiers
class Manager extends Employee {
    private String teamName;

    // Constructor
    public Manager(int employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }

    // Method to display manager details
    public void displayManagerDetails() {
        System.out.println("Employee ID: " + employeeID); // Accessing public member
        System.out.println("Department: " + department); // Accessing protected member
        System.out.println("Team Name: " + teamName);
    }
}

// Main class for testing
public class EmployeeRecords {
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee(101, "HR", 50000.00);
        employee.displayEmployeeDetails();
        System.out.println();

        // Modify and access salary
        employee.setSalary(55000.00);
        System.out.println("Updated Salary: $" + employee.getSalary());
        System.out.println();

        // Create a Manager object
        Manager manager = new Manager(102, "IT", 75000.00, "Development Team");
        manager.displayManagerDetails();
    }
}
