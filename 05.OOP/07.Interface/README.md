> `C++`에는 인터페이스는 없지만, 가상 함수인 소멸자와 순수 가상함수만 만들어 구현해볼 수 있다.<br>

### 인터페이스
`interface` 키워드를 이용해 만든다.<br>
인터페이스 구현은 `implements` 키워드를 이용한다.<br>
인터페이스를 `implements`한 클래스는 인터페이스의 메서드를 구현해야 한다.<br>
(인터페이스는 메서드에 대한 정의만 있고, 구현은 안 한다.)<br>
```java
class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

interface Predator {
    String getFood();
}

class Tiger extends Animal implements Predator {
    public String getFood() { // Predator 인터페이스의 메서드 구현
        return "rabbit";
    }
}

class Lion extends Animal implements Predator {
    public String getFood() { // Predator 인터페이스의 메서드 구현
        return "deer";
    }
}

class ZooKeeper {
    void feed(Predator predator) { // Predator 인터페이스를 구현한 클래스의 getFood를 호출
        System.out.println("feed "+predator.getFood());
    }
}

public class HelloWorld {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();

        zooKeeper.feed(tiger); // feed rabbit
        zooKeeper.feed(lion);  // feed deer
    }
}
```
> [!NOTE]
> 인터페이스의 메서드는 항상 `public`으로 구현해야 한다.<br>


### 디폴트 메서드
`Java 8`이후부터는 `디폴트 메서드(default method)`를 사용할 수 있다.<br>
인터페이스의 메서드는 구현체를 가질 수 없지만, 디폴트 메서드를 사용하면 실제 구현된 형태의 메서드를 가질 수 있다.<br>
`default`키워드를 앞에 메서드의 앞에 쓰면 된다.<br>
또한, 디폴트 메서드는 오버라이딩이 가능하다.<br>
```java
class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

interface Predator {
    default String getFood() { // 인터페이스의 디폴트 메서드
        return "고기";
    }
}

class Tiger extends Animal implements Predator {
    public String getFood() {
        return "rabbit";
    }
}

class Lion extends Animal implements Predator {
    public String getFood() {
        return "deer";
    }
}

/* getFood 메서드를 구현하지 않아 디폴트 메서드의 내용을 사용한다. */
class Human extends Animal implements Predator {
}

class ZooKeeper {
    void feed(Predator predator) {
        System.out.println("feed "+predator.getFood());
    }
}

public class HelloWorld {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        Human euiclee = new Human();

        zooKeeper.feed(tiger);   // feed rabbit
        zooKeeper.feed(lion);    // feed deer
        zooKeeper.feed(euiclee); // feed 고기
    }
}
```

### Reference
[05-07 인터페이스](https://wikidocs.net/217)<br>
