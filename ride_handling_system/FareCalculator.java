package encapsulation_and_polymorphism.ride_handling_system;

public class FareCalculator {
    // FareCalculator class
    class FareCalculator {
        public void displayFare(Vehicle vehicle, double distance) {
            System.out.println(vehicle.getVehicleDetails());
            System.out.println("Fare for distance " + distance + " km: $" + vehicle.calculateFare(distance));
            if (vehicle instanceof GPS) {
                GPS gps = (GPS) vehicle;
                System.out.println("Current Location: " + gps.getCurrentLocation());
            }
        }
    }