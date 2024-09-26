> `C++`의 `range-based for`과 똑같으니, 간단히 정리하겠습니다.

### for each
```java
for (type 변수명: iterate) {
    body-of-loop
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

        for (Position position : playerPositions) {
            switch (position) {
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

### Reference
[04-05 for each문](https://wikidocs.net/264)<br>
