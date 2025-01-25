package encapsulation_and_polymorphism.ride_handling_system;

// Interface GPS
interface GPS {
    String getCurrentLocation();

    void updateLocation(String newLocation);
}