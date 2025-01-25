package encapsulation_and_polymorphism.e_commerce_platform;
// Abstract Class Product
abstract class Product {
    private int productId;
    private String name;
    private double price;

    // Constructor
    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Getter and Setter Methods
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Abstract method to calculate discount
    public abstract double calculateDiscount();

    // Method to calculate and print the final price
    public void printFinalPrice() {
        double discount = calculateDiscount();
        double tax = 0;
        if (this instanceof Taxable) {
            tax = ((Taxable) this).calculateTax();  // Taxable products calculate tax
        }
        double finalPrice = price - discount + tax;
        System.out.println("Product: " + name);
        System.out.println("Final Price (Price + Tax - Discount): " + finalPrice);
    }
}
