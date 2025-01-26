package single_inheritnce.smart_home_device;

// Subclass Thermostat which inherits from Device
class Thermostat extends Device {
    private int temperatureSetting;

    // Constructor to initialize thermostat-specific attributes
    public Thermostat(String deviceId, String status, int temperatureSetting) {
        super(deviceId, status);  // Calling the superclass constructor
        this.temperatureSetting = temperatureSetting;
    }

    // Overriding the displayStatus() method to include thermostat-specific info
    @Override
    public void displayStatus() {
        super.displayStatus();  // Calling the superclass displayStatus()
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

