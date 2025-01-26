package heirarchical_inheritance.school_system;

class Person {
    protected String name;
    protected int age;

    // Constructor for the Person class
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display basic information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
