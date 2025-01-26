package multilevel_inheritance.online_retail_management;

public class Main {
    public static void main(String[] args) {
        Order order = new Order("2383243", "12-05-2020");
        order.displayInfo();
        System.out.println();
        ShipedOrder so = new ShipedOrder("943494", "12-06-2024",  22938);
        so.displayInfo();
        System.out.println();
        DeliveredOrder dl = new DeliveredOrder("2933384", "04-06-2024", 2934, "12-06-2024");
        dl.displayInfo();
    }

}
