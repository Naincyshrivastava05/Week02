package practiseproblem.vehicle_transport_system;

// Motorcycle subclass
public class Motorcycle extends Vehicle {
    private String handlebarType;

    public Motorcycle(int maxSpeed, String fuelType, String handlebarType) {
        super(maxSpeed, fuelType);
        this.handlebarType = handlebarType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Handlebar Type: " + handlebarType);
    }
}
