package encapsulation_and_polymorphism.vehicle_rental_system;

// Car Class
class Car extends Vehicle implements Insurable {
    private double insuranceRate = 0.05; // 5% of rental rate for insurance

    public Car(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Car", rentalRate);
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
        return "Insurance for Car: 5% of rental cost.";
    }
}