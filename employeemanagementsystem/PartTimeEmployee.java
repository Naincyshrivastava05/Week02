package encapsulation_and_polymorphism.employeemanagementsystem;

// PartTimeEmployee Class
class PartTimeEmployee extends Employee {
    private int workHours;
    private double hourlyRate;

    // Constructor
    public PartTimeEmployee(int employeeId, String name, double baseSalary, int workHours, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.workHours = workHours;
        this.hourlyRate = hourlyRate;
    }

    // Implementing the calculateSalary method
    @Override
    public double calculateSalary() {
        return workHours * hourlyRate; // Part-time salary based on work hours
    }

    // Display details including part-time specific info
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Work Hours: " + workHours);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Total Salary: " + calculateSalary());
    }
}