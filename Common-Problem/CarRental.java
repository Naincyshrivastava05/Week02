public class CarRental{
	private String customerName;
	private String carModel;
	private int rentalDays;
	private static final double DAILY_RATE = 50.0;	
		
		public CarRental(String customerName, String carModel, int rentalDays){
			this.customerName = customerName;
			this.carModel  = carModel;
			this.rentalDays = rentalDays;
			
		}
		// Method to calculate total cost
		public double calculateTotalCost() {
        return rentalDays * DAILY_RATE;
    }
		public void display(){
			System.out.println("Customer Name:"+ customerName);
			System.out.println("Customer car Model:"+ carModel);
			System.out.println("Customer rental Days:"+ rentalDays);
			System.out.println("Customer Total cost :"+ calculateTotalCost());
		}
		public static void main(String[] args){
			CarRental cr = new CarRental("Naincy", "BMW", 15);
			cr.display();
			
			
		}
}