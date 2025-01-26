package hybrid_inheritance.vehicle_management;

public class Main {
    public static void main(String[] args) {
        // Create an ElectricVehicle instance
        ElectricVehicle ev = new ElectricVehicle(150, "Tesla Model 3", 75);
        ev.displayDetails();
        ev.charge();

        System.out.println();

        // Create a PetrolVehicle instance
        PetrolVehicle pv = new PetrolVehicle(180, "Ford Mustang", 60);
        pv.displayDetails();
        pv.refuel();
    }

}
