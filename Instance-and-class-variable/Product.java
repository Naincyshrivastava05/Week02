public class Product {
    // Instance Variables
    private String productName;
    private double price;

    // Class Variable
    private static int totalProducts = 0;

    // Constructor to initialize product details
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment totalProducts whenever a new product is created
    }

    // Instance Method: Display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }

    // Class Method: Display total number of products
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create products
        Product product1 = new Product("Laptop", 1200.50);
        Product product2 = new Product("Smartphone", 800.75);
        Product product3 = new Product("Tablet", 400.00);

        // Display details of each product
        product1.displayProductDetails();
        System.out.println();
        product2.displayProductDetails();
        System.out.println();
        product3.displayProductDetails();

        // Display total number of products created
        System.out.println();
        Product.displayTotalProducts();
    }
}
