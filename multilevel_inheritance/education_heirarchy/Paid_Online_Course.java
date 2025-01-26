package multilevel_inheritance.education_heirarchy;

// Subclass PaidOnlineCourse
class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount; // Discount in percentage

    // Constructor for PaidOnlineCourse
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded); // Call the OnlineCourse constructor
        this.fee = fee;
        this.discount = discount;
    }

    // Overriding displayInfo to include PaidOnlineCourse-specific attributes
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the OnlineCourse method
        System.out.println("Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: $" + calculateFinalPrice());
    }

    // Method to calculate the final price after discount
    public double calculateFinalPrice() {
        return fee - (fee * (discount / 100));
    }
}
