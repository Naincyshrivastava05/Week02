package hybrid_inheritance.vehicle_management;

class ElectricVehicle extends Vehicle {
    private int batteryCapacity; // in kWh

    // Constructor
    public ElectricVehicle(int maxSpeed, String model, int batteryCapacity) {
        super(maxSpeed, model);
        this.batteryCapacity = batteryCapacity;
    }

    // Method to charge the vehicle
    public void charge() {
        System.out.println(model + " is charging. Battery capacity: " + batteryCapacity + " kWh.");
    }

    // Override displayDetails to include specific details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

