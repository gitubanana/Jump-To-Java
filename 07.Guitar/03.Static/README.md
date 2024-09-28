### static 변수
`static 변수`를 통해 값을 공요할 수 있다.<br>
(`static 변수`를 설정하면, 같은 메모리 주소만 보기 때문에, 공유할 수 있다.)<br>
```java
class Counter {
    static int count = 0;

    Counter() {
        ++count;
        System.out.println(count);
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Counter c1 = new Counter(); // 1
        Counter c2 = new Counter(); // 2
    }
}
```

### static 메서드
`static 메서드`는 객체 생성 없이도 클래스를 통해 호출할 수 있다.<br>
그렇기 때문에, `static 메서드`내에서는 객체 변수는 사용할 수 없고, `static 변수`만 사용할 수 있다.
(물론, 메서드 내에서 새로운 변수를 생성하면 사용 가능하다.) <br>
```java
import java.text.SimpleDateFormat;
import java.util.Date;

class Util {
    public static String getCurrentDate(String fmt) {
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        return sdf.format(new Date());
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Util.getCurrentDate("yyyy-MM-dd")); // 오늘 날짜가 출력된다.
    }
}
```

### 싱글톤 패턴
`Java`의 디자인 패턴 중 하나이다.<br>
`싱글톤(singleton)`은 단 하나의 객체만을 생성하게 강제하는 디자인 패턴이다.<br>
내부에 객체 하나만을 가지기 위해서, 외부에서 객체 생성을 못하게 `private` 생성자를 만든다.<br>
그리고, `static 변수`로 내부에서 객체를 만든다. 이 객체는 메서드를 통해서만 접근할 수 있다.<br>
```java
class Singleton {
    private static Singleton one = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return one;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();

        System.out.println(a == b); // true 출력 a와 b는 같은 객체를 가리키고 있다.
    }
}

```

### Reference
[07-03 스태틱](https://wikidocs.net/228)<br>
