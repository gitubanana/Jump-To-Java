> `C/C++`과 비슷하기 때문에, 간단히 정리하겠다...!

### switch
```java
switch(입력변수) {
    case 입력값1: ...
         break; // break를 써줘야, 이 case가 실행되었을 때 아래 case문들이 실행되지 않는다.
    case 입력값2: ...
         break;
    ...
    default: ...
         break;
}
```
```java
import java.util.ArrayList;
import java.util.Arrays;

public class HelloWorld {
    enum Position {
        POINT_GUARD,
        SHOOTING_GUARD,
        SMALL_FORWARD,
        POWER_FORWARD,
        CENTER
    }

    public static void main(String[] args) {
        ArrayList<Position> playerPositions = new ArrayList<>(Arrays.asList(Position.POINT_GUARD, Position.POINT_GUARD, Position.CENTER, Position.SHOOTING_GUARD));

        int pgCnt = 0;
        int cCnt = 0;
        int otherCnt = 0;

        for (int i = 0; i < playerPositions.size(); ++i) {
            switch (playerPositions.get(i)) {
                case POINT_GUARD:
                    ++pgCnt;
                    break;
                case CENTER:
                    ++cCnt;
                    break;
                default:
                    ++otherCnt;
                    break;
            }
        }

        // PG : 2, C : 1, Other : 1
        System.out.printf("PG : %d, C : %d, Other : %d\n", pgCnt, cCnt, otherCnt);
    }
}
```
> [!IMPORTANT]
> 입력 변수의 자료형은 `byte`, `short`, `char`, `int`, `enum`, `String`만 가능하다.

### Reference
[04-02 switch/case문](https://wikidocs.net/263)<br>
