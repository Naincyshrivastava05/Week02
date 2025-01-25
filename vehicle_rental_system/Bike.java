package encapsulation_and_polymorphism.vehicle_rental_system;

// Bike Class
class Bike extends Vehicle implements Insurable {
    private double insuranceRate = 0.03; // 3% of rental rate for insurance

    public Bike(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
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
        return "Insurance for Bike: 3% of rental cost.";
    }
}
