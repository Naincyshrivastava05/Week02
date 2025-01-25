package encapsulation_and_polymorphism.online_delivery_system;

// NonVegItem class
class NonVegItem extends FoodItem implements Discountable {
    private static final double ADDITIONAL_CHARGE = 20.0; // additional charge for non-veg items
    private double discount;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discount = 0.0;
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity() + ADDITIONAL_CHARGE - discount;
    }

    @Override
    public void applyDiscount(double discountRate) {
        this.discount = getPrice() * getQuantity() * discountRate / 100;
    }

    @Override
    public String getDiscountDetails() {
        return "Discount applied: $" + discount;
    }
}
