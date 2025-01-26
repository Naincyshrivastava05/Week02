package multilevel_inheritance.online_retail_management;

class DeliveredOrder extends ShipedOrder{
    private String deliverDate;

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Delivery date:-"+ deliverDate);
    }
    public DeliveredOrder(String orderId, String orderDate, int trackingNumber, String deliverDate){
        super(orderId, orderDate, trackingNumber);
        this.deliverDate = deliverDate;
    }
}
