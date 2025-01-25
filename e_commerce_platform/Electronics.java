package encapsulation_and_polymorphism.e_commerce_platform;

class Electronics extends Product implements Taxable {
    private double discountRate = 0.10; // 10% discount for electronics

    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate;  // Calculate discount based on product price
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.15;  // 15% tax for electronics
    }

    @Override
    public String getTaxDetails() {
        return "Tax for Electronics: 15%";
    }
}

