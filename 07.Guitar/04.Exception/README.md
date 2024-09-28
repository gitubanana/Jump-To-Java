### try-catch
`try-catch`문을 사용하면 예외를 처리할 수 있다.<br>
`try`문 안의 수행할 문장 중 예외가 발생하지 않는다면, `catch`문에 속한 문장들은 수행되지 않는다.<br>
반대로, 예외가 생긴다면 그 예외에 해당되는 `catch`문이 수행된다.<br>
```java
try {
    <수행할 문장 1>;
    <수행할 문장 2>;
    ...
} catch(예외1) {
    <수행할 문장 A>;
    ...
} catch(예외2) {
    <수행할 문장 a>;
    ...
}
```
```java
public class Main {
    public static void main(String[] args) {
        try {
            int c = 4 / 0;
        } catch (ArithmeticException e) {
            /*
            java.lang.ArithmeticException: / by zero
                at Main.main(Main.java:4)
            */
            e.printStackTrace();
        }
    }
}
```

### finally
예외가 발생하면 프로그램이 중지되거나 예외 처리에 의해 `catch`구문이 실행된다.<br>
`finally`를 이용하면, 예외 발생 여부에 상관없이 무조건 실행시켜야 하는 코드를 실행시킬 수 있다.<br>
```java
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("iSeeYouCrystalClear.txt");

        try {
            int b = fr.read();
        } catch (IOException e) {
            e.printStackTrace();
            return; // return을 하더라도 finally문을 실행한다.
        } finally {
            fr.close(); // 예외 발생 여부에 상관없이 파일은 닫아줘야 한다.
            System.out.println("file closed");
        }
    }
}
```
> `Go`에서는 `defer`로 함수가 끝나더라도 무조건 수행하게 만들어 코드를 깜끔하게 짤 수 있다!!!

### RuntimeException과 Exception
예외는 크게 두 가지로 구분된다.<br>
1. `RuntimeException`은 실행 시 발생하는 예외 (발생할 수도 있고 않을 수도 있을 경우 사용, `Unchecked Exception`) <br>
2. `Exception`는 컴파일 시 발생하는 예외 (예측이 가능한 경우 사용, `Checked Exception`)

### RuntimeException
```java
class FoolException extends RuntimeException {
}

public class Main {
    public void sayNick(String nick) {
        if ("바보".equals(nick)) {
            throw new FoolException();
        }

        System.out.println("당신의 별명은 "+nick+"입니다.");
    }

    public static void main(String[] args) throws Exception {
        Main euiclee = new Main();

        /*
        Exception in thread "main" FoolException
            at Main.sayNick(Main.java:7)
            at Main.main(Main.java:16)
         */
        euiclee.sayNick("바보");
        euiclee.sayNick("야호");
    }
}
```

### Exception
위 코드에서 `RuntimeException`을 `Exception`으로 바꾸고, 돌리면 컴파일 에러가 생긴다.
> (java: unreported exception FoolException; must be caught or declared to be thrown)
`FoolException`이 예측 가능한 `Checked Exception`으로 변경되어 예외 처리를 컴파일러가 강제하기 때문이다.<br>
`try-catch`문으로 예외 처리를 해줘야 컴파일이 가능하다.
```java
class FoolException extends Exception {
}

public class Main {
    public void sayNick(String nick) {
        try {
            if ("바보".equals(nick)) {
                throw new FoolException();
            }

            System.out.println("당신의 별명은 "+nick+"입니다.");
        } catch (FoolException e) {
            System.out.println("FoolException 발생");
        }
    }

    public static void main(String[] args) throws Exception {
        Main euiclee = new Main();

        euiclee.sayNick("바보"); // FoolException 발생
        euiclee.sayNick("야호"); // 당신의 별명은 야호입니다.
    }
}
```

### 예외 던지기
위 코드에서는 `sayNick`메서드에서 예외 발생과 처리를 다 했다.<br>
이렇게 하지 않고, `sayNick`을 호출한 곳에서 예외 처리하도록 예외를 던질 수 있는 방법이 있다.<br>
`throws`문을 이용하면, 예외 처리를 메서드 호출자에게 미룰 수 있다.<br>
```java
class FoolException extends Exception {
}

public class Sample {
    public void sayNick(String nick) throws FoolException { // throws로 예외 처리를 호출자에게 미루기
        if("바보".equals(nick)) {
            throw new FoolException();
        }
        System.out.println("당신의 별명은 "+nick+" 입니다.");
    }

    public static void main(String[] args) {
        Sample sample = new Sample();
        try {
            sample.sayNick("바보");
            sample.sayNick("야호");
        } catch (FoolException e) {
            System.err.println("FoolException이 발생했습니다.");
        }
    }
}
```
> `Main`메서드에서 try-catch를 안 하면, `Checked Exception`처리하지 않았기 때문에, 컴파일 에러가 생긴다.<br>
> `Main`메서드에서도 예외 처리를 미루면 컴파일은 되지만, 실행 과정에서 예외가 생긴다.<br>


### Reference
[07-04 예외 처리](https://wikidocs.net/229)<br>
