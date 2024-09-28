### InputStream
`InputStream`은 바이트 단위의 데이터를 읽어 들일 때 사용하는 내장 클래스다.<br>
`System.in`은 `InputStream`의 객체이다.<br>
`System.in`을 통해서 콘솔에서 입력을 받을 수 있다.<br>
`read`메서드를 통해서, 입력값의 아스키 코드값을 받을 수 있다.
```java
import java.io.IOException;
import java.io.InputStream;

public class HelloWorld {
    public static void main(String[] args) throws Exception {
        InputStream in = System.in;

        {
            int a = in.read(); // 입력값의 1byte를 읽고, 아스키코드 리턴 (0~255)
            System.out.println(a); // 아스키 코드값을 출력한다.
        }

        {
            byte[] a = new byte[3];
            in.read(a); // a의 크기만큼 읽기
            for (int i = 0; i < a.length; ++i) {
                System.out.println(a[i]);
            }
        }
    }
}
```

### InputStreamReader
`InputStream`의 `read`메서드는 문잣값이 아닌 아스키 코드값을 주기 때문에, 불편한다.<br>
`byte`대신 `char`로 입력로 입력 스트림을 읽으려면 `InputStreamReader`를 사용하면 된다.<br>
`InputStreamReader`의 생성자에 `InputStream`객체를 넣어주면 된다.<br>
> (아래 코드에서는 콘솔 입력에서 받기 때문에, `System.in`을 넣었다.)<br>
```java
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class HelloWorld {
    public static void main(String[] args) throws Exception {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);

        char[] a = new char[3];
        reader.read(a); // 문자로 a의 크기만큼 받기

        System.out.println(a); // 문자가 출려된다.<br>
    }
}
```

### BufferedReader
앞에서는 고정된 길이로만 스트림을 읽어서 불편했다.<br>
`BufferedReader`는 길이에 상관없이 입력한 값을 모두 받아들인다.<br>
`BufferedReader`의 생성자에 `InputStreamReader`의 객체를 넣어주면 된다.<br>
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class HelloWorld {
    public static void main(String[] args) throws Exception {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        String line = br.readLine(); // 입력값의 한 줄을 가져온다.
        System.out.println(line);
    }
}
```
> [!NOTE]
> `InputStream`은 `byte`를 읽는다. (아스키 코드)<br>
> `InputStreamReader`는 `char`를 읽는다. (문자)<br>
> `BufferedReader`는 `String`을 읽는다. (문자열)<br>

### Scanner
`J2SE 5.0`부터 `java.util.Scanner` 클래스가 새로 추가되었다.<br>
`Scanner`클래스를 이용하면, 쉽게 토큰을 받아올 수 있다.<br>
`Scanner`의 생성자에 `InputStream`객체를 넣어주면 된다.<br>
`next`메서드는 토큰을 읽어 오고,<br>
`nextLine`메서드은 라인을 읽어 오고,<br>
`nextInt`는 정수를 읽어 온다. 그 외에도 `nextDouble`, `nextLong` 등이 있다.<br>
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.next()); // 토큰을 가져온다 (String).
    }
}
```
> [!NOTE]
> `Scanner`클래스는 느리기 때문에, 백준에서는 시간 초과가 나기 쉽다.<br>
> 빠른 `BufferedReader`를 사용하는 것이 좋다!!!<br>

### PrintStream
`System.out.println`메서드를 계속 써왔는데, `System.out`은 `PrintStream`의 객체이다.<br>
오류 메시지를 출력할 때 쓰는 `System.err`도 있다.<br>
> 각각 STDOUT, STDIN을 담당하는 것 같다.<br>
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) throws Exception {
        System.out.println("STDOUT 이지롱");
        System.err.println("STDERR 이지롱");
    }
}
```

### Reference
[06-01 콘솔 입출력](https://wikidocs.net/226)<br>
