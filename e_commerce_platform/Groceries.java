package encapsulation_and_polymorphism.e_commerce_platform;

// Groceries Class
class Groceries extends Product {
    private double discountRate = 0.05; // 5% discount for groceries

    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate;  // Calculate discount based on product price
    }
}
