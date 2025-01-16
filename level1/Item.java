public class Item {
    // Private member variables to store item details
    private int itemCode;
    private String itemName;
    private int price;

    // Constructor to initialize the item details
    public Item(int itemCode, String itemName, int price) {
        this.itemCode = itemCode; // Assign item code
        this.itemName = itemName; // Assign item name
        this.price = price; // Assign item price
    }

    // Method to display the details of the item
    public void display() {
        // Print the item code
        System.out.println("Item Code :" + itemCode);
        // Print the item name
        System.out.println("Item Name :" + itemName);
        // Print the item price
        System.out.println("Item price :" + price);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an Item object with item code, name, and price
        Item item = new Item(14593, "Nuts", 200);

        // Display the details of the item
        item.display();
    }
}
