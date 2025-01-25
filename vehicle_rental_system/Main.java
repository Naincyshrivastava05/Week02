package encapsulation_and_polymorphism.vehicle_rental_system;

public class Main {
    public static void main(String[] args) {
        // Create vehicles
        Vehicle car = new Car("C123", 500);
        Vehicle bike = new Bike("B456", 200);
        Vehicle truck = new Truck("T789", 1000);

        // Display rental and insurance details for each vehicle
        System.out.println("Car Rental Details:");
        car.printRentalAndInsuranceDetails(5); // For 5 days

        System.out.println("Bike Rental Details:");
        bike.printRentalAndInsuranceDetails(3); // For 3 days

        System.out.println("Truck Rental Details:");
        truck.printRentalAndInsuranceDetails(7); // For 7 days

        // Example of polymorphism: create an array of vehicles and calculate rental and insurance for each
        Vehicle[] vehicles = {car, bike, truck};
        for (Vehicle vehicle : vehicles) {
            vehicle.printRentalAndInsuranceDetails(10); // Calculate for 10 days for all vehicles
        }
    }
}
