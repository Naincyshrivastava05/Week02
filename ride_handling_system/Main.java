package encapsulation_and_polymorphism.ride_handling_system;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("CAR123", "Alice", 15.0);
        car.updateLocation("Downtown");

        Bike bike = new Bike("BIKE456", "Bob", 10.0);
        bike.updateLocation("City Center");

        Auto auto = new Auto("AUTO789", "Charlie", 12.0);
        auto.updateLocation("Suburb");

        FareCalculator calculator = new FareCalculator();

        System.out.println("Car Details:");
        calculator.displayFare(car, 10);

        System.out.println("\nBike Details:");
        calculator.displayFare(bike, 10);

        System.out.println("\nAuto Details:");
        calculator.displayFare(auto, 10);
    }
}
