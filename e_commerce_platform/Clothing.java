package encapsulation_and_polymorphism.e_commerce_platform;

// Clothing Class
class Clothing extends Product implements Taxable {
    private double discountRate = 0.20; // 20% discount for clothing

    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate;  // Calculate discount based on product price
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.10;  // 10% tax for clothing
    }

    @Override
    public String getTaxDetails() {
        return "Tax for Clothing: 10%";
    }
}
