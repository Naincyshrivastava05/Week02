package encapsulation_and_polymorphism.hospital_patient_management;

// InPatient class
class InPatient extends Patient implements MedicalRecord {
    private double roomCharge;
    private int daysAdmitted;
    private StringBuilder medicalHistory;

    public InPatient(String patientId, String name, int age, double roomCharge, int daysAdmitted) {
        super(patientId, name, age);
        this.roomCharge = roomCharge;
        this.daysAdmitted = daysAdmitted;
        this.medicalHistory = new StringBuilder();
    }

    @Override
    public double calculateBill() {
        return roomCharge * daysAdmitted;
    }

    @Override
    public void addRecord(String record) {
        medicalHistory.append(record).append("\n");
    }

    @Override
    public String viewRecords() {
        return medicalHistory.toString();
    }
}

