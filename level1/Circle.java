public class Circle {
    // Private member variables to store radius, area, and circumference
    private int radius;
    private double area=0;
    private double circumference=0;

    // Constructor to initialize the radius of the circle
    public Circle(int radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public void calculateArea() {
        // Formula for area: π * radius^2
        // Using 22/7 as an approximation for π (pi)
        this.area = (22.0 / 7) * Math.pow(radius, 2);
    }

    // Method to calculate the circumference of the circle
    public void calculateCircumference() {
        // Formula for circumference: 2 * π * radius
        // Using 22/7 as an approximation for π (pi)
        this.circumference = 2 * (22.0 / 7) * radius;
    }

    // Method to display the area and circumference of the circle
    public void display() {

        // Print the results
        System.out.println("The area of the circle is " + area);
        System.out.println("The circumference of the circle is " + circumference);
    }
}
// Main class to test the Circle class
public class Main {
    public static void main(String[] args) {
        // Create a Circle object with a radius of 3
        Circle circle = new Circle(3);

        // Display the area and circumference of the circle
		circle.calculateArea();
		circle.calculateCircumference();
        circle.display();
    }
}
