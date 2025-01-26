package multilevel_inheritance.online_retail_management;

class Order{
    private String orderId;
    private String orderDate;

    public void displayInfo(){
        System.out.println("Order id:-"+ orderId );
        System.out.println("Order date:-"+ orderDate );
    }

    public Order(String orderId, String orderDate){
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
