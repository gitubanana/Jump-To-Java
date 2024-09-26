### JDK 설치하기
자바 프로그램을 만들기 위해서는 `JDK(Java development kit)`를 꼭 설치해야 한다.<br>
`JDK`는 자바 코드 작성 도구, 컴파일러, JVM 등으로 이루어져 있다.<br>

현재 (2024.09.25) 기준으로 설치했기 때문에, 당신이 보고 있을 때는 다른 방법일 수 있습니다..!
1. [Java Downloads](https://www.oracle.com/kr/java/technologies/downloads/#jdk23-windows) 접속
2. 각 운영체제에 맞는 거 설치 (필자는 Windows x64 installer 설치)
> [!NOTE]
> `.exe`와 `.msi` installer 차이는<br>
> `.exe`는 installer와 installation file을 담고 있어 설치 환경에 상관없이 설치할 수 있고,<br>
> `.msi`는 MS installer(윈도우에 내장되어 있는 실행파일)에 의해 실행되기 때문에, 버전이 맞지 않으면 실행 못 할 수도 있다.<br>
>  또한, `.msi` 파일은 WindowsInstaller API를 이용해 편집할 수 있다. 즉, `msi DB`에 접근할 수 있다...<br>
>  ([~~이걸 이용해 해킹할 수 있다~~...](https://quasarzone.com/bbs/qn_hardware/views/1471722))<br>

### 자바 파일과 컴파일
- **javac**<br>
  `java compiler`의 줄임말이다.<br>
  자바 파일을 컴파일할 때 사용하는 것이 `javac.exe`이다.<br>
- **자바 파일**<br>
  작성해야 할 자바 프로그램이다.<br>
  자바 프로그램은 확장자가 `.java`인 파일로 저장되는데, 이 파일을 자바 파일 혹은 자바 소스라고 한다.<br>
- **실행 과정**<br>
  만약, `MyProgram.java`라는 프로그램을 실행한다면, 다음과 같은 단계를 거친다.
  1. `MyProgram.java`파일 작성 (소스코드 작성)
  2. 컴파일러가 `MyProgram.java`를 이용해 `MyProgram.class`를 생성 (`.class`파일은 `JVM`이 인식할 수 있는 `binary file`이다.)
  3. `JVM`은 위에서 만든 `MyProgram.class`의 `binary code`를 해석해 프로그램 실행
  4. MyProgram의 실행 결과가 컴퓨터에 반영

  ![image](http://wikidocs.net/images/page/256/compile.png)<br>
  (그림에서 컴파일러는 `javac.exe`이고, JVM은 `java.exe`에 해당한다.)

> [!IMPORTANT]
> C/C++은 컴파일 하면 바로 실행파일을 만드는데, 자바는 왜 실행파일이 아닌 `class`파일이 생성할까?<br>
> C/C++에서 컴파일 되어 나온 실행파일은 모든 운영체제에서 사용할 수 없다. (ex. 윈도우에서의 실행파일은 리눅스에서 실행 못 한다)<br>
> 반대로, 자바는 `JVM`이라는 중간 단계를 거치기 때문에 한 번 작성한 `class`파일은 어떤 운영체제에서도 사용할 수 있다.<br>
> 이 때문에, C/C++보다는 자바가 속도가 느리다... (자바 또한, JIT를 도입해 하드웨어를 직접 제어하는 경우만 아니라면 속도를 거의 따라잡았다네요)


### 간단한 프로그램 실행해보기
윈도우 기준이다.<br>
1. [윈도우 + R] 누르고, `cmd`입력 후 엔터를 눌러 도스창 띄우기
2. `copy con HelloWorld.java`명령어 입력하고,
    ```bash
    class HelloWorld {
    }
    ^Z // console에서 입력을 받기 때문에, ctrl + z를 누르고 엔터를 누르면 입력을 그만 받는다.
    ```
3. `javac HelloWorld.java`명령어를 이용해 해당 자바소스를 컴파일 (HelloWorld.class파일이 생긴다.)
4. `java HelloWorld`로 `.class`파일 실행 (`java`의 인자로 확장자인 `.class`는 빼고, 파일명만 넣어줘야 한다.)<br>
    그러면, `main` 메소드가 없기 때문에 일단 에러가 생겼지만 자바소스를 실행해 본 것에 의의를 두자.<br>
    ```bash
    Error: Main method not found in class HelloWorld, please define the main method as:
      public static void main(String[] args)
    or a JavaFX application class must extend javafx.application.Application
    ```

### 인텔리제이 실행하기
1. [IntelliJ Downloads](https://www.jetbrains.com/ko-kr/idea/download/?section=windows) 접속
2. 운영체제에 맞는 거 설치 (아래로 내려가면 무료판이 있다.)
3. IntelliJ를 실행하고, [New Project]로 프로젝트를 만들면 된다.
4. `src`폴더에서 우클릭 [New -> Java Class] 클릭. `HelloWorld`로 파일명 입력.
5. 그러면, `HelloWorld.java`파일이 생기고 아래와 같은 내용이 있다.
   ```java
   public class HelloWorld {
   }
   ```

> [!NOTE]
> `src`폴더에 `.java`파일들이 저장된다.<br>
> `.iml`은 현재 프로젝트의 환경값을 저장하는 인텔리제이의 설정 파일이다.<br>
> 클래스명과 파일명이 같은 그 class 앞에 `public`을 붙여줘야 하는 관례가 있다.<br>

### main 메서드 이해하기
어떤 프로그램이든 시작과 끝이 있는데 이걸 관리하는 것이 `main` 메서드이다.<br>
```java
public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}
```
[Run -> Run -> HelloWorld]로 프로그램 실행!
```bash
Hello World
```

> [!NOTE]
> 클래스 내의 함수를 메서드라고 부르는데, 자바는 모든 것이 클래스 기반이므로 자바에서 사용하는 함수는 모두 메서드이다.<br>
> IntelliJ에서 작성한 `.java`파일을 Run명령으로 실행하면 `.class`파일을 만드는 컴파일 과정(javac.exe)과 실행 과정(java.exe)이 자동으로 진행된다.<br>


### Reference
[03 자바 둘러보기](https://wikidocs.net/887)<br>
[Install software: choose .msi or .exe?](https://superuser.com/questions/38221/install-software-choose-msi-or-exe)<br>
[Windows application installer frameworks](https://stackoverflow.com/questions/1284825/windows-application-installer-frameworks)<br>
