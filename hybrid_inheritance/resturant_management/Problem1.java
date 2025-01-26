package hybrid.problem1;

public class Problem1{
  public static void main(String[] args) {
     // Create a Chef and a Waiter
     Chef chef = new Chef("John", 101);
     Waiter waiter = new Waiter("Emily", 102);

     // Display information about the Chef and Waiter
     chef.displayInfo();
     waiter.displayInfo();

     // Perform their duties
     chef.performDuties();  // Chef's duties
     waiter.performDuties();  // Waiter's duties
  }
}
