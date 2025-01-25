package encapsulation_and_polymorphism.hospital_patient_management;

public class Main {
    public static void main(String[] args) {
        InPatient inPatient = new InPatient("IP123", "Alice", 30, 2000, 5);
        inPatient.addRecord("Admitted for surgery.");
        inPatient.addRecord("Post-surgery recovery.");

        OutPatient outPatient = new OutPatient("OP456", "Bob", 40, 500);
        outPatient.addRecord("General check-up.");

        PatientManager manager = new PatientManager();

        System.out.println("In-Patient Details:");
        manager.displayPatientBill(inPatient);

        System.out.println("\nOut-Patient Details:");
        manager.displayPatientBill(outPatient);
    }
}
