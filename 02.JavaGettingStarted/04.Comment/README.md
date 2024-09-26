> 자바 코드에 코드의 설명을 적을 수 있는데, 이걸 주석(Comment)라고 한다.<br>
> 컴파일할 때 주석은 자동으로 바이너리 코드에서 제거된다.<br>
> 두 가지 종류의 주석이 있다. (C/C++과 동일하다.)<br>

### 블록 주석
`/*`이 주석의 시작, `*/`이 주석의 끝이다.<br>
코드에서 블록 단위(클래스, 메서드 등)로 설명할 때 사용한다.<br>
```java
/*
이 프로그램은 2024.09.26에 태어났습니다.
이 프로그램의 저작권은 없습니다.
*/
public class HelloWorld {
  ...
```

### 라인 주석
`//`이 시작된 곳부터 라인의 끝까지 주석이 된다.<br>
특정 코드 한 줄을 설명할 때 사용한다.<br>
```java
BasketballPlayer james;
BasketballPlayer love;

james.dunkInYourFace(love); // james가 love에게 덩크
```

### 주석은
누구나 알 만한 내용은 쓰지 않는 게 좋다.<br>
코드가 바뀌면 업데이트해야 한다.<br>

> [!IMPORTANT]
> 주석이 없어도 이해하기 쉽고 명확한 코드가 제일 좋다! (제일 어렵다...!)

### Reference
[02-04 주석이란?](https://wikidocs.net/260)<br>
