package practiseproblem.animal_heirarchy;


public class Bird extends Animal{
    @Override
    public void makeSound(){
        System.out.println("ku...ku....");
    }

    public Bird(String name, int age){
        super(name,age);
    }
}
