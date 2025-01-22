
import java.util.ArrayList;
import java.util.List;

// Employee Class
class Employee {
    private String name;
    private String role;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    @Override
    public String toString() {
        return "Employee(name=" + name + ", role=" + role + ")";
    }
}

// Department Class
class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public String toString() {
        return "Department(name=" + name + ", employees=" + employees + ")";
    }

    // Destructor-like method (Java doesn't have destructors, but we can handle cleanup manually)
    public void delete() {
        System.out.println("Department " + name + " is being deleted.");
        employees.clear(); // Remove all employees when department is deleted
    }
}

// Company Class
class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    @Override
    public String toString() {
        return "Company(name=" + name + ", departments=" + departments + ")";
    }

    // Destructor-like method (Java doesn't have destructors, but we handle cleanup manually)
    public void delete() {
        System.out.println("Company " + name + " is being deleted.");
        for (Department department : departments) {
            department.delete(); // Delete each department
        }
        departments.clear(); // Remove all departments when the company is deleted
    }
}

public class Main {
    public static void main(String[] args) {
        // Create employees
        Employee emp1 = new Employee("Alice", "Developer");
        Employee emp2 = new Employee("Bob", "Designer");
        Employee emp3 = new Employee("Charlie", "Tester");

        // Create departments and add employees
        Department dept1 = new Department("IT");
        dept1.addEmployee(emp1);
        dept1.addEmployee(emp2);

        Department dept2 = new Department("QA");
        dept2.addEmployee(emp3);

        // Create a company and add departments
        Company company = new Company("TechCorp");
        company.addDepartment(dept1);
        company.addDepartment(dept2);

        // Display the company details
        System.out.println(company);

        // Deleting the company should also delete all departments and employees
        company.delete();
    }
}





