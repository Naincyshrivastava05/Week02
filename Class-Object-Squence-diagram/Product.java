import java.util.ArrayList;
import java.util.List;

// Product Class
class Product {
    private String productName;
    private double pricePerUnit;
    private double quantity;

    public Product(String productName, double pricePerUnit, double quantity) {
        this.productName = productName;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return pricePerUnit * quantity;
    }

    public String getProductName() {
        return productName;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return productName + " (" + quantity + " units at $" + pricePerUnit + " per unit)";
    }
}
     
// Customer Class
class Customer {
    private String name;
    private List<Product> productList;

    public Customer(String name) {
        this.name = name;
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public List<Product> getProductList() {
        return productList;
    }


}

// BillGenerator Class
class BillGenerator {
    public double calculateTotal(Customer customer) {
        double total = 0;
        for (Product product : customer.getProductList()) {
            total += product.getTotalPrice();
        }
        return total;
    }

    public void printBill(Customer customer) {
        System.out.println("Customer: " + customer.getName());
        System.out.println("Products Purchased:");
        for (Product product : customer.getProductList()) {
            System.out.println("- " + product);
        }
        double total = calculateTotal(customer);
        System.out.printf("Total Bill: $%.2f\n", total);
    }
}

// Main Class
public class GroceryStoreApplication {
    public static void main(String[] args) {
        // Create Customer
        Customer customer = new Customer("Alice");

        // Add Products
        customer.addProduct(new Product("Apples", 3.0, 2.0));  // 2 kg at $3 per kg
        customer.addProduct(new Product("Milk", 2.0, 1.0));   // 1 liter at $2 per liter

        // Generate Bill
        BillGenerator billGenerator = new BillGenerator();
        billGenerator.printBill(customer);
    }
} 
