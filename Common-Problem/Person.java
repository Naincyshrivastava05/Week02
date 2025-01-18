public class Person {
    private String name;
    private int age;

    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Method to display person details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating a Person object using parameterized constructor
        Person person1 = new Person("Alice", 25);
        System.out.println("Original Person:");
        person1.display();

        // Creating a new Person object using the copy constructor
        Person person2 = new Person(person1);
        System.out.println("Cloned Person:");
        person2.display();

        // Modifying the cloned object's attributes
        person2.setName("Bob");
        person2.setAge(30);
        System.out.println("Modified Cloned Person:");
        person2.display();

    }
}
