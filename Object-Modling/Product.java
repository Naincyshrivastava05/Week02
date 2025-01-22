
import java.util.ArrayList;
import java.util.List;

// Product Class
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}

// Order Class
class Order {
    private static int orderCounter = 1;  // To generate unique order IDs
    private int orderId;
    private Customer customer;
    private List<Product> products;

    public Order(Customer customer) {
        this.orderId = orderCounter++;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public int getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public double getTotalPrice() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Products in this order:");
        for (Product product : products) {
            System.out.println("- " + product);
        }
        System.out.println("Total Price: $" + getTotalPrice());
    }
}

// Customer Class
class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public void showOrders() {
        System.out.println(name + "'s Orders:");
        for (Order order : orders) {
            order.showOrderDetails();
        }
    }
}

// Main Class to test the system
public class Main {
    public static void main(String[] args) {
        // Create some products
        Product product1 = new Product("Laptop", 1000.00);
        Product product2 = new Product("Smartphone", 700.00);
        Product product3 = new Product("Headphones", 150.00);

        // Create a customer
        Customer customer1 = new Customer("Alice");

        // Create an order and add products to it
        Order order1 = new Order(customer1);
        order1.addProduct(product1);
        order1.addProduct(product2);

        // Create another order and add products to it
        Order order2 = new Order(customer1);
        order2.addProduct(product3);

        // Customer places the orders
        customer1.placeOrder(order1);
        customer1.placeOrder(order2);

        // Show customer orders
        customer1.showOrders();
    }
}




