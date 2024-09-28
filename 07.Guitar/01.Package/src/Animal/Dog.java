package Animal;

public class Dog implements Predator, Barkable {
    public String getFood() {
        return "개껌";
    }

    public void bark() {
        System.out.println("월월");
    }
}
