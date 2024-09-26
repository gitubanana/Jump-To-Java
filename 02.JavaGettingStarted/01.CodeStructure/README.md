### 자바 코드의 구조
```java
/* 클래스 블록 */
public class 클래스명 {

  /* 메서드 블록 */
  [public|private|protected] [static] (리턴자료형|void) 메서드명1(입력자료형 매개변수, ...) {
    명령문(statement);
    ...
  }

  /* 메소드 블록 */
  [public|private|protected] [static] (리턴자료형|void) 메서드명1(입력자료형 매개변수, ...) {
    명령문(statement);
    ...
  }
}
```
- **클래스 블록**<br>
  자바 코드의 가장 바깥쪽 영역은 클래스 블록이다.<br>
  클래스명은 소스 파일의 이름과 똑같이 사용해야 한다!!!<br>
  클래스 블록은 여러 메서드 블록을 포함한다.<br>
- **메서드 블록**<br>
  `[public|private|protected]`는 셋 중 하나가 오거나 안 올 수도 있다는 뜻이다. (C++의 접근 제어자와 비슷한 것 같다...)<br>
  `[static]`은 `static`이 올 수도 있거나 오지 않을 수도 있다는 뜻이다. (인스턴스 없이도 사용할 수 있는 C++의 `static`과 비슷한 것 같다..)<br>
  `(리턴 자료형|void)`는 메서드의 리턴값 자료형이다. (리턴값이 없다면 `void`를 써줘야 한다.)<br>
  그 뒷 부분은 일반적인 함수라면 가지고 있을 이름과 매개변수이다.<br>
  > 속성과 생성자는 나중에 다룬다.

```java
/* 클래스 블록 */
public class sample {
  /* 메서드 블록 */
  public static void main(String[] args) {
    /* 명령문 */
    System.out.println("Hello java");
  }
}
```
> [!NOTE]
> `C/C++`과 동일하게 명령문 끝에는 `;`을 붙여줘 문장이 끝났다는 것을 표시해야 한다.<br>
> ([역시 `C`의 가족이다.](https://en.wikipedia.org/wiki/List_of_C-family_programming_languages))<br>



### Reference
[02-01 자바 코드의 구조 살펴보기](https://wikidocs.net/278)<br>
