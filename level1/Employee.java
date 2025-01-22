public class Employee {
  // Static variables
  private static int numberOfEmployee = 0; // Tracks total number of employees
  private static String companyName = "Capgemini"; // Common company name

  // Instance variables
  private String name; // Name of the employee
  private final String id; // Unique, immutable employee ID
  private String designation; // Employee's job role

  // Constructor
  public Employee(String name, String id, String designation) {
      this.name = name;
      this.id = id;
      this.designation = designation;
      numberOfEmployee++; // Increment the employee count
  }

  // Static method to display the total number of employees
  public static void displayTotalEmployees() {
      System.out.println("The total number of employees: " + numberOfEmployee);
  }

  // Getter and Setter for name
  public String getName() {
      return name;
  }

  public void setName(String name) {
      this.name = name;
  }

  // Getter for ID (no setter as it's final)
  public String getId() {
      return id;
  }

  // Getter and Setter for designation
  public String getDesignation() {
      return designation;
  }

  public void setDesignation(String designation) {
      this.designation = designation;
  }

  // Method to display employee details
  public void display() {
      System.out.println("Company Name: " + companyName);
      System.out.println("Employee Name: " + name);
      System.out.println("Employee ID: " + id);
      System.out.println("Employee Designation: " + designation);
  }

  // Main method
  public static void main(String[] args) {
      // Create an Employee object
      Employee employee = new Employee("Naincy", "0199CS211100", "Java Developer");

      // Check if the object is an instance of the Employee class
      if (employee instanceof Employee) {
          System.out.println("Employee class object");
      } else {
          System.out.println("Not an Employee class object");
      }

      // Display employee details
      employee.display();

      // Display total number of employees
      Employee.displayTotalEmployees();
  }
}
