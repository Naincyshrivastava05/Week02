package practiseproblem.employee_management_system;

public class Main {
    public static void main(String[] args) {
        Problem2 problem2 = new Problem2();

        // Creating instances
        Employee emp = problem2.new Employee("Naincy", 100, 30000);
        Manager mg = problem2.new Manager("Ravi", 101, 50000, "Hiring", 10);
        Developer dev = problem2.new Developer("Suman", 102, 40000, "Java");
        Intern in = problem2.new Intern("Rohit", 103, 15000, "Python", 6);

        // Displaying details
        emp.displayDetails();
        System.out.println();

        mg.displayDetails();
        System.out.println();

        dev.displayDetails();
        System.out.println();

        in.displayDetails();
    }

}
