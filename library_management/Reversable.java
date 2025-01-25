package encapsulation_and_polymorphism.library_management;

// Interface Reservable
interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}