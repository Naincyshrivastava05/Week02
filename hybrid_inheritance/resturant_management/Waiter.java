 
package hybrid.problem1;
public class Waiter extends Person implements Worker {
    
  // Constructor
  public Waiter(String name, int id) {
      super(name, id);  // Call superclass constructor
  }

  @Override
  public void performDuties() {
      System.out.println(getName() + " is serving food to the customers.");
  }
}
