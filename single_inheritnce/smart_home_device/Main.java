package single_inheritnce.smart_home_device;

public class Main {
    public static void main(String[] args) {
        // Create a general device
        Device device = new Device("D001", "ON");
        device.displayStatus();  // Display status of the device

        System.out.println();

        // Create a thermostat device
        Thermostat thermostat = new Thermostat("T001", "ON", 22);
        thermostat.displayStatus();  // Display status of the thermostat
    }

}
