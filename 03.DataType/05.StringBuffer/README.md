### StringBuffer
문자열을 추가하거나 변경할 때 주로 사용하는 자료형이다.<br>
- **append**<br>
  ```java
  StringBuffer sb = new StringBuffer();

  sb.append("hello");
  sb.append(" ");
  sb.append("jump to java");
  String result = sb.toString();
  System.out.println(result); // hello jump to java
  ```
  ```java
  String result = "";
  result += "hello";
  result += " ";
  result += "jump to java";
  System.out.println(result); // hello jump to java
  ```
  `StringBuffer` 자료형은 `append` 메서드를 사용해 문자열을 계속해서 추가할 수 있다.<br>
  `toString()` 메서드를 사용하면 `StringBuffer`를 `String`자료형으로 변경할 수도 있다.<br>

  첫 번째와 두 번째 예제는 결과는 같지만, 내부적으로 객체를 생성하고 메모리를 사용하는 과정은 다르다.<br>
  첫 번째는 `StringBuffer`객체를 한 번만 생성하지만,<br>
  두 번째는 `String`자료형에 `+`연산이 있을 때마다 새로운 `String`객체를 생성하므로 총 4개의 `String`객체가 만들어진다!!!<br>
  (왜냐하면, `String`은 값을 못 바꾸기 때문이다. (immutable))
  > `StringBuffer`는 `String`보다 무겁기 때문에, 문자열을 변경하는 작업이 많을 때는 `StringBuffer`를, 아닌 경우에는 `String`을 사용하는 것이 좋다.
> [!NOTE]
> `StringBuilder`는 `StringBuffer`와 비슷한 자료형으로, 사용법도 같다.<br>
> `StringBuffer`는 멀티 스레드 환경에서 안전하고, `StringBuilder`는 멀티 스레드 환경에서 안전하지 않은 대신에 성능이 우수하다.<br>
- **insert**<br>
  원하는 인덱스에 문자열을 삽입할 수 있다.<br>
  ```java
  StringBuilder sb = new StringBuilder();
  sb.append("jump to java");
  sb.insert(0, "hello ");
  System.out.println(sb.toString()); // hello jump to java
  ```
- **substring**<br>
  `substring`메서드는 `String`자료형의 `substring`메서드와 동일하게 동작한다.<br>
  ```java
  StringBuilder sb = new StringBuilder();
  sb.append("Hello Michael Jordan");
  System.out.println(sb.substring(14, 20)); // Jordan
  ```

### Reference
[03-05 StringBuffer](https://wikidocs.net/276)<br>
