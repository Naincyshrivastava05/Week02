package encapsulation_and_polymorphism.online_delivery_system;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();
        order.add(new VegItem("Paneer Butter Masala", 150, 2));
        order.add(new NonVegItem("Chicken Biryani", 200, 1));
        order.add(new VegItem("Veg Fried Rice", 120, 1));

        OrderProcessor processor = new OrderProcessor();
        processor.processOrder(order);
    }
}
