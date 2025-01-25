package encapsulation_and_polymorphism.employeemanagementsystem;

// Concrete Department Implementation
class EmployeeDepartment implements Department {
    private String departmentName;

    // Implementing assignDepartment method
    @Override
    public void assignDepartment(String departmentName) {
        this.departmentName = departmentName;
    }

    // Implementing getDepartmentDetails method
    @Override
    public String getDepartmentDetails() {
        return "Department: " + departmentName;
    }
}
