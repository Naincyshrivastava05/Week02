
import java.util.ArrayList;
import java.util.List;

// Doctor Class
class Doctor {
    private String name;
    private String specialty;
    private List<Patient> patients;  // A doctor can see multiple patients

    public Doctor(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
        }
    }

    // Method to simulate a consultation with a patient
    public void consult(Patient patient) {
        if (patients.contains(patient)) {
            System.out.println(name + " (Specialty: " + specialty + ") is consulting " + patient.getName() + ".");
            patient.receiveConsultation(this);
        } else {
            System.out.println(name + " has no record of consulting with " + patient.getName() + ".");
        }
    }

    public void showPatients() {
        System.out.println(name + " is consulting with the following patients:");
        for (Patient patient : patients) {
            System.out.println("- " + patient.getName());
        }
    }
}

// Patient Class
class Patient {
    private String name;
    private int age;
    private List<Doctor> doctors;  // A patient can have multiple doctors

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
        this.doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    // Method to simulate receiving a consultation from a doctor
    public void receiveConsultation(Doctor doctor) {
        System.out.println(name + " is receiving consultation from Dr. " + doctor.getName() + ".");
    }

    public void showDoctors() {
        System.out.println(name + " is consulting with the following doctors:");
        for (Doctor doctor : doctors) {
            System.out.println("- Dr. " + doctor.getName() + " (" + doctor.getSpecialty() + ")");
        }
    }
}

// Hospital Class (optional, to manage doctors and patients)
class Hospital {
    private String name;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void showAllDoctors() {
        System.out.println("Doctors in " + name + " hospital:");
        for (Doctor doctor : doctors) {
            System.out.println("- Dr. " + doctor.getName() + " (" + doctor.getSpecialty() + ")");
        }
    }

    public void showAllPatients() {
        System.out.println("Patients in " + name + " hospital:");
        for (Patient patient : patients) {
            System.out.println("- " + patient.getName());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create some doctors
        Doctor doctor1 = new Doctor("John", "Cardiologist");
        Doctor doctor2 = new Doctor("Sarah", "Neurologist");

        // Create some patients
        Patient patient1 = new Patient("Alice", 30);
        Patient patient2 = new Patient("Bob", 45);

        // Create a hospital
        Hospital hospital = new Hospital("City Hospital");

        // Add doctors and patients to the hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Add doctors to patients
        patient1.addDoctor(doctor1);
        patient1.addDoctor(doctor2);
        patient2.addDoctor(doctor1);

        // Add patients to doctors
        doctor1.addPatient(patient1);
        doctor1.addPatient(patient2);
        doctor2.addPatient(patient1);

        // Show all doctors and patients in the hospital
        hospital.showAllDoctors();
        hospital.showAllPatients();

        // Simulate consultations
        doctor1.consult(patient1);
        doctor2.consult(patient1);
        doctor1.consult(patient2);
        
        // Show which doctors the patients are consulting with
        patient1.showDoctors();
        patient2.showDoctors();

        // Show which patients the doctors are consulting with
        doctor1.showPatients();
        doctor2.showPatients();
    }
}



