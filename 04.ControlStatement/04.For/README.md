> `C/C++`과 완전히 똑같으니, 간단히 정리하겄다?!

### for
```java
for (초기치; 조건문; 증가치) {
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
        for (; startingNum < playerPositions.size(); ++startingNum) {
            if (playerPositions.get(startingNum) == Position.CENTER) {
                break;
            }
        }

        if (startingNum == playerPositions.size()) {
            startingNum = -1;
        }

        // startingNum : 2
        System.out.printf("startingNum : %d\n", startingNum);
    }
}

```

### Reference
[04-04 for문](https://wikidocs.net/213)<br>
 
