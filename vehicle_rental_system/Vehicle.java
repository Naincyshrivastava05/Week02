package encapsulation_and_polymorphism.vehicle_rental_system;

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate){
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber(){
        return vehicleNumber;
    }
    public void setVehicleNumber(String vehicleNumber){
        this.vehicleNumber = vehicleNumber;
    }
    public void setType(String type){
        this.type = type;
    }
    public  String getType(){
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }
    public abstract  double calculateRentalCost(int days);

    // Method to calculate and display rental and insurance costs
    public void printRentalAndInsuranceDetails(int days) {
        double rentalCost = calculateRentalCost(days);
        double insuranceCost = 0;
        if (this instanceof Insurable) {
            insuranceCost = ((Insurable) this).calculateInsurance();  // Insurable vehicles calculate insurance
        }
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + type);
        System.out.println("Rental Cost for " + days + " days: " + rentalCost);
        System.out.println("Insurance Cost: " + insuranceCost);
        if (this instanceof Insurable) {
            System.out.println(((Insurable) this).getInsuranceDetails());
        }
        System.out.println();
    }
}

