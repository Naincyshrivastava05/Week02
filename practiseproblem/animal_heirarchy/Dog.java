package practiseproblem.animal_heirarchy;

public class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Bhaw bhaw....");
    }

    public Dog(String name, int age){
        super(name,age);
    }
}
