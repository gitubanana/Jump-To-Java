import Animal.Dog;
import Animal.Wolf;
import Animal.Cat;
import Animal.*; // 다 가져올 수도 있다.

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Wolf wolf = new Wolf();

        System.out.println("Dog.getFood : "+dog.getFood()); // Dog.getFood : 개껌
        System.out.println("Cat.getFood : "+cat.getFood()); // Cat.getFood : 참새
        System.out.println("Wolf.getFood : "+wolf.getFood()); // Wolf.getFood : 사슴

        Barkable barkable = dog;
        barkable.bark(); // 월월

        barkable = wolf;
        barkable.bark(); // 아우우
    }
}
