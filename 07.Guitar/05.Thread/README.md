### 스레드
동작하고 있는 프로그램을 `프로세스(process)`라고 한다.<br>
보통 한 개의 프로세스는 한 가지의 일을 하지만, `스레드(thread)`를 이용하면 한 프로세스 내에서 두 가지 이상의 일을 동시에 할 수 있다.<br>

### Thread
`Thread`클래스를 상속받고, `run`메서드를 오버라이딩하면 된다.<br>
`Thread`를 실행시킬 때는 `start`메서드를 실행하면 된다.<br>
```java
public class Main extends Thread {
    int seq;

    public Main(int seq) {
        this.seq = seq;
    }

    /*
    Thread를 상속하면, run메서드를 구현해야 한다.
    Thread가 Runnable 인터페이스를 상속했다. Runnable 인터페이스 메서드는 run이다.
     */
    public void run() {
        System.out.println(this.seq+" thread start.");

        try {
            Thread.sleep(1000); // 1초 대기
        } catch (Exception e) {
        }

        System.out.println(this.seq+"thread end");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; ++i) { // 총 10 개의 쓰레드 생성하고 실행
            Thread t = new Main(i);
            t.start();
        }

        System.out.println("main end."); // 메인 쓰레드 종료
    }
}
```

### Join
위 코드에서는 스레드가 모두 수행되고, 종료되기 전에 `main`메서드가 먼저 종료되었다.<br>
`join`메서드를 통해 모든 스레드가 종료된 후에 `main` 쓰레드를 종료할 수 있다.<br>
```java
import java.util.ArrayList;

public class Main extends Thread {
    int seq;

    public Main(int seq) {
        this.seq = seq;
    }

    /*
    Thread를 상속하면, run메서드를 구현해야 한다.
    Thread가 Runnable 인터페이스를 상속했다. Runnable 인터페이스 메서드는 run이다.
     */
    public void run() {
        System.out.println(this.seq+" thread start.");

        try {
            Thread.sleep(1000); // 1초 대기
        } catch (Exception e) {
        }

        System.out.println(this.seq+"thread end");
    }

    public static void main(String[] args) {
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; ++i) { // 총 10 개의 쓰레드 생성하고 실행
            Thread t = new Main(i);

            t.start();
            threads.add(t);
        }

        for (int i = 0; i < threads.size(); ++i) {
            Thread t = threads.get(i);

            try {
                t.join(); // t 쓰레드가 종료할 때까지 기다린다.
            } catch (Exception e) {
            }
        }

        System.out.println("main end."); // 메인 쓰레드 종료
    }
}
```

### Runnable
`Thread`클래스를 상속하여 만들기도 하지만, 주로 `Runnable`인터페이스를 사용한다.<br>
왜냐하면, `Thread`클래스를 상속하면 상속받은 클래스가 다른 클래스를 상속할 수 없기 때문이다.<br>
(클래스는 다중 상속이 안 된다. 인터페이스는 가능하다.)<br>

`Thread` 생성자에 `Runnable`인터페이스를 상속받은 객체를 넣어주면 된다.<br>
```java
import java.util.ArrayList;

public class Main implements Runnable {
    int seq;
    public Main(int seq) {
        this.seq = seq;
    }

    public void run() {
        System.out.println(this.seq+" thread start.");

        try {
            Thread.sleep(1000); // 1초 대기
        } catch (Exception e) {
        }

        System.out.println(this.seq+"thread end");
    }

    public static void main(String[] args) {
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; ++i) { // 총 10 개의 쓰레드 생성하고 실행
            Thread t = new Thread(new Main(i)); // Runnable 상속 받은 클래스를 Thread 생성자에 넣어주면 된다.

            t.start();
            threads.add(t);
        }

        for (int i = 0; i < threads.size(); ++i) {
            Thread t = threads.get(i);

            try {
                t.join(); // t 쓰레드가 종료할 때까지 기다린다.
            } catch (Exception e) {
            }
        }

        System.out.println("main end."); // 메인 쓰레드 종료
    }
}
```

### Reference
[07-05 스레드](https://wikidocs.net/230)<br>
