> `C/C++`의 `if-else if-else`와 완전히 똑같기 때문에, 간단히 정리하겠다...!

### if-else if-else
`else if`는 앞에 조건문이 모두 `false`여야 확인한다.<br>
모두 `false`라면, `else`가 수행된다.<br>
```java
import java.util.ArrayList;
import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        ArrayList<String> cpp = new ArrayList<>(Arrays.asList("if", "else if", "else"));

        // 간단히 정리 가 출력된다.
        // 맨 처음 if문이 실행되기 때문에, 아래는 확인하지 않는다.
        if (cpp.contains("if")) {
            System.out.println("간단히 정리");
        } else if (cpp.contains("else if")) {
            System.out.println("적당히 정리");
        } else {
            System.out.println("꼼꼼히 정리");
        }
    }
}
```

### Reference
[04-01 if 문](https://wikidocs.net/211)<br>
