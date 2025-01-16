// Class representing an Employee
public class Employee {
    // Private fields for the Employee class
    private String name;   // Stores the name of the employee
    private int id;        // Stores the unique ID of the employee
    private double salary; // Stores the salary of the employee

    // Constructor to initialize the Employee object
    public Employee(String name, int id, double salary) {
        this.name = name;   // Initialize the name field
        this.id = id;       // Initialize the id field
        this.salary = salary; // Initialize the salary field
    }

    // Method to display the details of the employee
    public void display() {
        System.out.println("The name of the employee is " + name); // Print the employee's name
        System.out.println("The id of the employee is " + id);     // Print the employee's ID
        System.out.println("The salary of the employee is " + salary); // Print the employee's salary
    }
}

// Main class to test the Employee class
public class Main {
    public static void main(String[] args) {
        // Create an Employee object with name, ID, and salary
        Employee employee = new Employee("Naincy Shrivastava", 12345, 30000);
        
        // Call the display method to print employee details
        employee.display();
    }
}
