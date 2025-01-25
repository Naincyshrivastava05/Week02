package encapsulation_and_polymorphism.online_delivery_system;
import java.util.*;
// Order Processor
class OrderProcessor {
    public void processOrder(List<FoodItem> items) {
        double totalOrderPrice = 0.0;

        for (FoodItem item : items) {
            System.out.println(item.getItemDetails());
            if (item instanceof Discountable) {
                Discountable discountableItem = (Discountable) item;
                discountableItem.applyDiscount(10.0); // applying a 10% discount
                System.out.println(discountableItem.getDiscountDetails());
            }
            double totalPrice = item.calculateTotalPrice();
            totalOrderPrice += totalPrice;
            System.out.println("Total Price for this item: $" + totalPrice);
        }

        System.out.println("\nTotal Order Price: $" + totalOrderPrice);
    }
}
