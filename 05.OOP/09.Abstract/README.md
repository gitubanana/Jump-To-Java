### 추상 클래스
인터페이스의 역할도 하면서, 클래스의 기능도 가지고 있는 자바의 돌연변이같은 클래스다.<br>
`abstract`키워드를 이용해 추상 클래스/메서드를 만들 수 있다.<br>
또한, 추상 메서드에는 구현체가 있는 메서드도 만들 수 있다.<br>
추상 클래스를 상속하는 클래스에서는 추상 메서드를 구현해야만 한다.<br>
```java
abstract class Predator extends Animal {
    abstract String getFood();

    void printFood() {
        System.out.printf("my food is %s\n", getFood());
    }
}

interface Barkable {
    default void bark() {
        System.out.println("세상에...");
    }
}

class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tiger extends Predator implements Barkable { // 인터페이스는 다중 상속이 가능하다.
    public String getFood() {
        return "rabbit";
    }

    public void bark() {
        System.out.println("어흥");
    }
}

class Lion extends Predator implements Barkable {
    public String getFood() {
        return "deer";
    }

    public void bark() {
        System.out.println("아");
    }
}

class Human extends Predator implements Barkable {
    public String getFood() {
        return "햄버거";
    }
}

class ZooKeeper {
    void feed(Predator predator) {
        System.out.println("feed "+predator.getFood());
    }
}

class Bouncer {
    void barkAnimal(Barkable animal) {
        animal.bark();
    }
}

public class HelloWorld {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        Human euiclee = new Human();

        Bouncer bouncer = new Bouncer();
        bouncer.barkAnimal(tiger);      // 어흥
        bouncer.barkAnimal(lion);       // 아
        bouncer.barkAnimal(euiclee);    // 세상에...

        System.out.println("feed "+tiger.getFood());   // feed rabbit
        System.out.println("feed "+lion.getFood());    // feed deer
        System.out.println("feed "+euiclee.getFood()); // feed 햄버거
    }
}
```
> [!NOTE]
> 인터페이스와 동일하게, 추상 클래스도 추상 메서드의 구현체가 없으므로 인스턴스화는 안 된다.<br>


### Reference
[05-09 추상 클래스](https://wikidocs.net/219)<br>
