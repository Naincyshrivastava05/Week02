package hybrid_inheritance.vehicle_management;

class Vehicle {
    protected int maxSpeed;
    protected String model;

    // Constructor
    public Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}