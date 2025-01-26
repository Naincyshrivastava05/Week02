package practiseproblem.animal_heirarchy;

public class Main {
    public static void main(String[] args){
        Problem1 problem1 = new Problem1();
        Dog dog = problem1.new Dog("Huskey", 4);
        Cat cat = problem1.new Cat("Lily",3);
        Bird bird = problem1.new Bird("classy", 5);

        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }

}
