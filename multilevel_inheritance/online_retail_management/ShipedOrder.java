package multilevel_inheritance.online_retail_management;

class ShipedOrder extends Order{
    private int trackingNumber;

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Tracking Number:- "+ trackingNumber);
    }
    public ShipedOrder(String orderId, String orderDate, int trackingNumber){
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
}
