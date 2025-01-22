public class Patient {
  private static String hospitalName = "City Hospital"; // Shared across all patients
  private static int totalPatients = 0; // Total number of patients

  private final String patientID; // Unique, immutable patient ID
  private String name; // Patient's name
  private int age; // Patient's age
  private String ailment; // Patient's ailment

  // Constructor to initialize patient details
  public Patient(String patientID, String name, int age, String ailment) {
      this.patientID = patientID;
      this.name = name;
      this.age = age;
      this.ailment = ailment;
      totalPatients++;
  }

  // Static method to get the total number of patients
  public static int getTotalPatients() {
      return totalPatients;
  }

  // Method to display patient details
  public void displayDetails() {
      System.out.println("Hospital Name: " + hospitalName);
      System.out.println("Patient ID: " + patientID);
      System.out.println("Name: " + name);
      System.out.println("Age: " + age);
      System.out.println("Ailment: " + ailment);
  }

  // Main method
  public static void main(String[] args) {
      Patient patient = new Patient("P001", "Charlie", 45, "Flu");

      // Check if the object is an instance of the Patient class
      if (patient instanceof Patient) {
          System.out.println("Processing a patient object.");
      }

      // Display patient details and total patients
      patient.displayDetails();
      System.out.println("Total Patients Admitted: " + Patient.getTotalPatients());
  }
}
