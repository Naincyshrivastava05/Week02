import java.util.ArrayList;
import java.util.List;

// Class to represent an item in the shopping cart
class CartItem {
    private String itemName; // Name of the item
    private double price;    // Price of the item
    private int quantity;    // Quantity of the item

    // Constructor to initialize item details
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to get the total cost of the item
    public double getTotalCost() {
        return price * quantity;
    }

    // Method to display item details
    public void displayItemDetails() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: $" + getTotalCost());
    }
}

// Class to manage the shopping cart
class ShoppingCart {
    private List<CartItem> cartItems = new ArrayList<>(); // List to store cart items

    // Method to add an item to the cart
    public void addItem(String itemName, double price, int quantity) {
        cartItems.add(new CartItem(itemName, price, quantity));
        System.out.println(itemName + " added to the cart.");
    }

    // Method to remove an item from the cart
    public void removeItem(String itemName) {
        cartItems.removeIf(item -> item.itemName.equals(itemName));
        System.out.println(itemName + " removed from the cart.");
    }

    // Method to display the total cost of all items
    public void displayTotalCost() {
        double totalCost = 0;
        for (CartItem item : cartItems) {
            totalCost += item.getTotalCost();
        }
        System.out.println("Total Cost: $" + totalCost);
    }

    // Method to display all items in the cart
    public void displayCart() {
        if (cartItems.isEmpty()) {
            System.out.println("The cart is empty.");
            return;
        }
        System.out.println("Items in the cart:");
        for (CartItem item : cartItems) {
            item.displayItemDetails();
            System.out.println();
        }
    }
}

// Main class to test the ShoppingCart system
public class ShoppingCartSystem {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Add items to the cart
        cart.addItem("Laptop", 999.99, 1);
        cart.addItem("Mouse", 49.99, 2);

        // Display the cart details
        cart.displayCart();

        // Display the total cost
        cart.displayTotalCost();

        // Remove an item from the cart
        cart.removeItem("Mouse");

        // Display the updated cart details
        cart.displayCart();

        // Display the updated total cost
        cart.displayTotalCost();
    }
}
