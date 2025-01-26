package hybrid_inheritance.vehicle_management;

class PetrolVehicle extends Vehicle implements Refuelable {
    private int fuelCapacity; // in liters

    // Constructor
    public PetrolVehicle(int maxSpeed, String model, int fuelCapacity) {
        super(maxSpeed, model);
        this.fuelCapacity = fuelCapacity;
    }

    // Implement refuel method
    @Override
    public void refuel() {
        System.out.println(model + " is refueling. Fuel capacity: " + fuelCapacity + " liters.");
    }

    // Override displayDetails to include specific details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
    }
}

