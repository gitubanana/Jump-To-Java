> `C/C++`과 비슷하기 때문에, 간단히 정리하겠다.......?!

### while
```java
while (조건문) { // 조건문이 참일 동안, 블록 안 코드를 수행한다.
    <수행할 문장1>;
    ...
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

        int startingNum = 0;
        while (startingNum < playerPositions.size()) {
            if (playerPositions.get(startingNum) == Position.CENTER) {
                break;
            }
            ++startingNum;
        }

        if (startingNum == playerPositions.size()) {
            startingNum = -1;
        }

        // startingNum : 2
        System.out.printf("startingNum : %d\n", startingNum);
    }
}
```
`break`는 `while`문을 빠져나간다.<br>
`continue`는 조건문으로 돌아간다.<br>

### Reference
[04-03 while문](https://wikidocs.net/212)<br>
