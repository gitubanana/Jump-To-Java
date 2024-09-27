### 클래스
클래스를 통해 객체를 만들 수 있다.<br>
`new`는 객체를 생성할 때 사용하는 키워드이다.<br>

### 객체 변수
`static`이 없이 클래스에 선언된 변수이다.<br>
각 객체마다 자신의 객체 변수를 가지고 있다. (객체 변수의 값이 독립적으로 유지된다.) <br>
```java
class Animal {
    String name;

    public void setName(String name) {
        this.name = name;
    }
}

public class HelloWorld {
    public static void main(String[] args) {
        Animal cat = new Animal(); // new 키워드로 객체 생성
        cat.setName("euiclee's cat"); // setName 메서드 호출

        Animal dog = new Animal();
        dog.setName("hyeoan's dog");

        System.out.println(cat.name); // euiclee's cat
        System.out.println(dog.name); // hyeoan's dog
    }
}
```
> `C++`에서도 `this`가 있었는데, 반갑다.<br>
> 물론, `this`가 포인터여서 `C++`에서는 `->`를 통해 객체 변수에 접근한 점이 다르긴 하다.<br>
> (자바는 포인터에 대한 접근을 못하게 한다고 했으니 그냥 객체이기 때문에 `.`을 사용한 것 같다.)<br>

### Reference
[05-02 클래스](https://wikidocs.net/214)<br>
