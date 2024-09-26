> true 또는 false의 값을 갖는 자료형을 boolean이라고 한다.

### boolean 연산
boolean 자료형에는 boolean 연산의 결괏값을 대입할 수 있다.<br>
조건문의 판단 기준으로 사용한다.<br>
```java
2 > 1 // true
-2147483648 >> 1 == -1073741824 // true (10000000 ... -> 11000000 ...)이 되어 -1073741824이 된다.
-2147483648 >>> 1 == -1073741824  // false (10000000 ... -> 01000000 ...)이 되어 1073741824이 된다.
"3".eqauls("2") // false
```
```java
int jordanWinCnt = 6;
int lebronWinCnt = 4;
boolean jordanIsBetterThanLebron = jordanWinCnt > lebronWinCnt;

if (jordanIsBetterThanLebron) {
  System.out.println("Jordan is GOAT"); // boolean이 true이기 때문에, 출력된다.
}
```

### Reference
[03-02 불](https://wikidocs.net/220)<br>
[what does ">>>" mean in java?](https://stackoverflow.com/questions/19058859/what-does-mean-in-java)<br>
