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
a1과 a2는 string constant pool에 있는 "Hi"를 가리키게 된다. ("Hi"는 하나)

만약에, new를 사용한다면, "Hi"를 복사하기 때문에 2개나 생긴다.
따라서, literal를 사용하는 방법이 더 효율적인 것이다.
 */
String a1 = "Hi";
String a2 = "Hi";

String a1 = new String("Hi");
String a2 = new String("Hi");
```
> [!IMPORTANT]
> `new` 키워드는 객체를 만들 때 사용한다. (나중에 배울 것이다...)<br>
> 문자열을 표현할 때는 첫 번째 방식, `literal` 표기 방식을 사용하는 것이 좋다.<br>
> new를 이용하면, 새로운 객체를 만들어야 하지만,<br>
> literal을 사용하면, `string constant pool`이라는 곳에 저장되어 다시 사용할 수 있어 효율적이다.<br>
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
> `String`은 literal표기 방식과 new방식 모두 사용할 수 있다.<br>
> `new`방식을 사용할 수 있기 때문에, 원시 자료형은 아니지만 literal 방식도 사용할 수 있는 특별대우를 받은 자료형이다.<br>

### Reference
[03-04 문자열](https://wikidocs.net/205)<br>
[What is the difference between "text" and new String("text")?](https://stackoverflow.com/questions/3052442/what-is-the-difference-between-text-and-new-stringtext)<br>
