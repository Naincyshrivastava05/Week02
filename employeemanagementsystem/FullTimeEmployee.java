package encapsulation_and_polymorphism.employeemanagementsystem;

// FullTimeEmployee Class
class FullTimeEmployee extends Employee {
    private double fixedSalary;

    // Constructor
    public FullTimeEmployee(int employeeId, String name, double baseSalary, double fixedSalary) {
        super(employeeId, name, baseSalary);
        this.fixedSalary = fixedSalary;
    }

    // Implementing the calculateSalary method
    @Override
    public double calculateSalary() {
        return fixedSalary; // Full-time salary is fixed
    }

    // Display details including full-time specific info
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Fixed Salary: " + fixedSalary);
        System.out.println("Total Salary: " + calculateSalary());
    }
}