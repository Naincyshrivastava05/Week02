public class Vehicle {
  private static double registrationFee = 500.0; // Common fee for all vehicles

  private final String registrationNumber; // Unique, immutable registration number
  private String ownerName; // Name of the vehicle owner
  private String vehicleType; // Type of the vehicle

  // Constructor to initialize vehicle details
  public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
      this.registrationNumber = registrationNumber;
      this.ownerName = ownerName;
      this.vehicleType = vehicleType;
  }

  // Static method to update the registration fee
  public static void updateRegistrationFee(double newFee) {
      registrationFee = newFee;
  }

  // Method to display vehicle details
  public void displayDetails() {
      System.out.println("Registration Number: " + registrationNumber);
      System.out.println("Owner Name: " + ownerName);
      System.out.println("Vehicle Type: " + vehicleType);
      System.out.println("Registration Fee: " + registrationFee);
  }

  // Main method
  public static void main(String[] args) {
      Vehicle vehicle = new Vehicle("V001", "Bob", "Car");

      // Check if the object is an instance of the Vehicle class
      if (vehicle instanceof Vehicle) {
          System.out.println("Processing a vehicle object.");
      }

      // Update registration fee and display vehicle details
      Vehicle.updateRegistrationFee(600.0);
      vehicle.displayDetails();
  }
}
