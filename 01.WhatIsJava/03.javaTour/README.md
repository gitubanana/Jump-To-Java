### JDK 설치하기
자바 프로그램을 만들기 위해서는 `JDK(Java development kit)`를 꼭 설치해야 한다.<br>
`JDK`는 자바 코드 작성 도구, 컴파일러 등으로 이루어져 있다.<br>

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




### Reference
[03 자바 둘러보기](https://wikidocs.net/887)<br>
[Install software: choose .msi or .exe?](https://superuser.com/questions/38221/install-software-choose-msi-or-exe)<br>
[Windows application installer frameworks](https://stackoverflow.com/questions/1284825/windows-application-installer-frameworks)<br>
