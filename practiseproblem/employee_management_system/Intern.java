package practiseproblem.employee_management_system;

// Intern Subclass
public class Intern extends Employee {
    private int period;
    private String skill;

    public Intern(String name, int id, int salary, String skill, int period) {
        super(name, id, salary); // Call to parent constructor
        this.skill = skill;
        this.period = period;
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); // Display common details
        System.out.println("Internship Period: " + period + " months");
        System.out.println("Skill: " + skill);
    }
}

