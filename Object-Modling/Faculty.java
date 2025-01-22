
import java.util.ArrayList;
import java.util.List;

// Faculty Class (Aggregation)
class Faculty {
    private String name;
    private String position;

    public Faculty(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Faculty(name=" + name + ", position=" + position + ")";
    }
}

// Department Class (Part of Composition with University)
class Department {
    private String name;
    private List<Faculty> faculties;  // Aggregation: Faculty members can exist independently

    public Department(String name) {
        this.name = name;
        this.faculties = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void showFaculties() {
        System.out.println("Faculties in " + name + " Department:");
        for (Faculty faculty : faculties) {
            System.out.println(faculty);
        }
    }

    // Destructor-like method (Java doesn't have destructors, but we simulate cleanup)
    public void delete() {
        System.out.println("Department " + name + " is being deleted.");
        faculties.clear();  // Faculties are not deleted, they exist independently
    }
}

// University Class (Composition with Departments)
class University {
    private String name;
    private List<Department> departments;  // Composition: Deleting a University deletes its departments

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void showDepartments() {
        System.out.println("Departments in " + name + " University:");
        for (Department department : departments) {
            System.out.println("- " + department.getName());
        }
    }

    // Destructor-like method (Java doesn't have destructors, but we simulate cleanup)
    public void delete() {
        System.out.println("University " + name + " is being deleted.");
        for (Department department : departments) {
            department.delete();  // Delete each department
        }
        departments.clear();  // Remove all departments when the university is deleted
    }
}

public class Main {
    public static void main(String[] args) {
        // Create faculty members
        Faculty faculty1 = new Faculty("Dr. John", "Professor");
        Faculty faculty2 = new Faculty("Dr. Jane", "Associate Professor");
        Faculty faculty3 = new Faculty("Dr. Smith", "Lecturer");

        // Create departments and add faculty members
        Department dept1 = new Department("Computer Science");
        dept1.addFaculty(faculty1);
        dept1.addFaculty(faculty2);

        Department dept2 = new Department("Mathematics");
        dept2.addFaculty(faculty3);

        // Create a university and add departments
        University university = new University("Tech University");
        university.addDepartment(dept1);
        university.addDepartment(dept2);

        // Display departments and faculties in the university
        university.showDepartments();
        dept1.showFaculties();
        dept2.showFaculties();

        // Deleting the university should also delete its departments
        university.delete();

        // Faculty members can still exist independently of departments
        System.out.println("Faculty members after university deletion:");
        System.out.println(faculty1);
        System.out.println(faculty2);
        System.out.println(faculty3);
    }
}

