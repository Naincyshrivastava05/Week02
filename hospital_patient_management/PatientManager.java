package encapsulation_and_polymorphism.hospital_patient_management;

// PatientManager class
class PatientManager {
    public void displayPatientBill(Patient patient) {
        System.out.println(patient.getPatientDetails());
        System.out.println("Total Bill: $" + patient.calculateBill());

        if (patient instanceof MedicalRecord) {
            MedicalRecord record = (MedicalRecord) patient;
            System.out.println("Medical History:\n" + record.viewRecords());
        }
    }
}

// M