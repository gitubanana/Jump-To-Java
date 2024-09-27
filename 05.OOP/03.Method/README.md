### 메서드의 구조
> `C++`의 메서드랑 구조가 똑같다.<br>
```java
리턴자료형 메서드명(입력자료형1 매개변수1, 입력자료형2 매개변수2, ...) {
    ...    
    return 리턴값;
}
```

### 메서드 내에서 선언된 변수의 효력 범위
`Java`도 `C++`과 동일하게 `블록{}`내에서만 변수가 유지된다.<br>
```java
public class HelloWorld {
    int a;

    void increase() {
        ++this.a;
    }

    public static void main(String[] args) {
        {
            HelloWorld hi = new HelloWorld();

            hi.a = 42;
            hi.increase();
            System.out.println(hi.a); // 43
        }

         // hi.increase(); // hi가 있던 블록이 끝나서 hi는 없어졌다.
    }
}
```

### Reference
[05-03 메서드 더 살펴보기](https://wikidocs.net/225)<br>
