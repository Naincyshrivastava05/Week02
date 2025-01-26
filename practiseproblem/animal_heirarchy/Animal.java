package practiseproblem.animal_heirarchy;

public class Animal{
    private String name;
    private int age;

    public void makeSound(){
        System.out.println("makingSound.....");
    }

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

}
