package hybrid.problem1;

public class Chef extends Person implements Worker {
    
  // Constructor
  public Chef(String name, int id) {
      super(name, id);  // Call the superclass constructor
  }

  @Override
  public void performDuties() {
      System.out.println(getName() + " is cooking delicious meals.");
  }
}
