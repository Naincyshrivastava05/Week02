package single_inheritnce.smart_home_device;

class Device {
    private String deviceId;
    private String status;

    // Constructor to initialize the device
    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to display device status
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}


