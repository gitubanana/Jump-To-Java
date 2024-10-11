### 정수
`int`, `long`, `short`, `byte`가 있다.
(`unsigned`도 있는 줄 알았는데 아니었다...)<br>
(`C/C++`과 비슷하다)<br>
```go
int age = 2147483647;
long countOfStar = 8764827384923849L;
```
> int 자료형을 벗어나는 정수는 접미사 L을 붙여줘야 한다.

### 실수
`float`, `double`이 있다.<br>
```go
float pi = 3.14F;
double morePi = 3.14159265358979323846;

double d1 = 123.4;
double d2 = 1.234e2; // 1.234*10^2은 123.4가 된다.
```
> 실수의 기본 자료형은 double이어서, float에 넣어줄 때는 접미사 F를 붙여줘야 한다.

### 2진수, 8진수, 16진수
2진수는 `0b`로 시작,<br>
8진수는 `0`로 시작,<br>
16진수는 `0x`로 시작하면 된다.<br>
```java
int binary = 0b1010; // 십진수로 표현하면, 2^3*1 + 2^2*0 + 2^1*1 + 2^0*0 = 10
int octal = 012;     // 십진수로 표현하면, 8^1*1 + 8^0*2 = 10
int hex = 0xA;       // 십진수로 표현하면, 16^0*10 = 10
```

> 4진수는 아직 못 찾았다...

### 숫자 연산
`+`, `-`, `*`, `/`, `%`연산을 할 수 있다.<br>
또한, `++`, `--`가 전위/후위 모두 된다. (`Go`는 후위만 가능하다...)<br>
비트 연산도 `C/C++`과 비슷하다.<br>
자바에는 `>>>` 비트 쉬프트도 있다.<br>
(부호 비트도 옮겨진다.)<br>


### Reference
[03-01 숫자](https://wikidocs.net/204)<br>
[what does ">>>" mean in java?](https://stackoverflow.com/questions/19058859/what-does-mean-in-java)<br>
[Why doesn't Java support unsigned ints?](https://stackoverflow.com/questions/430346/why-doesnt-java-support-unsigned-ints)<br>
