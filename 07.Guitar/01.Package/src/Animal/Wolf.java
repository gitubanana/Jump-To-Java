package Animal;

public class Wolf implements Predator, Barkable {
    public String getFood() {
        return "사슴";
    }

    public void bark() {
        System.out.println("아우우");
    }
}
