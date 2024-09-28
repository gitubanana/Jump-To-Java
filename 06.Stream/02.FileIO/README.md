### FileOutputStream
`InputStream`과 마찬가지로 `OutputStream`도 `byte`단위로 데이터를 처리하는 클래스이다.<br>
`FileOutputStream`은 `OutputStream`을 상속받아 만든 클래스이므로 역시 `byte` 단위로 데이터를 처리한다.<br>
```java
import java.io.*;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) throws Exception {
        FileOutputStream output = new FileOutputStream("output.txt"); // 파일명은 output.txt
        for (int i = 1; i <= 10; ++i) {
            String data = i+"번째 줄\r\n";
            output.write(data.getBytes()); // String을 byte 배열로 바꿔서 쓴다.
        }

        output.close(); // 파일 객체 닫아주기
    }
}
```
> [!NOTE]
> `close`에서드를 통해서 파일 객체 닫아줄 수 있다.<br>
> 자바 프로그램을 종료할 때만 자동으로 닫아주기 때문에, 가급적 닫아주는 게 좋다!<br>

### FileWriter
`FileWriter`는 `byte`대신에 `String`을 슬 수 있다.<br>
```java
import java.io.*;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) throws Exception {
        FileWriter output = new FileWriter("output.txt");
        for (int i = 1; i <= 10; ++i) {
            String data = i+"번째 줄\r\n";
            output.write(data); // String으로 쓸 수 있다.
        }

        output.close();
    }
}
```

### PrintWriter
`FileWriter`를 사용하더라도 뒤에 개행을 붙여줘야 해서 번거롭다.<br>
`PrintWriter`는 `println`메서드를 통해 자동으로 개행을 붙여서 파일에 쓸 수 있다.<br>
```java
import java.io.*;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) throws Exception {
        PrintWriter output = new PrintWriter("output.txt");
        for (int i = 1; i <= 10; ++i) {
            String data = i+"번째 줄";
            output.println(data); // 개행을 자동으로 붙여준다.
        }

        output.close();
    }
}
```

> [!NOTE]
> `FileOutputStream`는 `byte`를 출력하고,<br>
> `FileWriter`는 `String`을 출력하고,<br>
> `PrintWriter`는 `String` + 개행을 출력한다.<br>

### 파일에 내용 추가하기
`FileOutputStream`과 `FileWriter`의 생성자에 두 번째 인자로 `true`를 넣어주면 추가 모드로 열린다.<br>
`PrintWriter`는 추가 모드로 열린 `FileWriter`의 객체를 전달하면 된다.<br>
```java
import java.io.*;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) throws Exception {
        FileWriter fw =  new FileWriter("output.txt", true); // output.txt를 추가 모드로 열기
        PrintWriter output = new PrintWriter(fw);
        for (int i = 11; i <= 20; ++i) {
            String data = i+"번째 줄";
            output.println(data);
        }

        output.close();
    }
}
```

### 파일 읽기
`FileInputStream`클래스를 이용해 파일을 읽을 수 있다.<br>
다만, byte배열로 읽어야 하기 때문에 불편하다.<br>
```java
import java.io.*;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) throws Exception {
        byte[] b = new byte[1024];
        FileInputStream input = new FileInputStream("output.txt");

        input.read(b); // b의 크기만큼 output.txt에서 읽기
        System.out.println(new String(b));
        input.close();
    }
}
```
`FileReader`와 `BufferedReader`를 사용하면, 한 줄 단위로 파일을 읽을 수 있다.<br>
```java
import java.io.*;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("output.txt"));

        while (true) {
            String line = br.readLine();
            if (line == null) { // 더 이상 읽을 라인이 없을 경우, null을 리턴한다.
                break;
            }

            System.out.println(line);
        }
        br.close();
    }
}
```

### Reference
[06-02 파일 입출력](https://wikidocs.net/227)<br>
