public class Circle {
    private double radius;

    // Default constructor, sets radius to a default value (e.g., 1.0)
    public Circle() {
        this(1.0); // Calls the parameterized constructor with a default value
    }

    // Parameterized constructor, allows setting a custom radius
    public Circle(double radius) {
        this.radius = radius;
    }

    public void display(){
		System.out.println("The radius of the circle is"+ radius);
	}
   

    public static void main(String[] args) {
        // Using default constructor
        Circle defaultCircle = new Circle();
		defaultCircle.display();
		
        // Using parameterized constructor
        Circle customCircle = new Circle(5.0);
       customCircle.display();
    }
}
