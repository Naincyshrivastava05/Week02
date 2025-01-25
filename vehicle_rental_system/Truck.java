package encapsulation_and_polymorphism.vehicle_rental_system;

// Truck Class
class Truck extends Vehicle implements Insurable {
    private double insuranceRate = 0.10; // 10% of rental rate for insurance

    public Truck(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Truck", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;  // Rent is based on daily rate
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * insuranceRate;
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance for Truck: 10% of rental cost.";
    }
}
