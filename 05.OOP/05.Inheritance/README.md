### 상속
기반 클래스의 속성을 상속 받아 파생 클래스를 만들 수 있다.
`extends` 키워드를 이용해 상속을 할 수 있다.
기반 클래스의 메서드를 파생 클래스에서 재정의하는 `오버라이딩(overriding)`과<br>
메서드명은 같지만, 매개변수의 타입이 다른 메서드를 정의하는 `오버로딩(overloading)`도 가능하다.<br>
> `C++`은 접근 지시자를 이용해 상속을 했었는데...
```java
class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    void sleep() {
        System.out.println(this.name + ": 쿨쿨...");
    }
}

class HouseDog extends Dog {
    void sleep() { // Dog의 sleep을 오버라이딩 했다.
        System.out.println(this.name + ": 꿀꿀꿀...");
    }

    void sleep(int hour) { // sleep함수를 오버로딩했다.
        System.out.println(this.name + ": 꿀꿀꿀... " + hour + "시간동안");
    }
}

public class HelloWorld {
    public static void main(String[] args) {
        HouseDog houseDog = new HouseDog();
        // Animal dog = new Dog(); // 가능하다. Dog is an Animal.

        houseDog.setName("진돗개");
        houseDog.sleep(); // 진돗개: 꿀꿀꿀...
        houseDog.sleep(2); // 진돗개: 꿀꿀꿀... 2시간동안
    }
}
```
> [!IMPORTANT]
> `Java`에서 만드는 모든 클래스는 `Object`클래스를 상속받는다.<br>

### 다중 상속
2개 이상의 클래스를 상속받는 `다중 상속`을 지원하지 않는다.<br>
다중 상속이 문제가 생길 수 있기 때문에, 지원하지 않는 것 같다.<br>
> 그렇기 때문에, 포인터도 지원하지 않는다.... 흑흑<br>

다중 상속의 대표적인 문제가 [다이아몬드 상속](https://en.wikipedia.org/wiki/Multiple_inheritance#:~:text=inherit%20multiple%20methods.-,The%20diamond%20problem,-%5Bedit%5D)이다.<br>
> `C++`에서는 위 문제를 가상 상속을 통해 해결했다.

### Reference
[05-05 상속](https://wikidocs.net/280)<br>
