### 배열
```java
int[] primeNumbers = {2, 3, 5, 7, 11};
String[] friends = {"euiclee", "hyeoan", "jinheo"};
```
자료형의 집합이다.<br>
> `C/C++`에서는 `int primeNumbers[] = {2, 3, 5, 7, 11};`이었는데, `[]`의 위치 빼고 똑같은 걸 볼 수 있다.<br>

### 배열의 길이 설정하기
```java
int friendsCnt = 3;
String[] friends = new String[friendsCnt];

friends[0] = "euiclee";
friends[1] = "hyeoan";
friends[2] = "jinheo";
System.out.println(friends[0] + " " + friends[1] + " " + friends[2]); // euiclee hyeoan jinheo
```
배열의 길이를 먼저 설정한 뒤, 배열 변수를 생성하고 나중에 대입하는 방법이다.<br>

### 배열의 길이 구하기
```java
int friendsCnt = 3;
String[] friends = new String[friendsCnt];

friends[0] = "euiclee";
friends[1] = "hyeoan";
friends[2] = "jinheo";

/*
euiclee
hyeoan
jinheo
*/
for (int i = 0; i < friends.length; ++i) {
    System.out.println(friends[i]);
}
```
`배열명.length`를 통해 배열의 길이를 구할 수 있다.<br>

### Reference
[03-06 배열](https://wikidocs.net/206)<br>
