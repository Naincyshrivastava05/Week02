public class MobilePhone {
    // Private member variables to store mobile phone details
    private String brand;
    private String model;
    private int price;

    // Constructor to initialize the mobile phone details
    public MobilePhone(String brand, String model, int price) {
        this.brand = brand; // Assign brand name
        this.model = model; // Assign model name
        this.price = price; // Assign price
    }

    // Method to display the details of the mobile phone
    public void display() {
        // Print the brand of the mobile phone
        System.out.println("The brand of MobilePhone: " + brand);
        // Print the model of the mobile phone
        System.out.println("The model of MobilePhone: " + model);
        // Print the price of the mobile phone
        System.out.println("The price of MobilePhone: " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a MobilePhone object with brand, model, and price
        MobilePhone mp = new MobilePhone("Samsung", "i4", 15000);

        // Display the details of the mobile phone
        mp.display();
    }
}
