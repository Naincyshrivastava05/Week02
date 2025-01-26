package hybrid.problem1;
class Person{

  private String name;
  private int id;
  public Person(String name, int id){
    this.name = name;
    this.id = id;
  }

    // Getter methods
    public String getName() {
      return name;
  }
  
  public int getId() {
      return id;
  }
      // Optional: Method to display person info
      public void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}