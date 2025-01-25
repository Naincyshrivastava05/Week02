package encapsulation_and_polymorphism.employeemanagementsystem;

public class Main {
    public static void main(String[] args) {
        // Create FullTimeEmployee and PartTimeEmployee objects
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(101, "John Doe", 50000, 60000);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(102, "Jane Smith", 20000, 20, 30);

        // Create EmployeeDepartment object and assign departments
        EmployeeDepartment department = new EmployeeDepartment();
        department.assignDepartment("HR");

        // Display details of employees
        System.out.println("Full-Time Employee Details:");
        fullTimeEmployee.displayDetails();
        System.out.println(department.getDepartmentDetails());

        System.out.println("\nPart-Time Employee Details:");
        partTimeEmployee.displayDetails();
        System.out.println(department.getDepartmentDetails());
    }
}
