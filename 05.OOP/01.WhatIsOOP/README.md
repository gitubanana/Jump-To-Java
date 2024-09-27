### 객체가 왜 필요한가?
계산기의 더하기 기능을 구현해보자.
```java
class Calculator {
    static int result = 0;

    static int add(int num) {
        result += num;
        return result;
    }
}

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println(Calculator.add(3)); // 3
        System.out.println(Calculator.add(4)); // 7
    }
}
```
여기서 계산기가 더 많이 필요해지면 어떻게 될까?<br>
만약에, `객체`을 사용하지 않는다면 클래스 `Calculator2, ..., CalculatorN`를 만들어서 써야 할 것이다.<br>
`객체`를 사용한다면, 간단히 해결할 수 있다.<br>
```java

class Calculator {
    int result = 0;

    int add(int num) {
        result += num;
        return result;
    }
}

public class HelloWorld {
    public static void main(String[] args) {
        Calculator cal1 = new Calculator();
        Calculator cal2 = new Calculator();

        System.out.println(cal1.add(4)); // 4
        System.out.println(cal1.add(2)); // 6

        System.out.println(cal2.add(2)); // 2
        System.out.println(cal2.add(2)); // 4
    }
}
```
> 이렇게 객체를 사용한다면, 기능을 재활용할 수 있다.<br>
> 또한, 빼기 기능도 추가하고 싶다면, `sub`메서드를 추가하면 된다.<br>

### Reference
[05-01 객체 지향 프로그래밍이란](https://wikidocs.net/156068)<br>
