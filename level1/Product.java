public class Product {
  private static double discount = 0.0; // Shared discount for all products
  private final String productID; // Unique, immutable product ID
  private String productName; // Name of the product
  private double price; // Price of the product
  private int quantity; // Quantity of the product

  // Constructor to initialize the product details
  public Product(String productID, String productName, double price, int quantity) {
      this.productID = productID;
      this.productName = productName;
      this.price = price;
      this.quantity = quantity;
  }

  // Static method to update the discount
  public static void updateDiscount(double newDiscount) {
      discount = newDiscount;
  }

  // Method to display product details
  public void displayDetails() {
      System.out.println("Product ID: " + productID);
      System.out.println("Product Name: " + productName);
      System.out.println("Price: " + price);
      System.out.println("Quantity: " + quantity);
      System.out.println("Discount: " + discount + "%");
  }

  // Main method
  public static void main(String[] args) {
      Product product = new Product("P001", "Laptop", 50000, 1);

      // Check if the object is an instance of the Product class
      if (product instanceof Product) {
          System.out.println("Processing a product object.");
      }

      // Update discount and display product details
      Product.updateDiscount(10.0);
      product.displayDetails();
  }
}
