### 클래스 이름 짓기
클래스명은 `명사`로 한다.<br>
`PascalCase`로 짓는다.<br>
```java
class Player {}
class BasketballPlayer {}
```

### 메서드 이름 짓기
메서드명은 `동사`로 한다.<br>
`camelCase`로 짓는다.<br>
```java
class BasketballPlayer {
  public static bool run() {
    ...
  }

  public static bool dunkInYourFace() {
    ...
  }
}
```

### 변수 이름 짓기
의미가 있어야 한다. (변수명만 봐도 사용한 이유를 알 수 있게...! 제일 어려운 부분이다...)<br>
`_`, `$`를 시작 문자로 사용하는 것은 지양하자.<br>
```go
String userName;
float lineWidth;
int i; // 주로 반복문에서 사용
```


### Reference
[02-03 이름 짓는 규칙](https://wikidocs.net/1936)<br>
