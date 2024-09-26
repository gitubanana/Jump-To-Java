### 상수 집합
`enum`자료형은 서로 연관있는 여러 개의 상수 집합을 정의할 때 사용한다.
```java
public class HelloWorld {
    enum Position {
        POINT_GUARD,
        SHOOTING_GUARD,
        SMALL_FORWARD,
        POWER_FORWARD,
        CENTER
    }
    public static void main(String[] args) {
        System.out.println(Position.POINT_GUARD);    // POINT_GUARD
        System.out.println(Position.SHOOTING_GUARD); // SHOOTING_GUARD
        System.out.println(Position.SMALL_FORWARD);  // SMALL_FORWARD
        System.out.println(Position.POWER_FORWARD);  // POWER_FORWARD
        System.out.println(Position.CENTER);         // CENTER
        for (Position position: Position.values()) {
            System.out.println(position);
        }
    }
}
```

### enum이 필요한 이유
- **enum을 사용하지 않았을 때**
  ```java
  /*
  position에 해당하는 선수의 수를 리턴하는 메서드.
  @param (1: PG, 2: SG, 3: SF, 4: PF, 5: C)
  */
  int getPlayerCnt(int position) {
    ...
  }

  // 1을 PG로 기억해야 하고, 가독성도 좋지 않다. 또한, 6을 넣어 오류가 생길 수도 있다.
  int pointGuardCnt = getPlayerCnt(1); 
  ```
- **enum을 사용했을 때**
  ```java
  /*
  position에 해당하는 선수의 수를 리턴하는 메서드.
  @param position 선수의 포지션 (Position)
  */
  int getPlayerCnt(Position position) {
    ...
  }

  // 코드가 명확해졌다. 또한, Position에 정의된 상수만 전달할 수 있어 오류를 방지할 수 있다.
  int pointGuardCnt = getPlayerCnt(Position.POINT_GUARD); 
  ```
매직 넘버를 사용할 때보다 코드가 명확하다.<br>
잘못된 값을 사용해 생길 수 있는 오류를 막을 수 있다.<br>
> 매직 넘버는 상수로 선언하지 않고, 사용하는 숫자다. (모든 곳에 의미가 들어갈 수 있어 매직이 붙은 것 같다.)<br>


### Reference
[03-10 상수 집합](https://wikidocs.net/157271)<br>
[Storing integer values as constants in Enum manner in java [duplicate]](https://stackoverflow.com/questions/3990319/storing-integer-values-as-constants-in-enum-manner-in-java)<br>
