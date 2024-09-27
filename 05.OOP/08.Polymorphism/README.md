### 다형성
하나의 객체가 여러 개의 자료형 타입을 가질 수 있는 것을 `다형성`이라고 한다.<br>
다형성을 이용하면, 복잡한 분기문을 간단하게 처리할 수 있다.<br>
```java
Tiger tiger = new Tiger();        // Tiger is a Tiger
Animal animal = new Tiger();      // Tiger is an Animal
Predator predator = new Tiger();  // Tiger is a Predator
Barkable barkable = new Tiger();  // Tiger is Barkable
```

인터페이스는 다중 상속이 가능하다.
> (인터페이스가 다중 상속받을 수도 있고, 클래스가 다중 상속 받을 수도 있다.)<br>

> [!NOTE]
> 클래스를 다중 상속을 할 때는 상속받은 변수나 메서드의 이름이 동일해 문제가 있었지만,<br>
> 인터페이스는 이름이 동일해도, 결국에 상송받은 클래스에서 구현한 것을 사용하기 때문에 문제가 없다.<br>

> (주의할 점은 메서드명이 같고 전부 다 디폴트 메서드이고 상속받은 클래스에서 구현을 안 하면, 어느 메서드를 사용할지 모호해 문제가 생긴다.)<br>
> (+ 메서드명은 같은데, 리턴타입 혹은 매개변수가 다를 때도 문제이다.)<br>

```java
interface Predator {
    default String getFood() { // 인터페이스의 디폴트 메서드
        return "고기";
    }
}

interface Barkable {
    default void bark() {
        System.out.println("세상에...");
    }
}

interface BarkablePredator extends Predator, Barkable { // 인터페이스는 다중 상속이 가능하다.
}

class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tiger extends Animal implements Predator, Barkable { // 인터페이스는 다중 상속이 가능하다.
    public String getFood() {
        return "rabbit";
    }

    public void bark() {
        System.out.println("어흥");
    }
}

class Lion extends Animal implements BarkablePredator {
    public String getFood() {
        return "deer";
    }

    public void bark() {
        System.out.println("아");
    }
}

/* 인터페이스의 메서드를 구현하지 않아 디폴트 메서드의 내용을 사용한다. */
class Human extends Animal implements BarkablePredator {
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
    }
}
```




### Reference
[05-08 다형성](https://wikidocs.net/269)<br>
