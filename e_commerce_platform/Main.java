package encapsulation_and_polymorphism.e_commerce_platform;

public class Main {
    public static void main(String[] args) {
        // Create products of different categories
        Product electronics = new Electronics(101, "Smartphone", 50000);
        Product clothing = new Clothing(102, "T-shirt", 1000);
        Product groceries = new Groceries(103, "Apple", 100);

        // Display details and final price for each product
        System.out.println("Electronics:");
        electronics.printFinalPrice();
        System.out.println();

        System.out.println("Clothing:");
        clothing.printFinalPrice();
        System.out.println();

        System.out.println("Groceries:");
        groceries.printFinalPrice();
        System.out.println();

        // Example of polymorphism: creating an array of Product and calculating final prices
        Product[] products = {electronics, clothing, groceries};
        for (Product product : products) {
            product.printFinalPrice();
        }
    }
}
