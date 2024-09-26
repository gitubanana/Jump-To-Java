### 문자열
문자열은 문자의 나열이다.<br>
`""`로 감싸면 된다.
```java
String a = "Happy Java";
String trueNews = "Jordan is Goat";

/* 다음과 같이 표현할 수도 있다. */
String a = new String("Happy Java");
String trueNews = new String("Jordan is Goat");
```
```java
/*
String는 바뀌지 않기 때문에,
literal를 사용한다면, a1과 a2는 string constant pool에 있는 "Hi"를 가리키게 된다. ("Hi"는 하나)

만약에, new를 사용한다면, "Hi"를 복사하기 때문에 2개나 생긴다.
따라서, literal를 사용하는 방법이 더 효율적이다.
 */
String a1 = "Hi";
String a2 = "Hi";

String a1 = new String("Hi");
String a2 = new String("Hi");
```
> [!IMPORTANT]
> `new` 키워드는 객체를 만들 때 사용한다. (나중에 배울 것이다...)<br>
> 문자열을 표현할 때는 첫 번째 방식, `literal` 표기 방식을 사용하는 것이 좋다.<br>
> `new`를 이용하면, 새로운 객체를 만들어야 하지만,<br>
> `literal`을 사용하면, `string constant pool`이라는 곳에 저장되어 다시 사용할 수 있어 효율적이다.<br>
> (재활용이 가능한 이유는, String의 값을 바꿀 수 없기 때문이다.(immutable))

### 원시 자료형
앞에서 정리했던, `int`, `long`, `double`, `float`, `char` 자료형은 원시(primitive) 자료형이라고 한다.<br>
이런 원시 자료형은 `new`키워드로 값을 생성할 수 없다.<br>
원시 자료형은 다음 리터럴 표기 방식으로만 값을 세팅할 수 있다.<br>
```java
boolean happy = "true";
int age = 0;
```
> [!NOTE]
> `String`은 `literal`표기 방식과 `new`방식 모두 사용할 수 있다.<br>
> `new`방식을 사용할 수 있기 때문에, 원시 자료형은 아니지만 `literal` 방식도 사용할 수 있는 특별대우를 받은 자료형이다.<br>

### 문자열 내장 메서드
String 자료형의 내장 메서드 문자열 객체에 속한 함수라 할 수 있다.<br>
- **equals**<br>
  문자열 2개가 같은지를 비교해 결괏값을 리턴한다.<br>
  ```java
  String a = "hello";
  String b = "java";
  String c = "hello";
  String newA = new String(a);

  System.out.println(a.equals(b)); // false
  System.out.println(a.equals(c)); // true
  System.out.println(a == newA);   // false
  ```
  > `==`는 2개의 자료형이 같은 객체인지를 판별할 때 사용하는 연산자이다.<br>
  > `a == c`를 하면, `true`가 되는데 그 이유는 위에서 말했듯이 둘 다 `string constant pool`에 있는 같은 객체를 가리키기 때문이다.<br>
  > 반대로, `new`를 해서 새로 만든 객체와 `a`는 다르기 때문에, `false`가 되는 것이다.
- **indexOf**<br>
  문자열에서 첫 번째로 나오는 특정 문자열이 시작되는 인덱스를 리턴한다.<br>
  없으면, `-1`리턴한다.<br>
  ```java
  String a = "Hello Java";
  System.out.println(a.indexOf("Java")); // 6
  System.out.println(a.indexOf("hi"));   // -1
  ```
- **contains**<br>
  문자열에서 특정 문자열이 포함되어 있는지 여부를 리턴한다.<br>
  ```java
  String a = "Hello Java";
  System.out.println(a.contains("Java")); // true
  System.out.println(a.contains("hi"));   // false
  ```
- **charAt**<br>
  문자열에서 인덱스에 해당하는 문자를 리턴한다.<br>
  (범위 밖은 에러가 생긴다.(IndexOutOfBounds))<br>
  ```java
  String a = "Hello Java";
  System.out.println(a.charAt(6)); // J
  ```
- **replaceAll**<br>
  문자열에서 특정 문자열을 모두 치환할 때 사용한다.<br>
  ```java
  String a = "Hello Java Hello";
  System.out.println(a.replaceAll("Hello", "Bye")); // Bye Java Bye
  ```
- **substring**<br>
  문자열에서 특정 문자열을 뽑아낼 때 사용한다.<br>
  시작 인덱스와 끝 인덱스를 인자로 주면 된다. (뽑히는 문자열은 [시작, 끝)이다. 끝 인덱스는 포함되지 않느다.)<br>
  ```java
  String a = "Hello Java";
  System.out.println(a.substring(0, 4)); // Hell
  ```
- **toUpperCase/toLowerCase**<br>
  문자열을 모두 대문자/소문자로 변경할 때 사용한다.<br>
  ```java
  String a = "Hello Java";
  System.out.println(a.toUpperCase()); // HELLO JAVA
  System.out.println(a.toLowerCase()); // hello java
  ```
- **split**<br>
  문자열을 특정한 구분자로 나누너 문자열 배열로 리턴한다.<br>
  ```java
  String a = "a:b:c:d";
  String[] result = a.split(":"); // {"a", "b", "c", "d"}
  ```

### 문자열 포맷팅
`String.format`메서드를 사용한다.<br>
(포맷팅된 문자열을 반환해준다.)<br>
```java
System.out.println(String.format("%s, You ate %d apples.", "euiclee", 42)); // euiclee, You ate 42 apples.
System.out.println(String.format("I have %s apples", 42)); // I have 42 apples
System.out.println(String.format("rate is %s", 3.234)); // rate is 3.234
```
> 포맷 코드는 C의 printf와 유사하다.<br>
> `%s` 포맷 코드는 어떤 형태의 값이든 변환해 넣을 수 있다. (자동으로 값을 문자열로 바꾸어 사용)<br>
  

### System.out.printf
`String.format`은 포맷팅된 문자열을 반환해줬다면, `System.out.printf` 포맷팅된 문자열을 출력한다.<br>
```java
System.out.printf("i eat %d apples.", 42); // i eat 3 apples 출력
```


### Reference
[03-04 문자열](https://wikidocs.net/205)<br>
[What is the difference between "text" and new String("text")?](https://stackoverflow.com/questions/3052442/what-is-the-difference-between-text-and-new-stringtext)<br>
