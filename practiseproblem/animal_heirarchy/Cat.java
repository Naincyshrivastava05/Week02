package practiseproblem.animal_heirarchy;

public class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("meow meow....");
    }
    public Cat(String name, int age){
        super(name,age);
    }
}
