package practiseproblem.vehicle_transport_system;

public class Main {
    public static void main(String[] args) {
        Problem3 problem3 = new Problem3();
        // Array to hold different types of vehicles
        Vehicle[] vehicles = new Vehicle[3];

        // Creating instances of Car, Truck, and Motorcycle
        vehicles[0] = problem3.new Car(200, "Petrol", 5);
        vehicles[1] = problem3.new Truck(120, "Diesel", 10);
        vehicles[2] = problem3.new Motorcycle(180, "Petrol", "Sports");

        // Polymorphism: Calling displayInfo() on each object
        for (Vehicle vehicle : vehicles) {
            System.out.println("\nVehicle Details:");
            vehicle.displayInfo();  // Dynamic method dispatch
            System.out.println();
        }

    }

}
